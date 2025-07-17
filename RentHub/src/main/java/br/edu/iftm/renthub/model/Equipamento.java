package br.edu.iftm.renthub.model;

public class Equipamento {
    private Integer id, qtdTotal, qtdDisponivel, qtdContrato;
    private String descricao;
    private double vlrDiaria, vlrMensal;

    public Equipamento() {
    }

    //CONTRUTOR PARA CADASTRO - FRONT
    public Equipamento(String descricao, Integer qtdTotal, double vlrDiaria, double vlrMensal) {
        this.descricao = descricao;
        this.qtdTotal = qtdTotal;
        this.vlrDiaria = vlrDiaria;
        this.vlrMensal = vlrMensal;
    }

    //CONTRUTOR PARA CAPTURA DO REGISTRO NO BD - BACK
    public Equipamento(Integer id, Integer qtdTotal, Integer qtdDisponivel, String descricao, double vlrDiaria, double vlrMensal) {
        this.id = id;
        this.qtdTotal = qtdTotal;
        this.qtdDisponivel = qtdDisponivel;
        this.descricao = descricao;
        this.vlrDiaria = vlrDiaria;
        this.vlrMensal = vlrMensal;
    }
    
    public Equipamento(Integer id, String descricao, double vlrDiaria, double vlrMensal, Integer qtdContrato){
        this.id = id;
        this.descricao = descricao;
        this.vlrDiaria = vlrDiaria;
        this.vlrMensal = vlrMensal;
        this.qtdContrato = qtdContrato;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQtdTotal() {
        return qtdTotal;
    }

    public void setQtdTotal(Integer qtdTotal) {
        this.qtdTotal = qtdTotal;
    }

    public Integer getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(Integer qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }

    public Integer getQtdContrato() {
        return qtdContrato;
    }

    public void setQtdContrato(Integer qtdContrato) {
        this.qtdContrato = qtdContrato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getVlrDiaria() {
        return vlrDiaria;
    }

    public void setVlrDiaria(double vlrDiaria) {
        this.vlrDiaria = vlrDiaria;
    }

    public double getVlrMensal() {
        return vlrMensal;
    }

    public void setVlrMensal(double vlrMensal) {
        this.vlrMensal = vlrMensal;
    }
}
