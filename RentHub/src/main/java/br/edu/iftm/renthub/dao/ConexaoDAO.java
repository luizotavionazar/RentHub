package br.edu.iftm.renthub.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import br.edu.iftm.renthub.view.RegistrosLog;
import br.edu.iftm.renthub.infra.FlywayBd;
import br.edu.iftm.renthub.infra.VerificaBanco;

public class ConexaoDAO {
    static RegistrosLog log = new RegistrosLog();

    private static String URL;
    private static String USER;
    private static String PASSWORD;
    private static Connection conexao;

    static {
        VerificaBanco.criarBanco();
        FlywayBd.migrarBanco();
        try (InputStream dados = ConexaoDAO.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties login = new Properties();
            login.load(dados);
            URL = login.getProperty("db.url");
            USER = login.getProperty("db.user");
            PASSWORD = login.getProperty("db.password");
        } catch (Exception e) {
            log.registrarLog(4, "ConexaoDAO", "conexaoBd", "", "Erro ao obter os dados para conectar ao Banco de Dados");
            throw new RuntimeException(e);
        }
    }

    public static synchronized Connection conexaoBd() throws SQLException {
        log.registrarLog(1, "ConexaoDAO", "conexaoBd", "", "Iniciando conexão com o Banco de Dados");
        if (conexao == null || conexao.isClosed()) {
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);
            log.registrarLog(2, "ConexaoDAO", "conexaoBd", "", "Conexão com o Banco de Dados estabelecida com sucesso");
        }
        return conexao;
    }
}
