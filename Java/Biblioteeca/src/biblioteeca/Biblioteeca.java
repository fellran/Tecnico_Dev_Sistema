/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteeca;

import java.sql.SQLException;

public class Biblioteeca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ConnectionFactory conexao = new ConnectionFactory();
//        
//        if (conexao.connectDB() != null){
//            System.out.println("Deu certo");
//        }else {
//            System.out.println("Deu ruim");
//        }

       UsuarioDAO usuariodao = new UsuarioDAO();
       
       Usuario usuario = new Usuario(0, "Creusa", "creusa1@gmail.com", "61-995623015", "de mentira");

        //Usuario usuario = new Usuario(0,"Jubileu", "jubileu@gmail.com", "61-99949954", "De mentira");
        
        // Usuario[] usuarios = new Usuario[6];
        
        // Criar uma lista de usuarios sem um limitação ou seja talvez eu possa usa o for ou while
        
        try {
            usuariodao.criaUsuario(usuario);
        } catch (SQLException e) {
            System.out.println("Deu ruim" + e.getMessage());
        }
    }  
}
