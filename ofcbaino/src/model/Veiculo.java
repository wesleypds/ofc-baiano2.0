package model;

public class Veiculo {
    private Long id;
    private String marca;
    private String modelo;
    private String cor;

    public Veiculo(Long id, String marca, String modelo, String cor) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
