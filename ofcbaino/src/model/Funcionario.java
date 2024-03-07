package model;

public class Funcionario {
    private Long id;
    private String nome;
    private String telefone;
    private String especialidade;
    private String email;
    private Double salario;
    private Boolean disponibilidade;
    private Integer servicosSendoFeitos;

    public Funcionario(Long id, String nome, String telefone, String especialidade, String email, Double salario,
            Boolean disponibilidade, Integer servicosSendoFeitos) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.email = email;
        this.salario = salario;
        this.disponibilidade = disponibilidade;
        this.servicosSendoFeitos = servicosSendoFeitos;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emial) {
        this.email = emial;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Integer getServicosSendoFeitos() {
        return servicosSendoFeitos;
    }

    public void setServicosSendoFeitos(Integer servicosSendoFeitos) {
        this.servicosSendoFeitos = servicosSendoFeitos;
    }
    
}
