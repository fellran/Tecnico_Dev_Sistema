// Sequência de Fibonacci: Gere e exiba os N primeiros termos da sequência de Fibonacci (onde N é informado pelo usuário).

public class Fibonacci {
    public static void main(String[] args) {
        int numero1 = 0, numero2 = 1, numero3, numero;
        System.out.println("Digite a quantidade de termos da sequência de Fibonacci:");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        numero = sc.nextInt();
        System.out.print(numero1 + " " + numero2); // Imprime os dois primeiros termos
        for (int i = 2; i < numero; i++) { // Começa de 2 porque os dois primeiros termos já foram impressos
            numero3 = numero1 + numero2;
            System.out.print(" " + numero3);
            numero1 = numero2;
            numero2 = numero3;
        }
        sc.close();
    }
}

