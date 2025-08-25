// Soma de Linha Específica: Em uma matriz 5x5, peça ao usuário para escolher uma linha e calcule a soma dos elementos dela.

public class SomaLinhaMatriz {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] matriz = new int[5][5];

        // Preenchendo a matriz
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        // Imprimindo a matriz
        System.out.println("\n--- Matriz Informada ---");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Pedindo ao usuário para escolher uma linha
        System.out.print("Escolha uma linha (0-4) para somar: ");
        int linhaEscolhida = sc.nextInt();

        // Validando a linha escolhida
        if (linhaEscolhida < 0 || linhaEscolhida > 4) {
            System.out.println("Linha inválida! Por favor, escolha uma linha entre 0 e 4.");
        } else {
            // Calculando a soma da linha escolhida
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[linhaEscolhida][j];
            }
            System.out.println("A soma dos elementos da linha " + linhaEscolhida + " é: " + somaLinha);
        }

        sc.close();
    }
}
