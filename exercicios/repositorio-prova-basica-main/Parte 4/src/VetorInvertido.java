// Vetor Invertido: Preencha um vetor de 10 posições e imprima seus elementos na ordem inversa.

public class VetorInvertido {
    public static void main(String[] args) {
        int[] n = new int[10];
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println("Os números digitados em ordem inversa são:");
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.println(n[i]);
        }
        sc.close();
    }
}
