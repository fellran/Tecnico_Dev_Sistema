//  Maior de Dois Números: Peça dois números e mostre qual deles é o maior.

import java.util.Scanner;

public class maiornumero {
    public static void main(String[] args) throws Exception {
        int numero1, numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = sc.nextInt();
        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os números são iguais.");
        }
        sc.close();
        System.out.println("Fim do programa.");
    }
}
