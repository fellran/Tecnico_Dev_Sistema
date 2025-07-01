/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medotovetor;

/**
 *
 * @author ead
 */
public class MedotoVetor {

private double a,b,c;

public MedotoVetor(double a, double b,double c){
    this.a = a;
    this.b = b;
    this.c = c;
}

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }



// Metodo Delta

public double delta(){
    return Math.pow(this.getB(), 2)
            -4 * this.getA() * this.getC();
}

public double[] resposta(){
    double delta = delta();
    
    double x1 = (-this.getB() + Math.sqrt(delta)) / (2 * this.getA());
    double x2 = (-this.getB() - Math.sqrt(delta)) / (2 * this.getA());
    
    return new double [] {x1, x2};
}
}
