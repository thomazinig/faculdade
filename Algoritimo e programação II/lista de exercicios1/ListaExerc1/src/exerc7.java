import java.util.Scanner;

public class exerc7 {
    //7) Ler 10 salários. Depois de lidos e armazenados, mostre o maior valor. 
    public static void main(String[] args) {
        double salario;
        double maiorSalario = 0;
        double[] arraySalarios = new double[10];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < arraySalarios.length; i++) {
            System.out.print("Digite o valor do "+(i+1)+"º salario: ");
            salario = entrada.nextDouble();
            arraySalarios[i] = salario;
            if (arraySalarios[i]>maiorSalario){
                maiorSalario = arraySalarios[i];
            }
        }
        System.out.println("o maior salario é: " + maiorSalario);

    }
}
