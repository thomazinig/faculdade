import java.util.Scanner;

public class exerc16 {
    public static void main(String[] args) {
    // 16) Faca um programa q leia n valores reais. Armazene estes valores num vetor. Ao final, imprima a
    //média aritmética destes valores

    Scanner entrada = new Scanner(System.in);
        double[] array = new double[10];
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

    
    }
    
}
