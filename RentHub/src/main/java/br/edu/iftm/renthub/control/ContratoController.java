package br.edu.iftm.renthub.control;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import br.edu.iftm.renthub.dao.ContratoDAO;
import br.edu.iftm.renthub.model.Contrato;
import br.edu.iftm.renthub.model.Contrato.Tipo;
import br.edu.iftm.renthub.view.RegistrosLog;

public class ContratoController {
    private ContratoDAO contratoDAO;
    private TotalizacaoController totalizacaoController;

    public ContratoController(Connection conexao) {
        this.contratoDAO = new ContratoDAO(conexao);
        this.totalizacaoController = new TotalizacaoController(conexao);
    }

    RegistrosLog log = new RegistrosLog();

    public boolean cadastrar(Contrato contrato) {
        log.registrarLog(1, "ContratoController", "cadastrar", "contrato, equipamento_contrato", "Cadastrando o contrato do cliente: " + contrato.getCliente().getNome());
        if (ChronoUnit.DAYS.between(contrato.getDataInicio(), contrato.getDataFim()) >= 30) {
            contrato.setTipo(Tipo.MENSAL);
        } else {
            contrato.setTipo(Tipo.DIARIO);
        }
        try {
            if (contratoDAO.cadastrar(contrato.getCliente().getId(), contrato.getTipo().toString(), contrato.getStatus().toString(), contrato.getDataInicio(), contrato.getDataFim(), contrato.getEquipamentos())) {
                log.registrarLog(2, "ContratoController", "cadastrar", "contrato, equipamento_contrato", "Contrato do cliente: " + contrato.getCliente().getNome() + " cadastrado com sucesso");
                return true;
            } else {
                log.registrarLog(3, "ContratoController", "cadastrar", "contrato, equipamento_contrato", "Contrato do cliente: " + contrato.getCliente().getNome() + " não cadastrado");
                return false;
            }
        } catch (Exception e) {
            log.registrarLog(4, "ContratoController", "cadastrar", "contrato, equipamento_contrato", "Erro ao cadastrar o contrato do cliente: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public List<Contrato> listar(Contrato contratoFiltro) {
        log.registrarLog(1, "ContratoController", "listarContratos", "", "Listando contratos com base nos filtros");
        StringBuilder sqlFiltro = new StringBuilder();
        List<Object> filtros = new ArrayList<>();
        if (contratoFiltro.getCliente() != null && contratoFiltro.getCliente().getId() != null) {
            sqlFiltro.append("AND c.id = ? ");
            filtros.add(contratoFiltro.getCliente().getId());
        }
        if (contratoFiltro.getTipo() != null) {
            sqlFiltro.append("AND ct.tipo = ? ");
            filtros.add(contratoFiltro.getTipo().name());
        }
        if (contratoFiltro.getStatus() != null) {
            sqlFiltro.append("AND ct.status = ? ");
            filtros.add(contratoFiltro.getStatus().name());
        }
        if (contratoFiltro.getDataInicio() != null) {
            sqlFiltro.append("AND ct.data_inicio >= ? ");
            filtros.add(contratoFiltro.getDataInicio());
        }
        if (contratoFiltro.getDataFim() != null) {
            sqlFiltro.append("AND ct.data_fim <= ? ");
            filtros.add(contratoFiltro.getDataFim());
        }
        if (contratoFiltro.getDataEntrega() != null) {
            sqlFiltro.append("AND ct.data_entrega = ? ");
            filtros.add(contratoFiltro.getDataEntrega());
        }
        try {
            return contratoDAO.listar(sqlFiltro.toString(), filtros);    
        } catch (Exception e) {
            return null;
        }
    }

    public void encerrarContrato(Contrato contrato, int forma) {
        LocalDate dataAtual = LocalDate.now();
        boolean control= true, control1= true;

        //ENQUANTO EU ESTAVA ADAPTANDO ENTENDI QUE AQUI NO ENCERRAR CONTRATO EU NÇAO FAÇO CALCULOS POIS ELES JÁ FORAM REALIZADOS NA TELA
        //ENTAO PRIMEIRO DEVE SER INTEGRADA A TELA, PARA APENAS CAPTURAR A TOTALIZAÇÃO DO CONTRATO PARA EFETIVAR O ENCERRAMENTO

        //if (control1) {
        //    if (forma == 1) {
        //        formaS= "F";
    //
        //        if (this.listarContratosAtivos(forma, scanner, contratoController, dataAtual)) {
        //            scanner.nextLine();
        //            return;
        //        }
        //    } else if (forma == 2) {
        //        formaS= "C";
        //        
        //        if (this.listarContratosAtivos(forma, scanner, contratoController, dataAtual)) {
        //            scanner.nextLine();
        //            return;
        //        }
        //    }
    //
        //    System.out.print("Informe o ID do Contrato que deseja encerrar: ");
        //    int id= scanner.nextInt();
    //
        //    System.out.println("\n"+contratoController.encerrarContrato(id, formaS, dataAtual));
        //    Contrato contrato = contratoController.buscarContrato(id);
        //    LocalDate dataFim = LocalDate.parse(contrato.getDataFim().substring(0,10));
        //    
        //    double valor = obterValor(forma, 0, contrato.getIdEquip(), contrato, contratoController, equipamentoController, totalizacaoController);
        //    double multa = 0, juros = 0, total = 0;
    //
        //    if (dataFim.isBefore(dataAtual) ) { // Calcula Multa e Juros para contratos vencidos                         
        //        multa= this.calcularMulta(forma, contrato.getTipo(), valor);
        //        juros= this.calcularJuros(contrato.getTipo(), valor, dataAtual, dataFim);
        //    } else if (dataFim.isAfter(dataAtual)) { // Calcula Multa para cancelamento do contrato
        //        multa= this.calcularMulta(forma, contrato.getTipo(), valor);
        //    }
//
        //    total= this.calcularTotal(valor, multa, juros);
        //    System.out.println( "   Valor: R$" + valor + "\n" +
        //                        "   Multa: R$" + multa + "\n" +
        //                        "   Juros: R$" + juros + "\n" +
        //                        "----------------------" + "\n" +
        //                        "   Total: R$" + total);
        //    scanner.nextLine();
        //    System.out.println(totalizacaoController.realizarTotalizacao(id, valor, multa, juros, total)); 
        //}
        
    }

    //public Contrato buscarPorId(int id) {
    //    return contratoDAO.buscarPorId(id);
    //}
}
