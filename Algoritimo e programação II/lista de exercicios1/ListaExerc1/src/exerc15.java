import java.util.Scanner;

public class exerc15 {
    public static void main(String[] args) {
        // 15) Armazene num vetor de 5 posições o salário de 5 pessoas. Se o salário for
        // menor q 1000 reais,
        // forneça um aumento de 10% e sobrescreva o valor antigo. Ao final, mostre a
        // lista de salários
        // atualizada.

        Scanner entrada = new Scanner(System.in);
        double num;
        double aumento;
        double[] arraySalario = new double[5];

        for (int i = 0; i < arraySalario.length; i++) {
            System.out.print("Digite o numero do array(" + (i + 1) + "): ");
            num = entrada.nextInt();
            arraySalario[i] = num;
            if (num < 1000) {
                aumento = num * 0.1;
                
                arraySalario[i] = aumento+num;
            }
        }

        for (int i = 0; i < arraySalario.length; i++) {
            System.out.print(arraySalario[i]+"-");
            
        }
    }
}
