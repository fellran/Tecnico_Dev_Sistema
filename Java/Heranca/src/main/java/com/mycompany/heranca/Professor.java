package com.mycompany.heranca;

public class Professor extends Pessoa{
    String especialidade;
    Double salario;
    
    // Constructor

    public Professor(String especialidade, Double salario, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }
    
    // Getter and Setter

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    // Metodos
    
    public void receberAumento(){
        System.out.println("");
    }

    @Override
    public void fazerAniv() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
