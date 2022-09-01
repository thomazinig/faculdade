import java.util.Scanner;

public class exerc3 {
    // 3) Solicita 8 inteiros ao usuário e guarda esses valores em um array. Depois o programa deve
    //descobrir e exibir qual a posição do elemento de maior valor. 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int maiorValor = 0;
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o numero do array(" + (i + 1) + "): ");
            num = entrada.nextInt();
            array[i] = num;
            if (num > maiorValor) {
                maiorValor = num;   
            }
        }
        for (int i = 0; i < array.length; i++) {
           if (array[i]== maiorValor) {
            System.out.println("array["+ i +"]");
           }
        }
    }
}
