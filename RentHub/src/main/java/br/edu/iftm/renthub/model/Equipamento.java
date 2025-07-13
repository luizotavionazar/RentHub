package br.edu.iftm.renthub.model;

public class Equipamento {
    private Integer id, qtdTotal, qtdDisponivel;
    private String descricao;
    private double vlrDiaria, vlrMensal;

    public Equipamento() {
    }

    public Equipamento(String descricao, Integer qtdTotal, double vlrDiaria, double vlrMensal) {
        this.descricao = descricao;
        this.qtdTotal = qtdTotal;
        this.vlrDiaria = vlrDiaria;
        this.vlrMensal = vlrMensal;
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
