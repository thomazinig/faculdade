import java.util.Scanner;

public class exerc6 {

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
