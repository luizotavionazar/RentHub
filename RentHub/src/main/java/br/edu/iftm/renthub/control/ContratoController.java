package br.edu.iftm.renthub.control;

import java.time.LocalDate;

import java.util.List;

import br.edu.iftm.renthub.dao.ContratoDAO;
import br.edu.iftm.renthub.model.Contrato;

public class ContratoController {
    private ContratoDAO contratoDAO = new ContratoDAO();

    public boolean cadastrar(Contrato contrato) {
        return contratoDAO.cadastrar(tipo, idCliente, idEquip, qtdEquip, dataInicio, dataFim);
    }

    public String encerrarContrato(int id, String forma, LocalDate dataAtual) {
        return contratoDAO.encerrarContrato(id, forma, dataAtual);
    }

    public List<Contrato> listarContratoAtivo() {
        return contratoDAO.listarContratoAtivo();
    }

    public List<Contrato> listarContratoEncerrado() {
        return contratoDAO.listarContratoEncerrado();
    }

    public List<Contrato> listarContrato() {
        return contratoDAO.listarContrato();
    }

    public Contrato buscarContrato(int id) {
        return contratoDAO.buscarContrato(id);
    }

    public boolean verificarEquipamentoEmContratoAtivo (int idEquip) {
        return contratoDAO.verificarEquipamentoEmContratoAtivo(idEquip);
    }

    public boolean verificarClienteEmContratoAtivo (int id) {
        return contratoDAO.verificarClienteEmContratoAtivo(id);
    }

    public Contrato ultimoContrato () {
        return contratoDAO.buscarUltimoContrato();
    }

}
