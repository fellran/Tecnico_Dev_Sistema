/*  
 * Cadastro de Alunos Simplificado: Crie um programa que use vetores paralelos (um para nomes, outro para notas). Utilize funções para:

        Cadastrar um aluno (nome e nota).

        Listar todos os alunos com suas notas.

        Exibir a média da turma.

        Exibir o nome do aluno com a maior nota.
 */

public class Cadastro {
    static java.util.Scanner scanner = new java.util.Scanner(System.in);
    static String[] nomes = new String[100];
    static double[] notas = new double[100];
    static int contador = 0;

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n=== Menu de Cadastro de Alunos ===");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Exibir Média da Turma");
            System.out.println("4. Exibir Aluno com Maior Nota");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    exibirMediaTurma();
                    break;
                case 4:
                    exibirAlunoMaiorNota();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);
        scanner.close();
    }

    static void cadastrarAluno() {
        if (contador < nomes.length) {
            System.out.print("Digite o nome do aluno: ");
            nomes[contador] = scanner.nextLine();
            System.out.print("Digite a nota do aluno: ");
            notas[contador] = scanner.nextDouble();
            contador++;
            System.out.println("Aluno cadastrado com sucesso!");
        } else {
            System.out.println("Limite de alunos atingido!");
        }
    }

    static void listarAlunos() {
        if (contador == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        System.out.println("\n=== Lista de Alunos ===");
        for (int i = 0; i < contador; i++) {
            System.out.printf("%d. %s - Nota: %.2f%n", i + 1, nomes[i], notas[i]);
        }
    }

    static void exibirMediaTurma() {
        if (contador == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
}
        double soma = 0;
        for (int i = 0; i < contador; i++) {
            soma += notas[i];
        }
        double media = soma / contador;
        System.out.printf("Média da turma: %.2f%n", media);
    }

    static void exibirAlunoMaiorNota() {
        if (contador == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        int indiceMaior = 0;
        for (int i = 1; i < contador; i++) {
            if (notas[i] > notas[indiceMaior]) {
                indiceMaior = i;
            }
        }
        System.out.printf("Aluno com maior nota: %s - Nota: %.2f%n", nomes[indiceMaior], notas[indiceMaior]);
    }
}
