//  Contagem de Pares e Ímpares: Peça 10 números e, ao final, mostre quantos eram pares e quantos eram ímpares.

public class ContagemParesImpares {
    public static void main(String[] args) {
        int numero,pares=0,impares=0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Indique 10 números inteiros para mostrar quantos são pares e quantos são ímpares:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número:");
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        sc.close();
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
