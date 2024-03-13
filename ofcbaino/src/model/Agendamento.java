package model;

import java.util.Date;

public class Agendamento {
    private Long id;
    private Date inicioServico;
    private Date finalizacaoServico;
    private String defeito;
    private Produto produto;
    private Funcionario funcionario;
    public Agendamento(Long id, Date inicioServico, Date finalizacaoServico, String defeito, Produto produto,
            Funcionario funcionario) {
        this.id = id;
        this.inicioServico = inicioServico;
        this.finalizacaoServico = finalizacaoServico;
        this.defeito = defeito;
        this.produto = produto;
        this.funcionario = funcionario;
    }
    public Long getId() {
        return id;
    }
    public Date getInicioServico() {
        return inicioServico;
    }
    public Date getFinalizacaoServico() {
        return finalizacaoServico;
    }
    public void setFinalizacaoServico(Date finalizacaoServico) {
        this.finalizacaoServico = finalizacaoServico;
    }
    public String getDefeito() {
        return defeito;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
