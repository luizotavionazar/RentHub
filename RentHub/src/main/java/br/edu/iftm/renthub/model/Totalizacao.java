package br.edu.iftm.renthub.model;

public class Totalizacao {
    private Integer id;
    private Integer idContrato;
    private double valor, juros, multa, total;

    public Totalizacao(Integer id, Integer idContrato, double valor, double juros, double multa) {
        this.id = id;
        this.idContrato = idContrato;
        this.valor = valor;
        this.juros = juros;
        this.multa = multa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdContrato() {
        return idContrato;
    }

    public void setContrato(Integer idContrato) {
        this.idContrato = idContrato;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
