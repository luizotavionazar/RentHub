-- Criar banco de dados
CREATE DATABASE Aluguel;
USE Aluguel;

-- Tabela cliente
CREATE TABLE cliente (
	id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(45) NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    telefone VARCHAR(11) NOT NULL,
    endereco VARCHAR(60)
);

-- Tabela equipamento
CREATE TABLE equipamento (
	id_equip INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(60) NOT NULL,
    vlr_diaria DOUBLE NOT NULL,
    vlr_mensal DOUBLE NOT NULL,
    qtd_total INT NOT NULL,
    qtd_disponivel INT NOT NULL DEFAULT 0
);

-- Trigger para preencher qtd_disponivel com qtd_total ao inserir
DELIMITER $$

CREATE TRIGGER trigger_preencher_qtd_disponivel
BEFORE INSERT ON equipamento
FOR EACH ROW
BEGIN
	SET NEW.qtd_disponivel = NEW.qtd_total;
END;
$$

DELIMITER ;

-- Tabela contrato
CREATE TABLE contrato (
    id_contrato INT AUTO_INCREMENT PRIMARY KEY,
	tipo INT NOT NULL,
    id_cliente INT,
    id_equip INT,
	qtd_equip INT NOT NULL,
    data_inicio DATE NOT NULL,
    data_fim DATE NOT NULL,
    data_entrega DATE,
    status CHAR(1) NOT NULL DEFAULT 'A',
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente) ON DELETE SET NULL,
    FOREIGN KEY (id_equip) REFERENCES equipamento(id_equip) ON DELETE SET NULL
);

-- Trigger para diminuir qtd_disponivel após aluguel
DELIMITER $$

CREATE TRIGGER trigger_atualizar_qtd_disponivel
AFTER INSERT ON contrato
FOR EACH ROW
BEGIN
    UPDATE equipamento
    SET qtd_disponivel = qtd_disponivel - NEW.qtd_equip
    WHERE id_equip = NEW.id_equip;
END;
$$

DELIMITER ;

-- Trigger para devolver equipamentos ao finalizar aluguel
DELIMITER $$

CREATE TRIGGER trigger_devolver_qtd_disponivel
AFTER UPDATE ON contrato
FOR EACH ROW
BEGIN
    IF OLD.status = 'A' AND NEW.status <> 'A' THEN
        UPDATE equipamento
        SET qtd_disponivel = qtd_disponivel + OLD.qtd_equip
        WHERE id_equip = OLD.id_equip;
    END IF;
END;
$$

DELIMITER ;

-- Trigger para ajustar qtd_disponivel quando qtd_total for alterado
DELIMITER $$

CREATE TRIGGER trigger_ajustar_qtd_disponivel
BEFORE UPDATE ON equipamento
FOR EACH ROW
BEGIN
    IF OLD.qtd_total <> NEW.qtd_total THEN
        SET NEW.qtd_disponivel = OLD.qtd_disponivel + (NEW.qtd_total - OLD.qtd_total);
        IF NEW.qtd_disponivel < 0 THEN
            SET NEW.qtd_disponivel = 0;
        END IF;
    END IF;
END;
$$

DELIMITER ;

-- Tabela totalização
CREATE TABLE totalizacao (
	id_tot INT AUTO_INCREMENT PRIMARY KEY,
	id_contrato INT NOT NULL UNIQUE,
    valor DOUBLE NOT NULL,
	multa DOUBLE,
	juros DOUBLE,
	vlr_total DOUBLE NOT NULL,
	FOREIGN KEY (id_contrato) REFERENCES contrato(id_contrato)
);