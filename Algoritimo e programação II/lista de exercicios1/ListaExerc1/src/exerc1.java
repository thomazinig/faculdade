import java.util.Scanner;

public class exerc1 {
    /* 1) Preenche um array de tamanho 10 com números lidos pelo teclado */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o numero do array(" + (i + 1) + "): ");
            num = entrada.nextInt();
            array[i] = num;
        }
    }
}
