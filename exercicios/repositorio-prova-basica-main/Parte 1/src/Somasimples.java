// Programa Soma Simples: Peça ao usuário para digitar dois números inteiros e exiba a soma deles.

import java.util.Scanner;

public class Somasimples{
    public static void main(String[] args) throws Exception {
       int numero1,numero2,soma;
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
         numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
         numero2 = sc.nextInt();
        soma = numero1 + numero2;
        System.out.println("A soma dos numeros é: " + soma);
        sc.close();
        System.out.println("Fim do programa.");
    }
}
