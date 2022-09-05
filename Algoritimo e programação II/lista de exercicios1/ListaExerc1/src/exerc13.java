import java.util.Scanner;

public class exerc13 {
    // Ler um conjunto de números reais, armazenando-o em vetor e calcular o
    // quadrado das
    // componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos
    // tem 10
    // elementos cada. Imprimir todos os conjuntos
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        double[] array = new double[10];
        double[] arrayQuadrado = new double[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o numero do array(" + (i + 1) + "): ");
            num = entrada.nextInt();
            array[i] = num;
        }
        for (int i = 0; i < arrayQuadrado.length; i++) {
            arrayQuadrado[i] = array[i] * 2;

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < arrayQuadrado.length; i++) {
            System.out.print(arrayQuadrado[i] + ",");
        }
    }
}
