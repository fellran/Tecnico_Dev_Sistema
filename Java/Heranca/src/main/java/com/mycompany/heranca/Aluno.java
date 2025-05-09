
package com.mycompany.heranca;

public class Aluno extends Pessoa{
    private int matr;
    private String curso;

    // Contructor

    public Aluno(int matr, String curso, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        this.matr = matr;
        this.curso = curso;
    }
    
    // Getter and Setter

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    // Metodos
    @Override
    public void fazerAniv() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void cancelarMatricula(){
        System.out.println("matricula cancelada");
    }

    @Override
    public String toString() {
        return super.toString() + "matricula = " + matr + ", curso = " + curso;
    }

 
}
