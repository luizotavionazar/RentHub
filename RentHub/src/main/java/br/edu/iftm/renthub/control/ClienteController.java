package br.edu.iftm.renthub.control;

import java.sql.Connection;
//import java.util.ArrayList;

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

    public boolean cadastrar(Cliente cliente) {
        log.registrarLog(1, "ClienteController", "cadastrar", "cliente", "Cadastrando o cliente: " + cliente.getNome());
        try {
            if (enderecoController.cadastrar(cliente.getEndereco())) {
                if (clienteDAO.cadastrar(cliente.getNome(), cliente.getDocumento(), cliente.getTelefone(), cliente.getEndereco().getId())) {
                    log.registrarLog(2, "ClienteController", "cadastrar", "cliente", "Cliente: " + cliente.getNome() + " cadastrado com sucesso");
                    return true;
                } else {
                    log.registrarLog(3, "ClienteController", "cadastrar", "cliente", "Cliente: " + cliente.getNome() + " não cadastrado");
                    return false;
                }
            } else {
                log.registrarLog(3, "ClienteController", "cadastrar", "cliente", "Falha ao cadastrar o endereço do cliente: " + cliente.getNome() + ". Cadastrado não realizado");
                return false;
            }
        } catch (Exception e) {
            log.registrarLog(4, "ClienteController", "cadastrar", "cliente", "Erro ao cadastrar o cliente: " + e.getMessage());
            e.printStackTrace();
            return false;
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
    // public ArrayList<Cliente> listarClientes () {
    // return clienteDAO.listar();
    // }
    // public Cliente verificarCPF (String cpf) {
    // return clienteDAO.verificarCPF(cpf);
    // }
}
