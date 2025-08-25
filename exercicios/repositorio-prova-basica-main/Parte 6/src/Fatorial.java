// Função de Fatorial: Crie uma função que calcula o fatorial de um número.

public class Fatorial {
    /**
     * Função para calcular o fatorial de um número inteiro não negativo.
     * @param numero O número para o qual o fatorial será calculado.
     * @return O fatorial do número.
     */
    public static long fatorial(int numero) {
        // 1. Fatorial de 0 é 1 por definição.
        if (numero == 0) {
            return 1;
        }

        // 2. Inicializa o resultado do fatorial como 1.
        long resultado = 1;

        // 3. Loop para multiplicar todos os inteiros de 1 até 'numero'.
        for (int i = 1; i <= numero; i++) {
            resultado *= i; // Multiplica o resultado atual por 'i'.
        }

        // 4. Retorna o resultado final do fatorial.
        return resultado;
    }

    /**
     * Método principal que executa o programa.
     * Pede um número ao usuário e usa a função fatorial para calcular.
     */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("       CALCULADORA DE FATORIAL");
        System.out.println("=====================================");
        System.out.print("Digite um número inteiro não negativo: ");

        int numeroParaCalcular = scanner.nextInt();

        // Verifica se o número é negativo
        if (numeroParaCalcular < 0) {
            System.out.println("-> Erro: O fatorial não está definido para números negativos.");
        } else {
            // Chama a função fatorial e armazena o resultado
            long resultado = fatorial(numeroParaCalcular);

            // Exibe o resultado para o usuário
            System.out.println("-> O fatorial de " + numeroParaCalcular + " é: " + resultado);
        }

        scanner.close();
    }
}
