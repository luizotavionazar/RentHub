package br.edu.iftm.renthub.model;

public class Totalizacao {
    private Integer id;
    private Contrato contrato;
    private double valor, juros, multa, total;

    public Totalizacao(Contrato contrato, double valor, double juros, double multa, double total) {
        this.contrato = contrato;
        this.valor = valor;
        this.juros = juros;
        this.multa = multa;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
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
