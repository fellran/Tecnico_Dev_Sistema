package com.mycompany.felipe;

public class ParImpar {
    int n1, n2;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }
    
    public int verificarImparPar(){
        
        int numero = n1;
        
        if (numero %2 == 0){
            System.out.println("Numero par >> " + numero);
        }else{
            System.out.println("Numero impar >> " + numero);
        }
        return numero;
    }
}
