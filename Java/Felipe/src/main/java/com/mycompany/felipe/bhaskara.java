package com.mycompany.felipe;

public class bhaskara {
   double A;
   double B;
   double C;
   double Delta;
   double X1;
   double X2;

   
   
    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = A;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }

    public double getX1() {
        return X1 = ((-(B) + Math.sqrt(Delta)) / 2 * A);
    }

    public void setX1(double X1) {
        this.X1 = X1;
    }

    public double getX2() {
        return X2;
    }

    public void setX2(double X2) {
        this.X2 = X2;
    }
    
    public double Delta(){
        return (Math.pow(B, 2)+(-4*(A*C)));
    }
    
        public void CalcularRaiz(){
        double delta = Delta();
        
        if (delta>0){
            double x1 = ((-(B)+ Math.sqrt(delta)) / 2 * A);
            double x2 = ((-(B) - Math.sqrt(delta)) / 2 * A);
        
            // System.out.format("O valor de X1 e >>> %.2f \n" , x1);
            // System.out.format("Valor de X2 e >>> %.2f \n" , x2);
            System.out.format("delta >> %.2f \n x1 >> %.2f \n x2 >> %.2f \n", delta, x1, x2);
        }else{
            
            System.out.println("A Raiz nao existe: \n" + delta);
        }
    }
   
}
