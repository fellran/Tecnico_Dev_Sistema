// Par ou Ímpar: Receba um número inteiro e verifique se ele é par ou ímpar.

import java.util.Scanner;

public class Parimpar {
    public static void main(String[] args) throws Exception {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é par ou ímpar: ");
        numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }   
        sc.close();
        System.out.println("Fim do programa.");
    }
}
