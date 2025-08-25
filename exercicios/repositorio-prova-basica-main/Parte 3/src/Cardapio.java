// Cardápio: Crie um menu de lanchonete (ex: 1. Hambúrguer, 2. Pizza, 3. Sair). Peça uma opção e exiba o item escolhido.

public class Cardapio {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu da Lanchonete:");
            System.out.println("1. Hambúrguer");
            System.out.println("2. Pizza");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção (1-3): ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Hambúrguer.");
                    break;
                case 2:
                    System.out.println("Você escolheu Pizza.");
                    break;
                case 3:
                    System.out.println("Saindo do menu. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha entre 1 e 3.");
                    break;
            }
        } while (opcao != 3);

        sc.close();
    }
}
