import java.util.Scanner;

public class exerc6 {
    //6) Ler 20 números reais e armazena esses valores em um array. O programa deve calcular a média
    //aritmética dos valores do vetor e imprimir todos os valores menores do que a média calculada. 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] array = new double[20];
        double num;
        double mediaAritimetica = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o numero do array(" + (i + 1) + "): ");
            num = entrada.nextInt();
            array[i] = num;
            mediaAritimetica += array[i];
            
        }
        mediaAritimetica = mediaAritimetica/array.length;
        System.out.println("media Aritimetica: "+mediaAritimetica);

        
        for (int i = 0; i < array.length; i++) {
            if (array[i]<mediaAritimetica) {
                System.out.print(array[i]+",");
            }     
        }
    }
}
