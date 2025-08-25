// Tabuada: Peça um número e mostre a sua tabuada de 1 a 10.

public class Tabuada {
    public static void main(String[] args) {
        int numero;
        System.out.println("Digite o número para verificar a multiplicação:");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        numero = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        sc.close();
    }
}
