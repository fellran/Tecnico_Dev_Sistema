//  União de Vetores: Crie dois vetores de 5 posições cada e um terceiro vetor de 10 posições que contenha os elementos dos dois primeiros.


public class Uniaovetores {
    public static void main(String[] args) {
        int[] vetor1 = {11, 21, 13, 4, 55};
        int[] vetor2 = {62, 77, 18, 91, 10};
        int[] vetor3 = new int[10];

        for (int i = 0; i < vetor1.length; i++) {
            vetor3[i] = vetor1[i];
        }

        for (int i = 0; i < vetor2.length; i++) {
            vetor3[i + vetor1.length] = vetor2[i];
        }

        System.out.println("Vetor combinado: ");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.print(vetor3[i] + " ");
        }
    }
}
