import java.util.Scanner;

public class exerc9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] array = new int[10];
        int num;
        int numEscolhido;


        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o numero do array(" + (i + 1) + "): ");
            num = entrada.nextInt();
            array[i] = num;
        }
       
            System.out.println("Digite um numero para ser pocurado: ");
            numEscolhido = entrada.nextInt();

           
        for (int i = 0; i < array.length; i++) {
            if (numEscolhido == array[i]) {
                // se for o local do array começãndo com 1 e não 0 so mudar i para (i+1)
                System.out.println("array["+i+"]");
            }
            if (numEscolhido!= array[i]&& array[i] == array.length) {
                System.out.println("Numero não encontrado ");
            }
           
            }
        
        
    }
    
}
