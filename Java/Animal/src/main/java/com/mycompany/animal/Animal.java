/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author ead
 */
public class Animal {
        protected String nome;
        
        public void emitirSom(){
            System.out.println("O animal faz som ..");
        }
        
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public String getNome(){
            return nome;
        }
}
