// Maior Elemento do Vetor: Encontre e exiba o maior número em um vetor de inteiros.

public class Maiorelemento {
    public static void main(String[] args) {
        int[] n = new int[5];
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Digite 5 números:");
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        int maior = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] > maior) {
                maior = n[i];
            }
        }
        System.out.println("O maior número do vetor é: " + maior);
        sc.close();
    }
}
