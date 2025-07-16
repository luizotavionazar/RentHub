package br.edu.iftm.renthub.control;

import br.edu.iftm.renthub.dao.EnderecoDAO;
import br.edu.iftm.renthub.model.Endereco;
import br.edu.iftm.renthub.view.RegistrosLog;
import java.sql.Connection;

public class EnderecoController {
    private EnderecoDAO enderecoDAO;
    private CidadeController cidadeController;

    public EnderecoController(Connection conexao) {
        this.enderecoDAO = new EnderecoDAO(conexao);
        this.cidadeController = new CidadeController(conexao);
    }

    RegistrosLog log = new RegistrosLog();

    public boolean cadastrar(Endereco endereco){
        log.registrarLog(1, "EnderecoController", "cadastrar", "cidade, endereco", "Iniciando cadastro de endereço");
        try {
            if (cidadeController.cadastrar(endereco.getCidade())) {
                if (enderecoDAO.cadastrar(endereco.getCep(), endereco.getCidade().getId(), endereco.getLogradouro(), endereco.getBairro(), endereco.getNumero(), endereco.getComplemento())) {
                    log.registrarLog(2, "EnderecoController", "cadastrar", "endereco", "Endereço cadastrado com sucesso");
                    return true;
                } else {
                    log.registrarLog(3, "EnderecoController", "cadastrar", "endereco", "Não foi possivel cadastrar o endereço");
                    return false;
                }
            } else {
                log.registrarLog(3, "EnderecoController", "cadastrar", "cidade", "Não foi possivel verificar/cadastrar a cidade do endereço");
                return false;
            }
        } catch (Exception e) {
            log.registrarLog(4, "EnderecoController", "cadastrar", "cidade, endereco", "Erro ao cadastrar o endereço: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
    
    public Endereco buscarEndereco(int idEndereco){
        return enderecoDAO.buscarEndereco(idEndereco);
    }
}
