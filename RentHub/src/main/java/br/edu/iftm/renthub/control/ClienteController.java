package br.edu.iftm.renthub.control;

import java.util.ArrayList;

import br.edu.iftm.renthub.dao.ClienteDAO;
import br.edu.iftm.renthub.model.Cliente;

public class ClienteController {
    private ClienteDAO clienteDAO = new ClienteDAO();

    public String CadastrarCliente (String nome, String cpf, String telefone, String endereco) {
        Cliente cliente = new Cliente(nome, cpf, telefone, endereco);
        return clienteDAO.CadastrarCliente(cliente);
    }

    public ArrayList<Cliente> listarClientes () {
        return clienteDAO.listarClientes();
    }

    public String alterarCliente (int id, String coluna, String valor) {
        return clienteDAO.alterarCliente(id, coluna, valor);
    }

    public Cliente verificarCPF (String cpf) {
        return clienteDAO.verificarCPF(cpf);
    }

    public String deletarCliente (String cpf) {
        return clienteDAO.deletarCliente(cpf);
    }
}
