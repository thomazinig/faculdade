import java.util.Scanner;

public class exerc8 {
    //8) Crie um programa que leia 6 valores inteiros pares e, em seguida, mostre na tela os valores lidos
    //na ordem inversa.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arrayNumPar = new int[6];
        int num;

        for (int i = 0; i < arrayNumPar.length; i++) {
            System.out.print("Digite o um numero: ");
            num = entrada.nextInt();
            arrayNumPar[i] = num;
        }
        System.out.print("Numeros pares: " );
        for (int i = 0; i < arrayNumPar.length; i++) {
            
            if (arrayNumPar[i] % 2 == 0) {
                System.out.print(arrayNumPar[arrayNumPar.length - i] + ",");

            }
        }
    }
}
