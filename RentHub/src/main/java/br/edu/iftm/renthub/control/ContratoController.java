package br.edu.iftm.renthub.control;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import br.edu.iftm.renthub.dao.ContratoDAO;
import br.edu.iftm.renthub.model.Contrato;
import br.edu.iftm.renthub.model.Contrato.Tipo;
import br.edu.iftm.renthub.model.Contrato.Status;
import br.edu.iftm.renthub.view.RegistrosLog;

public class ContratoController {
    private ContratoDAO contratoDAO;

    public ContratoController(Connection conexao) {
        this.contratoDAO = new ContratoDAO(conexao);
    }

    RegistrosLog log = new RegistrosLog();

    public boolean cadastrar(Contrato contrato) {
        log.registrarLog(1, "ContratoController", "cadastrar", "contrato, equipamento_contrato", "Cadastrando o contrato do cliente: " + contrato.getCliente().getNome());
        long mesesContratados = ChronoUnit.MONTHS.between(contrato.getDataInicio(), contrato.getDataFim());
        long diasContratados = ChronoUnit.DAYS.between(contrato.getDataInicio(), contrato.getDataFim());
        if (mesesContratados > 0) {
            contrato.setTipo(Tipo.MENSAL);
        } else if (diasContratados >= 0) {
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
            System.out.println("ID CLIENTE SELECIONADO: "+contratoFiltro.getCliente().getId());
            sqlFiltro.append("AND c.id = ? ");
            filtros.add(contratoFiltro.getCliente().getId());
        }
        if (contratoFiltro.getTipo() == Tipo.DIARIO || contratoFiltro.getTipo() == Tipo.MENSAL) {
            sqlFiltro.append("AND c.tipo = ? ");
            filtros.add(contratoFiltro.getTipo().name());
        }
        if (contratoFiltro.getStatus() == Status.ATIVO || contratoFiltro.getStatus() == Status.FINALIZADO || contratoFiltro.getStatus() == Status.CANCELADO) {
            sqlFiltro.append("AND c.status = ? ");
            filtros.add(contratoFiltro.getStatus().name());
        }
        if (contratoFiltro.getDataInicio() != null) {
            sqlFiltro.append("AND c.data_inicio >= ? ");
            filtros.add(contratoFiltro.getDataInicio());
        }
        if (contratoFiltro.getDataFim() != null) {
            sqlFiltro.append("AND c.data_fim <= ? ");
            filtros.add(contratoFiltro.getDataFim());
        }
        if (contratoFiltro.getDataEntrega() != null) {
            sqlFiltro.append("AND c.data_entrega = ? ");
            filtros.add(contratoFiltro.getDataEntrega());
        }
        try {
            return contratoDAO.listar(sqlFiltro.toString(), filtros);    
        } catch (Exception e) {
            return null;
        }
    }

    public boolean encerrarContrato(Integer idContrato, String status) {
        LocalDate dataAtual = LocalDate.now();
        if (contratoDAO.encerrar(idContrato, status, dataAtual)) {
            return true;
        } else {
            return false;
        }
        
    }
}
