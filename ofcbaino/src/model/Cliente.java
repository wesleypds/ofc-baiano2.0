package model;

public class Cliente {
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String email;
    private Integer orcamentosAprovados;

    public Cliente(Long id, String nome, String endereco, String telefone, String cpf, String email,
            Integer orcamentosAprovados) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.orcamentosAprovados = orcamentosAprovados;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getOrcamentosAprovados() {
        return orcamentosAprovados;
    }

    public void setOrcamentosAprovados(Integer orcamentosAprovados) {
        this.orcamentosAprovados = orcamentosAprovados;
    }
    
}
