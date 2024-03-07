package model;

public class Usuario {
    private Long id;
    private String usuario;
    private String senha;
    private String tipo;
    private String email;

    public Usuario(Long id, String usuario, String senha, String tipo, String email) {
        this.id = id;
        this.usuario = usuario;
        this.senha = senha;
        this.tipo = tipo;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEmail() {
        return email;
    }
}
