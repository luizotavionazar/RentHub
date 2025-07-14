package br.edu.iftm.renthub.infra;

import br.edu.iftm.renthub.view.RegistrosLog;
import java.io.InputStream;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class VerificaBanco {
    private static String URL;
    private static String USER;
    private static String PASSWORD;

    public static void criarBanco() {
        RegistrosLog log = new RegistrosLog();
        try (InputStream dados = VerificaBanco.class.getClassLoader().getResourceAsStream("config.properties")) {
            log.registrarLog(1, "VerificaBanco", "criarBanco", "", "Iniciando verificação/criação do banco de dados");
            Properties login = new Properties();
            login.load(dados);
            URL = login.getProperty("db.url").replaceAll("/[a-zA-Z0-9_]+(\\?.*)?$", "/");
            USER = login.getProperty("db.user");
            PASSWORD = login.getProperty("db.password");
            try (Connection conexao = DriverManager.getConnection(URL, USER, PASSWORD);
                 Statement stmt = conexao.createStatement()) {
                    stmt.executeUpdate("CREATE SCHEMA IF NOT EXISTS `aluguel` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci");
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
