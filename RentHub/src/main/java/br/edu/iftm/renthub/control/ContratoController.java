package br.edu.iftm.renthub.control;

import java.sql.Connection;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
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


    //public String encerrarContrato(int id, String forma, LocalDate dataAtual) {
    //    return contratoDAO.encerrarContrato(id, forma, dataAtual);
    //}
//
    //public List<Contrato> listarContratoAtivo() {
    //    return contratoDAO.listarContratoAtivo();
    //}
//
    //public List<Contrato> listarContratoEncerrado() {
    //    return contratoDAO.listarContratoEncerrado();
    //}
//
    //public List<Contrato> listarContrato() {
    //    return contratoDAO.listarContrato();
    //}
//
    //public Contrato buscarContrato(int id) {
    //    return contratoDAO.buscarContrato(id);
    //}
//
    //public boolean verificarEquipamentoEmContratoAtivo (int idEquip) {
    //    return contratoDAO.verificarEquipamentoEmContratoAtivo(idEquip);
    //}
//
    //public boolean verificarClienteEmContratoAtivo (int id) {
    //    return contratoDAO.verificarClienteEmContratoAtivo(id);
    //}
//
    //public Contrato ultimoContrato () {
    //    return contratoDAO.buscarUltimoContrato();
    //}
}
