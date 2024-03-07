package model;

public class Produto {
    private Long id;
    private String nome;
    private Integer quantidade;
    private Double valor;
    public Produto(Long id, String nome, Integer quantidade, Double valor) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    } 
}
