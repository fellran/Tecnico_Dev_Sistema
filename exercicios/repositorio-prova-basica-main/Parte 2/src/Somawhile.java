// Soma com while: Peça números ao usuário e some-os até que ele digite 0. No final, mostre a soma total.

import java.util.Scanner;

public class Somawhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite os números para somar (digite 0 para finalizar):");
        numero = sc.nextInt();

        while (numero != 0) {
            soma += numero;
            numero = sc.nextInt();
        }

        System.out.println("A soma total é: " + soma);
        sc.close();
        }
    }