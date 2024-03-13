package model;

import java.util.Date;

public class Encerramento {
    private Long id;
    private Servico servico;
    private Date entrega;
    private String formaPagamento;
    private Double valor;
    public Encerramento(Long id, Servico servico, Date entrega, String formaPagamento, Double valor) {
        this.id = id;
        this.servico = servico;
        this.entrega = entrega;
        this.formaPagamento = formaPagamento;
        this.valor = valor;
    }
    public Long getId() {
        return id;
    }
    public Servico getServico() {
        return servico;
    }
    public Date getEntrega() {
        return entrega;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public Double getValor() {
        return valor;
    }
}
