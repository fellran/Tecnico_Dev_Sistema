// Verificador de Senha: Peça uma senha ao usuário e continue pedindo até que a senha correta ("java17") seja digitada.

public class Verificarsenha {
    public static void main(String[] args) {
        String senha;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Digite a senha: ");
        senha = sc.nextLine();
        while (!senha.equals("java17")) {
            System.out.println("Senha incorreta. Tente novamente: ");
            senha = sc.nextLine();
        }
        System.out.println("Login efetuado com sucesso!");
        sc.close();
    }
}
