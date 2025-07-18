package br.edu.iftm.renthub.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

import br.edu.iftm.renthub.model.Cidade;
import br.edu.iftm.renthub.model.Cliente;
import br.edu.iftm.renthub.model.Endereco;
import br.edu.iftm.renthub.view.RegistrosLog;

public class ClienteDAO {
    private final Connection conexaoBanco;

    public ClienteDAO(Connection conexao) {
        this.conexaoBanco = conexao;
    }

    RegistrosLog log = new RegistrosLog();

    public Integer cadastrar(String nome, String documento, String telefone, Integer idEndereco) {
        log.registrarLog(1, "ClienteDAO", "cadastrar", "cliente", "Cadastrando o Cliente no Banco de Dados");
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO cliente (nome, documento, telefone, id_endereco) ");
        query.append("VALUES (?, ?, ?, ?)");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(query.toString(), PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, nome);
            stmt.setString(2, documento);
            stmt.setString(3, telefone);
            stmt.setInt(4, idEndereco);
            stmt.executeUpdate();
            log.registrarLog(2, "ClienteDAO", "cadastrar", "cliente", "Cliente cadastrado no Banco de Dados com sucesso");
            Integer idCli = null;
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    idCli = rs.getInt(1);
                    return idCli;
                } else {
                    return null;
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        } catch (SQLException e) {
            log.registrarLog(4, "ClienteDAO", "cadastrar", "cliente", "Erro ao cadastrar o cliente no Banco de Dados: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public boolean alterar(Integer id, String nome, String cpf, String telefone, Integer idEndereco) {
        log.registrarLog(1, "ClienteDAO", "alterar", "cliente", "Alterando o Cliente no Banco de Dados");
        StringBuilder query = new StringBuilder();
        query.append("UPDATE cliente ");
        query.append("SET nome = ?, cpf = ?, telefone = ?, id_endereco = ? ");
        query.append("WHERE id = ?");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(query.toString())) {
            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            stmt.setString(3, telefone);
            stmt.setInt(4, idEndereco);
            stmt.setInt(5, id);
            stmt.executeUpdate();
            log.registrarLog(2, "ClienteDAO", "alterar", "cliente", "Cliente alterado no Banco de Dados com sucesso");
            return true;
        } catch (SQLException e) {
            log.registrarLog(4, "ClienteDAO", "alterar", "cliente", "Erro ao alterar o cliente no Banco de Dados: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }


    public boolean deletar(Integer id) {
        log.registrarLog(1, "ClienteDAO", "deletar", "cliente", "Deletando o cliente do Banco de Dados");
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM cliente ");
        query.append("WHERE id = ?");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(query.toString())) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            log.registrarLog(2, "ClienteDAO", "deletar", "cliente", "Cliente deletado do Banco de Dados com sucesso");
            return true;
        } catch (SQLException e) {
            log.registrarLog(4, "ClienteDAO", "deletar", "cliente", "Erro ao deletar o cliente do Banco de Dados: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public Cliente buscarPorId(Integer id) {
        log.registrarLog(1, "ClienteDAO", "buscarPorId", "cliente", "Buscando cliente pelo ID no Banco de Dados");
        StringBuilder query = new StringBuilder();
        query.append("SELECT c.id, c.nome, c.cpf, c.telefone, e.id AS id_endereco, e.cep, e.logradouro, e.bairro, e.numero, e.complemento, ci.id AS id_cidade, ci.nome AS nome_cidade, ci.uf ");
        query.append("FROM cliente c ");
        query.append("JOIN endereco e ON c.id_endereco = e.id ");
        query.append("JOIN cidade ci ON e.id_ibge = ci.id_ibge ");
        query.append("WHERE c.id = ?");
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(query.toString())) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Cidade cidade = new Cidade(
                    rs.getString("id_cidade"),
                    rs.getString("nome_cidade"),
                    rs.getString("uf"));
                Endereco endereco = new Endereco(
                    rs.getString("cep"),
                    cidade,
                    rs.getString("logradouro"),
                    rs.getString("bairro"));
                endereco.setId(rs.getInt("id_endereco"));
                endereco.setNumero(rs.getInt("numero"));
                endereco.setComplemento(rs.getString("complemento"));
                Cliente cliente = new Cliente(
                    rs.getString("nome"),
                    rs.getString("cpf"),
                    rs.getString("telefone"),
                    endereco);
                cliente.setId(rs.getInt("id"));
                log.registrarLog(2, "ClienteDAO", "buscarPorId", "cliente", "Cliente encontrado no Banco de Dados com sucesso");
                return cliente;
            } else {
                log.registrarLog(3, "ClienteDAO", "buscarPorId", "cliente", "Cliente não encontrado no Banco de Dados");
                return null;
            }
        } catch (SQLException e) {
            log.registrarLog(4, "ClienteDAO", "buscarPorId", "cliente", "Erro ao buscar o cliente no Banco de Dados: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public List<Cliente> listar(String filtroQuery, List<Object> filtros) {
        log.registrarLog(1, "ClienteDAO", "listarClientes", "cliente", "Buscando clientes no banco de dados");
        StringBuilder query = new StringBuilder();
        query.append("SELECT c.id, c.nome, c.documento ");
        query.append("FROM cliente c ");
        query.append("WHERE 1=1 ");
        query.append(filtroQuery);
        query.append(" ORDER BY c.nome ASC");
        List<Cliente> clientes = new ArrayList<>();
        try (PreparedStatement stmt = conexaoBanco.prepareStatement(query.toString())) {
            for (int i = 0; i < filtros.size(); i++) {
                stmt.setObject(i + 1, filtros.get(i));
            }
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setDocumento(rs.getString("documento"));
                clientes.add(cliente);
            }
            if (clientes.isEmpty()) {
                log.registrarLog(3, "ClienteDAO", "listarClientes", "cliente", "Nenhum cliente encontrado");
            } else {
                log.registrarLog(2, "ClienteDAO", "listarClientes", "cliente", "Clientes encontrados: " + clientes.size());
            }
            return clientes;
        } catch (SQLException e) {
            log.registrarLog(4, "ClienteDAO", "listarClientes", "cliente", "Erro ao buscar clientes: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
