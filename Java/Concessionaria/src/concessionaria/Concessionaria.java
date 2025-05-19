/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concessionaria;

import java.sql.SQLException;
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
        
        CarroDAO carrodao = new CarroDAO();
        
        // insert 
        
        // marca, ano, tipo, portas
        
        //Carro carro = new Carro("Harley", 1979, "206", "4");
        
        //try {
        //    carrodao.createCarro(carro);
        //} catch (SQLException e) {
        //    System.out.println("Deu ruim" + e.getMessage());
        //}
        
        // update
        
        //Carro carro = new Carro("Ford", 2012, "Edge", "4");
        
        //try {
        //    carrodao.updateCarro(carro);
        //} catch (SQLException erro) {
        //    System.out.println("Erro" + erro.getMessage());
        //}
        
        
        // delete
        
        try {
            carrodao.deleteCarro(1);
        } catch (SQLException erro) {
            System.out.println("Erro" + erro.getMessage());
        }
        
        
//        if (conexao.connectDB() != null){
//            System.out.println("Deu certo");
//        }else {
//            System.out.println("Deu ruim");
//        }
    }
    
}
