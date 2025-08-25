// Cálculo de IMC: Calcule o Índice de Massa Corporal (IMC = peso / altura²) e exiba a categoria (Abaixo do peso, Peso normal, Sobrepeso, etc.).

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) throws Exception {
        double peso, altura, imc;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu peso (em kg): ");
        peso = sc.nextDouble();
        System.out.println("Digite a sua altura (em metros): ");
        altura = sc.nextDouble();
        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);
        if (imc < 18.5) {
            System.out.println("Resultado: Abaixo do peso.");
        } else if (imc < 24.9) {
            System.out.println("Resultado: Peso normal.");
        } else if (imc < 29.9) {
            System.out.println("Resultado: Sobrepeso.");
        } else {
            System.out.println("Resultado: Obesidade.");
        }
        sc.close();
        System.out.println("Fim do programa.");
    }
}
