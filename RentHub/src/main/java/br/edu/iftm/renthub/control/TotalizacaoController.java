package br.edu.iftm.renthub.control;


import br.edu.iftm.renthub.dao.TotalizacaoDAO;
import br.edu.iftm.renthub.model.Totalizacao;

public class TotalizacaoController {
    private TotalizacaoDAO totalizacaoDAO = new TotalizacaoDAO();

    public String realizarTotalizacao (int contrato, double valor, double multa, double juros, double total) {
        return totalizacaoDAO.Cadastrartotalizacao(contrato, valor, multa, juros, total);
    }
    
    public Totalizacao buscarTotalizacao (int contrato) {
        return totalizacaoDAO.buscarTotalizacao(contrato);
    }

}
