// Maior Valor da Matriz: Encontre o maior valor em uma matriz e sua posição (linha e coluna).

public class MaiorValorMatriz {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] matriz = new int[4][4];

        // Preenchendo a matriz
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        // Imprimindo a matriz
        System.out.println("\n--- Matriz Informada ---");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Encontrando o maior valor e sua posição
        int maiorValor = matriz[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("\nO maior valor na matriz é: " + maiorValor);
        System.out.println("Posição: Linha " + linhaMaior + ", Coluna " + colunaMaior);

        sc.close();
    }
}
