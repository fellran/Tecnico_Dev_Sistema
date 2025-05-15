/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concessionaria;

/**
 *
 * @author ead
 */
public class Concessionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ConnectionFactory conexao = new ConnectionFactory();
        
        if (conexao.connectDB() != null){
            System.out.println("Deu certo");
        }else {
            System.out.println("Deu ruim");
        }
    }
    
}
