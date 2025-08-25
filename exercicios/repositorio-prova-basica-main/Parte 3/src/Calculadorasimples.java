// Programa: Parte 3 - Calculadora Simples

public class Calculadorasimples {
    public static void main(String[] args) {
        double num1, num2, resultado;
        char operacao;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();
        System.out.println("Escolha a operação (+, -, *, /): ");
        operacao = sc.next().charAt(0);

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
        sc.close();
    }
}