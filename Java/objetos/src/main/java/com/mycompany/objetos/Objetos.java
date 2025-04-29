package com.mycompany.objetos;


public class Objetos {
    public static void main(String[] args){
        Caneta can = new Caneta();
        
        can.setModelo("Bic");
        can.setCor("Azul");
        can.setCarga(10);
        can.setPonta(0.5f);
        can.setCarga(90);
        
        System.out.println(can.getModelo());
        System.out.println(can.getCor());
        System.out.println(can.getCarga());
        System.out.println(can.getPonta());
        System.out.println(can.getCarga());
    }
}
