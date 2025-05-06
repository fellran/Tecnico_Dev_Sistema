package com.mycompany.felipe;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Felipe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ParImpar parImpar = new ParImpar();
        // BHASKARA
        bhaskara bhas = new bhaskara();
        
        System.out.println(">> Formula de Bhaskara <<");
        System.out.print("Digite o valor de A \n >>");
        bhas.setA(input.nextInt());
        System.out.print("Digite o valor de B \n >>");
        bhas.setB(input.nextInt());
        System.out.print("Digite o valor de C \n obs: precisa valor negativo \n >>");
        bhas.setC(input.nextInt());
        
        bhas.CalcularRaiz();
        
        // PARA OU IMPAR
        System.out.println("Digite um valor");
        
        parImpar.setN1(input.nextInt());
        parImpar.verificarImparPar();
        
        // TRIANGULO
        Triangulo tri = new Triangulo();
        
        System.out.println(">> Descubra o triangulo << ");
        System.out.print("Digite o primeiro lado do triangulo \n >> ");
        tri.setA(input.nextInt());
        System.out.print("Digite o segundo lado do triangulo \n >> ");
        tri.setB(input.nextInt());
        System.out.print("Digite o terceiro lado do triangulo \n >>");
        tri.setC(input.nextInt());
        
        tri.verificar();
        
        
        String texto = "Felipe morador de rua";
        String caminhoArquivo = "Felipe.txt";
        // ESCREVENDO
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo));
            escritor.write(texto);
            escritor.close();
            System.err.println("Texto salvo com sucesso em " + caminhoArquivo);
        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao salvar o texto " + e.getMessage());
        }
        
        // LENDO
        
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo));
            String linha;
            System.out.println("Salvo >> " + caminhoArquivo);
            while ((linha = leitor.readLine()) != null){
                System.out.println(linha);
            };
            
        } catch (Exception i) {
           System.out.println("Error" + i.getMessage());
        }
    }
}
