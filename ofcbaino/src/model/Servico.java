package model;

public class Servico {
    private Long id;
    private String tipo;
    private String tempoEstimado;
    private Double valor;
    private Funcionario funcionario;
    private String complexidade;

    public Servico(Long id, String tipo, String tempoEstimado, Double valor, Funcionario funcionario,
            String complexidade) {
        this.id = id;
        this.tipo = tipo;
        this.tempoEstimado = tempoEstimado;
        this.valor = valor;
        this.funcionario = funcionario;
        this.complexidade = complexidade;
    }
    
    public Long getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(String tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(String complexidade) {
        this.complexidade = complexidade;
    }
    
}
