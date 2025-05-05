package com.mycompany.felipe;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Felipe {

    public static void main(String[] args) {
        // BHASKARA
        bhaskara bhas = new bhaskara();
        
        bhas.setA(1);
        bhas.setB(5);
        bhas.setC(-14);
        
        bhas.CalcularRaiz();
        
        // PARA OU IMPAR
        ParImpar parImpar = new ParImpar();
        
        parImpar.setN1(5);
        parImpar.verificarImparPar();
        
        // TRIANGULO
        
        
        
        String texto = "Felipe";
        String caminhoArquivo = "felipe.txt";
        // ESCREVENDO
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo));
            escritor.write(texto);
            System.err.println("Texto salvo com sucesso em " + caminhoArquivo);
        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao salvar o texto " + e.getMessage());
        }
        
        // LENDO
        
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo));
            String linha;
            System.out.println("Salvo" + caminhoArquivo);
            while ((linha = leitor.readLine()) != null){
                System.out.println(linha);
            };
            
        } catch (Exception i) {
            System.out.println("Error" + i.getMessage());
        }
    }
}
