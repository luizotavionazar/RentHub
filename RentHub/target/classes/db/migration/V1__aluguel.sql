-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
-- -----------------------------------------------------
-- Schema aluguel
-- -----------------------------------------------------
USE `aluguel` ;

-- -----------------------------------------------------
-- Table `aluguel`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aluguel`.`usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `senha` VARCHAR(60) NOT NULL,
  `email` VARCHAR(60) NULL,
  `anexo` BLOB NULL,
  `data_registro` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_usuario_nome` (`nome`));


-- -----------------------------------------------------
-- Table `aluguel`.`cidade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aluguel`.`cidade` (
  `id_ibge` VARCHAR(7) NOT NULL,
  `nome` VARCHAR(100) NULL,
  `uf` VARCHAR(2) NOT NULL,
  `data_registro` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_ibge`));


-- -----------------------------------------------------
-- Table `aluguel`.`endereco`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aluguel`.`endereco` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cep` VARCHAR(8) NOT NULL,
  `id_ibge` VARCHAR(7) NOT NULL,
  `logradouro` VARCHAR(150) NULL,
  `bairro` VARCHAR(60) NULL,
  `numero` INT NULL,
  `complemento` VARCHAR(150) NULL,
  `data_registro` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  INDEX `fk_endereco_cidade_idx` (`id_ibge` ASC) VISIBLE,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_endereco_cidade`
    FOREIGN KEY (`id_ibge`)
    REFERENCES `aluguel`.`cidade` (`id_ibge`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `aluguel`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aluguel`.`cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `documento` VARCHAR(14) NOT NULL,
  `telefone` VARCHAR(11) NOT NULL,
  `id_endereco` INT NOT NULL,
  `data_registro` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `documento` (`documento` ASC) VISIBLE,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_cliente_endereco1_idx` (`id_endereco` ASC) VISIBLE,
  CONSTRAINT `fk_cliente_endereco1`
    FOREIGN KEY (`id_endereco`)
    REFERENCES `aluguel`.`endereco` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `aluguel`.`contrato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aluguel`.`contrato` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_cliente` INT NOT NULL,
  `tipo` ENUM('DIARIO', 'MENSAL') NOT NULL,
  `status` ENUM('ATIVO', 'FINALIZADO', 'CANCELADO') NOT NULL DEFAULT 'ATIVO',
  `data_inicio` DATE NOT NULL,
  `data_fim` DATE NOT NULL,
  `data_entrega` DATE NULL,
  `data_registro` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  INDEX `fk_contrato_cliente1_idx` (`id_cliente` ASC) VISIBLE,
  CONSTRAINT `fk_contrato_cliente1`
    FOREIGN KEY (`id_cliente`)
    REFERENCES `aluguel`.`cliente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `aluguel`.`equipamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aluguel`.`equipamento` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(70) NOT NULL,
  `valor_diaria` DOUBLE NOT NULL,
  `valor_mensal` DOUBLE NOT NULL,
  `qtd_total` INT NOT NULL,
  `qtd_disponivel` INT NOT NULL DEFAULT '0',
  `data_registro` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 12
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `aluguel`.`totalizacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aluguel`.`totalizacao` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_contrato` INT NOT NULL,
  `valor` DOUBLE NOT NULL,
  `juros` DOUBLE NULL DEFAULT NULL,
  `multa` DOUBLE NULL DEFAULT NULL,
  `data_registro` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`, `id_contrato`),
  INDEX `fk_totalizacao_contrato1_idx` (`id_contrato` ASC) VISIBLE,
  CONSTRAINT `fk_totalizacao_contrato1`
    FOREIGN KEY (`id_contrato`)
    REFERENCES `aluguel`.`contrato` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `aluguel`.`equipamento_contrato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aluguel`.`equipamento_contrato` (
  `id_contrato` INT NOT NULL,
  `id_equipamento` INT NOT NULL,
  `quantidade` INT NOT NULL,
  PRIMARY KEY (`id_contrato`, `id_equipamento`),
  INDEX `fk_equipamento_has_contrato_contrato1_idx` (`id_contrato` ASC) VISIBLE,
  INDEX `fk_equipamento_has_contrato_equipamento1_idx` (`id_equipamento` ASC) VISIBLE,
  CONSTRAINT `fk_equipamento_has_contrato_equipamento1`
    FOREIGN KEY (`id_equipamento`)
    REFERENCES `aluguel`.`equipamento` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_equipamento_has_contrato_contrato1`
    FOREIGN KEY (`id_contrato`)
    REFERENCES `aluguel`.`contrato` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

DELIMITER $$

CREATE
TRIGGER `aluguel`.`trigger_preencher_qtd_disponivel`
BEFORE INSERT ON `aluguel`.`equipamento`
FOR EACH ROW
BEGIN
	SET NEW.qtd_disponivel = NEW.qtd_total;
END$$

CREATE
TRIGGER `aluguel`.`trigger_ajustar_qtd_disponivel`
BEFORE UPDATE ON `aluguel`.`equipamento`
FOR EACH ROW
BEGIN
    IF OLD.qtd_total <> NEW.qtd_total THEN
        SET NEW.qtd_disponivel = OLD.qtd_disponivel + (NEW.qtd_total - OLD.qtd_total);
        IF NEW.qtd_disponivel < 0 THEN
            SET NEW.qtd_disponivel = 0;
        END IF;
    END IF;
END$$

CREATE DEFINER = CURRENT_USER TRIGGER `aluguel`.`equipamento_contrato_AFTER_INSERT` 
AFTER INSERT ON `equipamento_contrato` 
FOR EACH ROW
BEGIN
	UPDATE equipamento
		SET qtd_disponivel = qtd_disponivel - NEW.quantidade
		WHERE id_equipamento = NEW.id_equipamento;
END$$

CREATE DEFINER = CURRENT_USER TRIGGER `aluguel`.`equipamento_contrato_AFTER_DELETE` 
AFTER DELETE ON `equipamento_contrato` 
FOR EACH ROW
BEGIN
	UPDATE equipamento
    SET qtd_disponivel = qtd_disponivel + OLD.quantidade
    WHERE id_equipamento = OLD.id_equipamento;
END$$

DELIMITER ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
