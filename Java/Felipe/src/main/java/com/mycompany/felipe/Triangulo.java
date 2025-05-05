package com.mycompany.felipe;

public class Triangulo {
    int a,b,c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public int verificar(){
        if(a == b && a == c && b == a && b == c && c == a && c == b){
            System.out.println("Triangulo equilatero");
        }
    }
}
