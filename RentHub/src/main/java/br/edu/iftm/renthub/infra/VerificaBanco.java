package br.edu.iftm.renthub.infra;

import br.edu.iftm.renthub.view.RegistrosLog;

import java.io.InputStream;

import java.util.Properties;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class VerificaBanco {
    public static void criarBanco() {
        RegistrosLog log = new RegistrosLog();
        try (InputStream dados = VerificaBanco.class.getClassLoader().getResourceAsStream("config.properties")) {
            log.registrarLog(1, "VerificaBanco", "criarBanco", "", "Iniciando verificação/criação do banco de dados");
            Properties login = new Properties();
            login.load(dados);
            String urlSemBanco = login.getProperty("db.url").replaceAll("/[a-zA-Z0-9_]+(\\?.*)?$", "/");
            String user = login.getProperty("db.user");
            String senha = login.getProperty("db.password");
            try (Connection conexao = DriverManager.getConnection(urlSemBanco, user, senha);
                 Statement stmt = conexao.createStatement()) {
                    stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS aluguel CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci");
                    log.registrarLog(2, "VerificaBanco", "criarBanco", "", "Banco de dados verificado/criado com sucesso");
            } catch (SQLException e) {
                log.registrarLog(4, "VerificaBanco", "criarBanco", "", "Erro ao criar/verificar banco de dados: " + e.getMessage());
                throw e;
            }
        } catch (Exception e) {
            log.registrarLog(4, "VerificaBanco", "criarBanco", "", "Erro ao carregar propriedades ou criar banco de dados: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
