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
import br.edu.iftm.renthub.view.RegistrosLog;

public class TotalizacaoController {
    private TotalizacaoDAO totalizaoDAO;

    public TotalizacaoController(Connection conexao) {
        this.totalizaoDAO = new TotalizacaoDAO(conexao);
    }

    RegistrosLog log = new RegistrosLog();

    //public String realizarTotalizacao (int contrato, double valor, double multa, double juros, double total) {
    //    return totalizacaoDAO.Cadastrartotalizacao(contrato, valor, multa, juros, total);
    //}
    //
    //public Totalizacao buscarTotalizacao (int contrato) {
    //    return totalizacaoDAO.buscarTotalizacao(contrato);
    //}

    public Double obterValor(int forma, int tipo, int idEquip, Contrato contrato, ContratoController contratoController, EquipamentoController equipamentoController, TotalizacaoController totalizacaoController) {
        Equipamento equipamento = equipamentoController.buscarEquipamento(idEquip);
        LocalDate dataAtual = LocalDate.now();
        return this.calcularValor(forma, tipo, equipamento, contrato, dataAtual);
    }

    public Double calcularValor(Contrato contrato, int forma, LocalDate dataAtual) {
        double total = 0;
        if (contrato.getTipo().equals("MENSAL")) {
            long mesesContratados = ChronoUnit.MONTHS.between(contrato.getDataInicio(), contrato.getDataFim());
            List<Equipamento> temp = contrato.getEquipamentos();
            Iterator<Equipamento> iter = temp.iterator();
            while (iter.hasNext()) {
                Equipamento equipTemp = iter.next();
                total= total + (equipTemp.getVlrMensal()*mesesContratados)*equipTemp.getQtdContrato();
            }
        } else if (contrato.getTipo().equals("DIARIO")) {
            long diasContratados = ChronoUnit.DAYS.between(contrato.getDataInicio(), contrato.getDataFim());
            List<Equipamento> temp = contrato.getEquipamentos();
            Iterator<Equipamento> iter = temp.iterator();
            while (iter.hasNext()) {
                Equipamento equipTemp = iter.next();
                total= total + (equipTemp.getVlrDiaria()*diasContratados)*equipTemp.getQtdContrato();
            }
        }
        if (forma == 1 || forma == 2) {
            if (forma == 1) { //Calcular o valor na finalização do contrato
                if (dataAtual.isAfter(contrato.getDataFim())) {
                    calcularMulta(forma, contrato.getTipo().toString(), total);
                    calcularJuros(contrato.getTipo().toString(), total, dataAtual, contrato.getDataFim());
                }
            } else if (forma == 2) { //Calcular o valor no cancelamento do contrato
                calcularMulta(forma, contrato.getTipo().toString(), total);
            }    
        }
        
        return total;
    }

    public Double calcularMulta (int forma, String tipo, double valor) {
        double total = 0;
        if (forma == 1) {
            if (tipo == 1) { // 20% de multa para finalização mensal e 50% para finalização diario
                total = valor*0.20;
            } else {
                total = valor*0.50;
            }
        } else {
            if (tipo == 1) { // 50% de multa para cancelamento mensal e 70% para cancelamento diario
                total = valor*0.50;
            } else {
                total = valor*0.70;
            }
        }
        return total;
    }
                
    public Double calcularJuros (String tipo, double valor, LocalDate dataAtual, LocalDate dataFim) {
        long diasAtrasados = ChronoUnit.DAYS.between(dataFim, dataAtual);
        double total = 0;
        if (tipo==1) {
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
