import java.util.Scanner;

public class exerc10 {
    //10) Ler 10 números em uma array de inteiros e retorna a quantidade de elementos do array que são
    //números negativos.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int[] array = new int[10];
        int numNegativo=0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o numero do array(" + (i + 1) + "): ");
            num = entrada.nextInt();
            array[i] = num;
            if (array[i]<0) {
                numNegativo++;
            }
            System.out.println("exeitem " + numNegativo +" numeros negativos no array");
        }
        
    }
}
