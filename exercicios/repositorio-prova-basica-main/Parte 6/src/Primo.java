// Função para Verificar Primo: Crie uma função que recebe um número inteiro e retorna true se ele for primo e false caso contrário. Use-a em um programa principal.


import java.util.Scanner;

public class Primo {

    /**
     * Função para verificar se um número inteiro é primo.
     * @param numero O número a ser verificado.
     * @return true se o número for primo, false caso contrário.
     */
    public static boolean Primo(int numero) {
        // 1. Números menores ou iguais a 1 não são primos por definição.
        if (numero <= 1) {
            return false;
        }

        // 2. Percorre os possíveis divisores de 2 até a raiz quadrada do número.
        // Não é necessário ir além da raiz quadrada, pois qualquer divisor maior
        // teria um par correspondente menor que a raiz quadrada.
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            // Se o número for divisível por 'i', então ele não é primo.
            if (numero % i == 0) {
                return false;
            }
        }

        // 3. Se o laço terminar sem encontrar nenhum divisor, o número é primo.
        return true;
    }

    /**
     * Método principal que executa o programa.
     * Pede um número ao usuário e usa a função Primo para verificar.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("   VERIFICADOR DE NÚMEROS PRIMOS");
        System.out.println("=====================================");
        System.out.print("Digite um número inteiro positivo: ");

        int numeroParaVerificar = scanner.nextInt();

        // Chama a função Primo e armazena o resultado
        boolean resultado = Primo(numeroParaVerificar);

        // Exibe o resultado para o usuário com base no retorno da função
        if (resultado) {
            System.out.println("-> O número " + numeroParaVerificar + " é primo.");
        } else {
            System.out.println("-> O número " + numeroParaVerificar + " não é primo.");
        }

        scanner.close();
    }
}


