//  Contar Pares no Vetor: Conte quantos números pares existem em um vetor de 10 posições.

public class Paresvetor {
    public static void main(String[] args) {
        int[] n = {12, 7, 9, 4, 6, 3, 8, 11, 14, 5, 15, 10, 2};
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Quantidade de números pares no vetor: " + count);
    }
}
