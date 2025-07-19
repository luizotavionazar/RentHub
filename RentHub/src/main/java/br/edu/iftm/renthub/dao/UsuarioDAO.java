package br.edu.iftm.renthub.dao;

import br.edu.iftm.renthub.view.RegistrosLog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    private final Connection conexaoBanco;
    
    public UsuarioDAO(Connection conexao) {
        this.conexaoBanco = conexao;
    }

    RegistrosLog log = new RegistrosLog();

    public boolean cadastrar(String nomeUsuario, String senhaCrip) throws SQLException {
        log.registrarLog(1, "UsuarioDAO", "cadastrar", "usuario", "Cadastrando o usuário no Banco de Dados");
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO usuario (nome, senha) ");
        query.append("VALUES (?, ?) ");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(query.toString(), PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, nomeUsuario);
            stmt.setString(2, senhaCrip);
            stmt.executeUpdate();
            log.registrarLog(2, "UsuarioDAO", "cadastrar", "usuario", "Usuário cadastrado no Banco de Dados com sucesso");
            return true;
        } catch (SQLException e) {
            log.registrarLog(4, "UsuarioDAO", "cadastrar", "usuario", "Erro ao cadastrar o usuário no Banco de Dados: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public String buscarSenha(String nomeUsuario) throws SQLException {
        log.registrarLog(1, "UsuarioDAO", "buscarSenha", "usuario", "Buscando a senha do usuário no Banco de Dados");
        StringBuilder query = new StringBuilder();
        query.append("SELECT senha ");
        query.append("FROM usuario ");
        query.append("WHERE nome = ?");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(query.toString())) {
            stmt.setString(1, nomeUsuario);
            var rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("senha");
            } else {
                log.registrarLog(3, "UsuarioDAO", "buscarSenha", "usuario", "Não foi possivel encontrar a senha do usuário no Banco de Dados");
                return null;
            }
        } catch (SQLException e) {
            log.registrarLog(4, "UsuarioDAO", "buscarSenha", "usuario", "Erro ao buscar a senha do usuário no Banco de Dados: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public String buscarNome(String nomeUsuario) throws SQLException {
        log.registrarLog(1, "UsuarioDAO", "buscarUsuario", "usuario", "Buscando o usuário no Banco de Dados");
        StringBuilder query = new StringBuilder();
        query.append("SELECT nome ");
        query.append("FROM usuario ");
        query.append("WHERE nome = ?");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(query.toString())) {
            stmt.setString(1, nomeUsuario);
            var rs = stmt.executeQuery();
            if (rs.next()) {
                log.registrarLog(2, "UsuarioDAO", "buscarUsuario", "usuario", "Usuário localizado no Banco de Dados");
                return rs.getString("nome");
            } else {
                log.registrarLog(3, "UsuarioDAO", "buscarUsuario", "usuario", "Usuário não está cadastrado no Banco de Dados");
                return null;
            }
        } catch (SQLException e) {
            log.registrarLog(4, "UsuarioDAO", "buscarUsuario", "usuario", "Erro ao buscar o usuário no Banco de Dados: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
