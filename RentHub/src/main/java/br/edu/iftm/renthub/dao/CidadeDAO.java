package br.edu.iftm.renthub.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.iftm.renthub.view.RegistrosLog;

public class CidadeDAO {
    private final Connection conexaoBanco;

    RegistrosLog log = new RegistrosLog();

    public CidadeDAO(Connection conexao) {
        this.conexaoBanco = conexao;
    }

    public boolean verificarExistencia(String ibge) throws SQLException {
        log.registrarLog(1, "CidadeDAO", "verificarExistencia", "cidade", "Verificando se a cidade existe");
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT nome ");
        sql.append("FROM cidade ");
        sql.append("WHERE id_ibge = ? ");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(sql.toString())) {
            stmt.setString(1, ibge);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                log.registrarLog(2, "CidadeDAO", "verificarExistencia", "", "Cidade encontrada no banco de dados");
                return true;
            } else {
                log.registrarLog(3, "CidadeDAO", "verificarExistencia", "", "Cidade não encontrada no banco de dados");
                return false;
            }
        } catch (SQLException e) {
            log.registrarLog(4, "CidadeDAO", "verificarExistencia", "", "Erro ao consultar a cidade: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean cadastrar(String ibge, String cidade, String estado) throws SQLException {
        log.registrarLog(1, "CidadeDAO", "cadastrar", "cidade", "Cadastrando a cidade no banco de dados");
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO cidade (id_ibge, nome, uf) ");
        sql.append("VALUES (?, ?, ?) ");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(sql.toString())) {
            stmt.setString(1, ibge);
            stmt.setString(2, cidade);
            stmt.setString(3, estado);
            stmt.executeUpdate();
            log.registrarLog(2, "CidadeDAO", "cadastrar", "cidade", "Cidade cadastrada no banco de dados");
            return true;
        } catch (SQLException e) {
            log.registrarLog(4, "CidadeDAO", "cadastrar", "cidade", "Erro ao cadastrar a cidade no Banco de Dados: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
