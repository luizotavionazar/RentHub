package br.edu.iftm.renthub.model;

import java.time.LocalDate;

public class Contrato {
    private Integer id, qtdEquipamento;
    private Tipo tipo;
    private Status status;
    private Cliente cliente;
    private Equipamento equipamento;
    private LocalDate dataInicio, dataFim, dataEntrega;
    private Totalizacao totalizacao;

    public enum Status {
        ATIVO,
        FINALIZADO,
        CANCELADO;
        public static Status fromString(String status) {
            for (Status enumStatus : Status.values()) {
                if (enumStatus.name().equalsIgnoreCase(status)) {
                    return enumStatus;
                }
            }
            throw new IllegalArgumentException("Status inválido: " + status);
        }
    }

    public enum Tipo {
        DIARIO,
        MENSAL;
        public static Tipo fromString(String tipo) {
            for (Tipo enumTipo : Tipo.values()) {
                if (enumTipo.name().equalsIgnoreCase(tipo)) {
                    return enumTipo;
                }
            }
            throw new IllegalArgumentException("Tipo inválido: " + tipo);
        }
    }
    
    public Contrato(){
    }

    public Contrato(Cliente cliente, Equipamento equipamento, int qtdEquipamento, Tipo tipo, LocalDate dataInicio, LocalDate dataFim) {
        this.cliente = cliente;
        this.equipamento = equipamento;
        this.qtdEquipamento = qtdEquipamento;
        this.tipo = tipo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = Status.ATIVO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public int getQtdEquipamento() {
        return qtdEquipamento;
    }

    public void setQtdEquipamento(int qtdEquipamento) {
        this.qtdEquipamento = qtdEquipamento;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Totalizacao getTotalizacao() {
        return totalizacao;
    }

    public void setTotalizacao(Totalizacao totalizacao) {
        this.totalizacao = totalizacao;
    }
}
