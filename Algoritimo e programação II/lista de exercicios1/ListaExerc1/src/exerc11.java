import java.util.Scanner;

public class exerc11 {
    // 11) Ler 10 números em uma array e criar outra array booleana do mesmo tamanho
    // e retorne, para
    // cada elemento, true quando o número do vetor 1 for par e falso se o número do
    // vetor 1 for
    // ímpar.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int[] array = new int[10];
        Boolean[] arrayValidador = new Boolean[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o numero do array(" + (i + 1) + "): ");
            num = in.nextInt();
            array[i] = num;

            if (array[i] % 2 == 0) {
                arrayValidador[i] = true;
            } else {
                arrayValidador[i] = false;
            }
           
        }
        for (int i = 0; i < arrayValidador.length; i++) {
            System.out.print("Posição "+"["+i+"] "+arrayValidador[i]+", ");
        }

    }
}