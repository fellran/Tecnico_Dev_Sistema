// Jogo da Velha: Crie uma matriz 3x3 para representar um tabuleiro de Jogo da Velha. Permita que dois jogadores façam suas jogadas.

import java.util.Scanner;

public class JogodaVelha {

    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        Scanner scanner = new Scanner(System.in);

        inicializarTabuleiro(tabuleiro);

        char jogadorAtual = 'X';
        boolean jogoAtivo = true;
        int jogadas = 0;

        System.out.println("=== BEM-VINDO AO JOGO DA VELHA ===");

        // Loop principal do jogo
        while (jogoAtivo) {
            // Imprime o estado atual do tabuleiro
            imprimirTabuleiro(tabuleiro);

            // Solicita a jogada do jogador atual
            System.out.println("\nJogador '" + jogadorAtual + "', é a sua vez.");
            System.out.print("Digite a linha (0, 1 ou 2): ");
            int linha = scanner.nextInt();
            System.out.print("Digite a coluna (0, 1 ou 2): ");
            int coluna = scanner.nextInt();

            // Valida a jogada
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("\nPosição inválida! As linhas e colunas devem ser entre 0 e 2. Tente novamente.");
                continue; // Pula para a próxima iteração do loop
            } else if (tabuleiro[linha][coluna] != ' ') {
                System.out.println("\nPosição já ocupada! Tente novamente.");
                continue; // Pula para a próxima iteração do loop
            }

            // Se a jogada for válida, atualiza o tabuleiro
            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;

            // Verifica se o jogo acabou (nesta versão, apenas se todas as casas foram preenchidas)
            if (jogadas == 9) {
                System.out.println("\nFim de jogo! O tabuleiro está cheio.");
                jogoAtivo = false;
            } else {
                // Troca o jogador
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }
        
        // Imprime o tabuleiro final
        System.out.println("\n--- TABULEIRO FINAL ---");
        imprimirTabuleiro(tabuleiro);

        scanner.close();
    }

    /**
     * Método para inicializar o tabuleiro, preenchendo todas as posições com um caractere de espaço (' ').
     * @param tabuleiro A matriz 3x3 a ser inicializada.
     */
    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' '; // ' ' representa uma casa vazia
            }
        }
    }

    /**
     * Método para imprimir o tabuleiro no console de forma formatada.
     * @param tabuleiro A matriz 3x3 a ser impressa.
     */
    public static void imprimirTabuleiro(char[][] tabuleiro) {
        System.out.println("\n  0   1   2"); // Guias de coluna
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " "); // Guia de linha
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) {
                    System.out.print(" | "); // Desenha a linha vertical
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  ---|---|---"); // Desenha a linha horizontal
            }
        }
    }
}
