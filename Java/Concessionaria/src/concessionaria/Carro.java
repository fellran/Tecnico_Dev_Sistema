package concessionaria;

public class Carro {
    private String marca;
    private int ano;
    private boolean tipo;
    private String portas;
    
    // construtor

    public Carro(String marca, int ano, boolean tipo, String portas) {
        this.marca = marca;
        this.ano = ano;
        this.tipo = tipo;
        this.portas = portas;
    }
    
    // getter and setter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }
    
    
}
