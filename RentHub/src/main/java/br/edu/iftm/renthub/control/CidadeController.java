package br.edu.iftm.renthub.control;

import br.edu.iftm.renthub.dao.CidadeDAO;
import br.edu.iftm.renthub.model.Cidade;
import br.edu.iftm.renthub.view.RegistrosLog;
import java.sql.Connection;

public class CidadeController {
    private CidadeDAO cidadeDAO;

    RegistrosLog log = new RegistrosLog();
    
    public CidadeController(Connection conexao) {
        this.cidadeDAO = new CidadeDAO(conexao);
    }

    public boolean cadastrar(Cidade cidade){
        log.registrarLog(1, "CidadeController", "cadastrar", "cidade", "Iniciando cadastro da cidade "+ cidade.getNome());
        try {
            if (!cidadeDAO.verificarExistencia(cidade.getId())) {
                if (cidadeDAO.cadastrar(cidade.getId(), cidade.getNome(), cidade.getUf())) {
                    log.registrarLog(2, "CidadeControler", "cadastrar", "cidade", "Cidade "+ cidade.getNome() +" cadastrada com sucesso");
                } else {
                    log.registrarLog(3, "CidadeControler", "cadastrar", "cidade", "Não foi possivel cadastrar a cidade "+ cidade.getNome());
                    return false;
                }
            } else {
                log.registrarLog(3, "CidadeControler", "cadastrar", "cidade", "A cidade "+ cidade.getNome() +" já existe");
            }
            return true;
        } catch (Exception e) {
            log.registrarLog(2, "CidadeControler", "cadastrar", "cidade", "Cidade "+ cidade.getNome() +" cadastrada com sucesso");
            e.printStackTrace();
            return false;
        }
    }
}
