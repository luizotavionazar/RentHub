package br.edu.iftm.renthub.control;

import java.sql.Connection;
//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

import br.edu.iftm.renthub.dao.ClienteDAO;
import br.edu.iftm.renthub.model.Cliente;
import br.edu.iftm.renthub.view.RegistrosLog;

public class ClienteController {
    private ClienteDAO clienteDAO;
    private EnderecoController enderecoController;

    public ClienteController(Connection conexao) {
        this.clienteDAO = new ClienteDAO(conexao);
        this.enderecoController = new EnderecoController(conexao);
    }

    RegistrosLog log = new RegistrosLog();

    public Integer cadastrar(Cliente cliente) {
        log.registrarLog(1, "ClienteController", "cadastrar", "cliente", "Cadastrando o cliente: " + cliente.getNome());
        try {
            cliente.getEndereco().setId(enderecoController.cadastrar(cliente.getEndereco()));
            if (cliente.getEndereco().getId() != null) {
                    return clienteDAO.cadastrar(cliente.getNome(), cliente.getDocumento(), cliente.getTelefone(), cliente.getEndereco().getId());
                } else {
                    log.registrarLog(3, "ClienteController", "cadastrar", "cliente", "Cliente: " + cliente.getNome() + " não cadastrado");
                    return null;
                }
        } catch (Exception e) {
            log.registrarLog(4, "ClienteController", "cadastrar", "cliente", "Erro ao cadastrar o cliente: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public boolean alterar(Integer id, Cliente clienteAlterado) {
        log.registrarLog(1, "ClienteController", "alterar", "cliente", "Alterando o cliente: " + id);
        try {
            if (clienteDAO.alterar(id, clienteAlterado.getNome(), clienteAlterado.getDocumento(), clienteAlterado.getTelefone(), clienteAlterado.getEndereco().getId())) {
                log.registrarLog(2, "ClienteController", "alterar", "cliente", "Cliente" + id + " alterado com sucesso");
                return true;
            } else {
                log.registrarLog(3, "ClienteController", "alterar", "cliente", "Falha ao alterar o cliente: " + id);
                return false;
            }
        } catch (Exception e) {
            log.registrarLog(4, "ClienteController", "alterar", "cliente", "Erro ao alterar cliente: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean deletar(Integer id) {
        log.registrarLog(1, "ClienteController", "deletar", "cliente", "Deletando o cliente: " + id);
        try {
            if (clienteDAO.deletar(id)) {
                log.registrarLog(2, "ClienteController", "deletar", "cliente", "Cliente: " + id + " deletado com sucesso");
                return true;
            } else {
                log.registrarLog(3, "ClienteController", "deletar", "cliente", "Falha ao deletar o cliente: " + id);
                return false;
            }
        } catch (Exception e) {
            log.registrarLog(4, "ClienteController", "deletar", "cliente", "Erro ao deletar o cliente:" + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public Cliente buscarPorId(Integer id) {
        log.registrarLog(1, "ClienteController", "buscarPorId", "cliente", "Buscando o cliente: " + id);
        try {
            Cliente cliente = clienteDAO.buscarPorId(id);
            if (cliente != null) {
                log.registrarLog(2, "ClienteController", "buscarPorId", "cliente", "Cliente encontrado: " + cliente.getNome());
            } else {
                log.registrarLog(3, "ClienteController", "buscarPorId", "cliente", "Cliente: " + id + " não encontrado");
            }
            return cliente;
        } catch (Exception e) {
            log.registrarLog(4, "ClienteController", "buscarPorId", "cliente", "Erro ao buscar cliente: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public List<Cliente> listar(Cliente clienteFiltro) {
        log.registrarLog(1, "ClienteController", "listarClientes", "cliente", "Iniciando listagem de clientes com filtros");
        StringBuilder filtroQuery = new StringBuilder();
        List<Object> filtros = new ArrayList<>();
        if (clienteFiltro.getNome() != null && !clienteFiltro.getNome().trim().isEmpty()) {
            filtroQuery.append(" AND c.nome LIKE ?");
            filtros.add("%" + clienteFiltro.getNome().trim() + "%");
        }
        if (clienteFiltro.getDocumento() != null && !clienteFiltro.getDocumento().trim().isEmpty()) {
            filtroQuery.append(" AND c.documento = ?");
            filtros.add(clienteFiltro.getDocumento().trim());
        }
        return clienteDAO.listar(filtroQuery.toString(), filtros);
    }
}
