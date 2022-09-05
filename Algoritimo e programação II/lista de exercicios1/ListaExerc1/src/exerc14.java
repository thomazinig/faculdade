import java.util.Scanner;

public class exerc14 {
    //14) Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele possui..

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] array = new int[10];
        int num;
        int valoresPar = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o um numero: ");
            num = entrada.nextInt();
            array[i] = num;
        }
        
        for (int i = 0; i < array.length; i++) {
            
            if (array[i] % 2 == 0) {
                valoresPar++;
            }
        }
        System.out.print("O array possui "+ valoresPar+" valores pares");
    }
}
