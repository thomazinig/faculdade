import java.util.Scanner;

public class exerc19 {
    
    // Faça um algoritmo q leia e armazene 5 valores inteiros em um vetor Vet1. Leia
    // outros 5 valores inteiros e armazene num vetor Vet2. A partir destes valores lidos, mostre na tela:
    // - a soma dos elementos de cada vetor, nas respectivas posições
    // - a diferença dos elementos de cada vetor, nas respectivas posições
    // - o produto dos elementos de cada vetor, nas respectivas posições
    // - a divisão entre os elementos de cada vetor, nas respectivas posições

    public static void main(String[] args) {

        double[] vet1 = new double[5];
        double[] vet2 = new double[5];

        System.out.println("preencha o primerio array");
        vet1 = PreencheArray(vet1);
        System.out.println("preencha o segundo array");
        vet2 = PreencheArray(vet2);

        System.out.println("Soma");
        Soma(vet1,vet2);
        System.out.println("\nDiferença");
        diferença(vet1, vet2);
        System.out.println("\nProduto");
        Produto(vet1, vet2);
        System.out.println("\nDivisão");
        Divisão(vet1, vet2);

    }

    public static double[] PreencheArray(double[] vet) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o numero do array(" + (i + 1) + "): ");
            vet[i] = entrada.nextInt();
        }
        return vet;
    }

    public static void Soma(double[] vet1, double[] vet2) {
        double[] soma = new double[5];
        for (int i = 0; i < vet1.length; i++) {
            soma[i] = vet1[i] + vet2[i];
        }
        for (int i = 0; i < soma.length; i++) {
            System.out.print(soma[i]+ ",");
        }
    }
    public static void diferença(double[] vet1, double[] vet2) {
        double[] diferença = new double[5];
        for (int i = 0; i < vet1.length; i++) {
            diferença[i] = vet1[i] - vet2[i];
        }
        for (int i = 0; i < diferença.length; i++) {
            System.out.print(diferença[i] + ",");
        }
    }
    public static void Produto(double[] vet1, double[] vet2) {
        double[] produto = new double[5];
        for (int i = 0; i < vet1.length; i++) {
            produto[i] = vet1[i] * vet2[i];
        }
        for (int i = 0; i < produto.length; i++) {
            System.out.print(produto[i] + ",");
        }
    }
    public static void Divisão(double[] vet1, double[] vet2) {
        double[] divisao = new double[5];
        for (int i = 0; i < vet1.length; i++) {
            divisao[i] = vet1[i] / vet2[i];
        }
        for (int i = 0; i < divisao.length; i++) {
            System.out.print(divisao[i] + ",");
        }
    }

    
}
