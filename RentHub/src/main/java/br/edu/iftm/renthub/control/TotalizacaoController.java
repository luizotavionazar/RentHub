package br.edu.iftm.renthub.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.List;

import br.edu.iftm.renthub.dao.TotalizacaoDAO;
import br.edu.iftm.renthub.model.Contrato;
import br.edu.iftm.renthub.model.Equipamento;
import br.edu.iftm.renthub.model.Totalizacao;
import br.edu.iftm.renthub.model.Contrato.Tipo;
import br.edu.iftm.renthub.view.RegistrosLog;

public class TotalizacaoController {
    private TotalizacaoDAO totalizacaoDAO;

    public TotalizacaoController(Connection conexao) {
        this.totalizacaoDAO = new TotalizacaoDAO(conexao);
    }

    RegistrosLog log = new RegistrosLog();

    public boolean totalizar (Integer idContrato, double valor, double juros, double multa) {
        return totalizacaoDAO.totalizar(idContrato, valor, juros, multa);
    }
    
    public Totalizacao buscarTotalizacao (Integer idContrato) {
        return totalizacaoDAO.buscarPorContrato(idContrato);
    }

    public Double calcularValorBase(Contrato contrato) {
        double total = 0;
        if (contrato.getTipo() == Tipo.MENSAL) {
            long mesesContratados = ChronoUnit.MONTHS.between(contrato.getDataInicio(), contrato.getDataFim());
            List<Equipamento> temp = contrato.getEquipamentos();
            Iterator<Equipamento> iter = temp.iterator();
            while (iter.hasNext()) {
                Equipamento equipTemp = iter.next();
                total= total + (equipTemp.getVlrMensal()*mesesContratados)*equipTemp.getQtdContrato();
            }
        } else if (contrato.getTipo() == Tipo.DIARIO) {
            long diasContratados = ChronoUnit.DAYS.between(contrato.getDataInicio(), contrato.getDataFim());
            if (contrato.getDataFim().equals(contrato.getDataInicio())) {
                diasContratados = 1;
            }
            List<Equipamento> temp = contrato.getEquipamentos();
            Iterator<Equipamento> iter = temp.iterator();
            while (iter.hasNext()) {
                Equipamento equipTemp = iter.next();
                total= total + (equipTemp.getVlrDiaria()*diasContratados)*equipTemp.getQtdContrato();
            }
        }
        return total;
    }

    public Double calcularMulta (int forma, String tipo, double valor) {
        double multa = 0;
        if (forma == 0) {
            if (tipo.equals("MENSAL")) { // 20% de multa para finalização mensal e 50% para finalização diario
                multa = valor*0.20;
            } else {
                multa = valor*0.50;
            }
        } else {
            if (tipo.equals("MENSAL")) { // 50% de multa para cancelamento mensal e 70% para cancelamento diario
                multa = valor*0.50;
            } else {
                multa = valor*0.70;
            }
        }
        return multa;
    }
                
    public Double calcularJuros (String tipo, double valor, long diasAtrasados) {
        double total = 0;
        if (tipo.equals("MENSAL")) { // 1% de juros para contrato Mensal e 2% para Diário
            total = ((diasAtrasados*0.01)*valor);
        } else {
            total = ((diasAtrasados*0.02)*valor);
        }
        return total;
    }

    public Double calcularTotal (double total, double multa, double juros) {
        double totalFinal = total + multa + juros;
        return totalFinal;
    }
}
