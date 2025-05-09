package com.mycompany.heranca;

public class Funcionario extends Pessoa{
    String setor, trabalhando;
    
    // Constructor

    public Funcionario(String setor, String trabalhando, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
    
    // Getter and Setter

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(String trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    // Metodos
    
    public void mudarTrabalho(){
        System.out.println("");
    }

    @Override
    public void fazerAniv() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
