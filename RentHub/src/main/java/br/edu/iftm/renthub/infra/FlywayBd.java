package br.edu.iftm.renthub.infra;

import java.io.InputStream;
import java.util.Properties;

import org.flywaydb.core.Flyway;

import br.edu.iftm.renthub.view.RegistrosLog;

public class FlywayBd {
    public static void migrarBanco() {
        RegistrosLog log = new RegistrosLog();
        log.registrarLog(1, "FlywayBd", "migrarBanco", "", "Iniciando migração do banco de dados");
        try (InputStream dados = FlywayBd.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties login = new Properties();
            login.load(dados);
            Flyway flyway = Flyway.configure()
                                  .dataSource(login.getProperty("db.url"),
                                              login.getProperty("db.username"),
                                              login.getProperty("db.password"))
                                  .locations("classpath:db/migration")
                                  .load();
            flyway.migrate();
            log.registrarLog(2, "FlywayBd", "migrarBanco", "", "Migração do banco de dados concluída com sucesso");
        } catch (Exception e) {
            log.registrarLog(4, "FlywayBd", "migrarBanco", "", "Erro ao migrar o banco de dados: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
