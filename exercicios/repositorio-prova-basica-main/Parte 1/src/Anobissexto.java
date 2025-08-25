//  Ano Bissexto: Peça um ano e verifique se ele é bissexto (divisível por 4, mas não por 100, a menos que seja divisível por 400).

import java.util.Scanner;

public class Anobissexto {
    public static void main(String[] args) throws Exception {
        int ano;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        ano = sc.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
        sc.close();
        System.out.println("Fim do programa.");
    }
}
