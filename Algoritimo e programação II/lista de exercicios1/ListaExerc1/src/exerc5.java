import java.util.Scanner;

public class exerc5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int inverter;
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        

        for (int i = 0; i < vet1.length; i++) {
            System.out.print("Digite o numero do array(" + (i + 1) + "): ");
            num = entrada.nextInt();
            vet1[i] = num;
        }
        for (int i = 0; i < vet2.length; i++) {
            inverter = (vet1.length - 1)-i;
            vet2[i] = vet1[inverter];
            //System.out.println(inverter);
        }

        System.out.println("vetor 1:");
        for (int i = 0; i < vet1.length; i++) {
            System.out.print(vet1[i]+",");
        }
        System.out.println("\n vetor 2:");
        for (int i = 0; i < vet2.length; i++) {
            System.out.print(+ vet2[i]+",");
        }
         
    }
}
