package com.mycompany.heranca;

public class Heranca {

    public static void main(String[] args) {
        
        Aluno[] aluno = new Aluno[3];
        
        // Alunos
        
        aluno[0] = new Aluno(0102, "computaria", "Fulano", "nao praticante", 25);
        
        aluno[1] = new Aluno(0306, "Tecnico", "Ciclano", "Com protecao", 20);
        
        aluno[2] = new Aluno(0304, "graduado", "nozes", "nao curto", 21);
        
        aluno[3] = new Aluno(0356, "faculdade", "jucao", "depois do casamento", 22);
        
        System.out.println(aluno[0].toString() + "\n" + aluno[1].toString());
        
        // Professores
        
        Professor[] professor = new Professor[3];
        
        professor[0] = new Professor("java", 1.400, "Olavo", "Maculino", 45);
        
        professor[1] = new Professor("python", 2.400, "Geremisa", "Maculino", 50);
        
        professor[2] = new Professor("Javascript", 3.400, "Gabriel", "Maculino", 33);
        
        professor[3] = new Professor("mySQL", 5.400, "Galao", "Maculino", 40);
        
        // Funcionario
        
        
    }
}
