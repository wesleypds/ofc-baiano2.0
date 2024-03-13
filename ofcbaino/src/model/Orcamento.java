package model;

import java.util.Date;

public class Orcamento {
    private Long id;
    private Date dataEntrada;
    private String placaVeiculo;
    private String anoVeiculo;
    private String problema;
    private Double valor;
    private Integer descontos;
    private Veiculo veiculo;
    private Cliente cliente;
    private Servico servico;
    public Orcamento(Long id, Date dataEntrada, String placaVeiculo, String anoVeiculo, String problema, Double valor,
            Integer descontos, Veiculo veiculo, Cliente cliente, Servico servico) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.placaVeiculo = placaVeiculo;
        this.anoVeiculo = anoVeiculo;
        this.problema = problema;
        this.valor = valor;
        this.descontos = descontos;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.servico = servico;
    }
    public Long getId() {
        return id;
    }
    public Date getDataEntrada() {
        return dataEntrada;
    }
    public String getPlacaVeiculo() {
        return placaVeiculo;
    }
    public String getAnoVeiculo() {
        return anoVeiculo;
    }
    public String getProblema() {
        return problema;
    }
    public Double getValor() {
        return valor;
    }
    public Integer getDescontos() {
        return descontos;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Servico getServico() {
        return servico;
    }
    public void setServico(Servico servico) {
        this.servico = servico;
    }
}
