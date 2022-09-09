import java.util.Scanner;

public class exerci20 {
    /*
     * 20) Leia dois vetores de inteiros x e y, cada um com 5 elementos (assuma que
     * o usuário não informa
     * elementos repetidos). Calcule e mostre os vetores resultantes em cada caso
     * abaixo:
     * • Soma entre x e y: soma de cada elemento de x com o elemento da mesma
     * posição em y.
     * • Produto entre x e y: multiplicação de cada elemento de x com o elemento da
     * mesma
     * posição em y.
     * • Diferença entre x e y: todos os elementos de x que não existam em y.
     * • Interseção entre x e y: apenas os elementos que aparecem nos dois vetores.
     * • União entre x e y: todos os elementos de x, e todos os elementos de y que
     * não estão em
     * x
     */

    public static void main(String[] args) {

        double[] x = new double[5];
        double[] y = new double[5];

        System.out.println("preencha o primerio array");
        x = PreencheArray(x);
        System.out.println("preencha o segundo array");
        y = PreencheArray(y);

        System.out.println("Soma");
        Soma(x, y);
        System.out.println("\nDiferença");
        diferença(x, y);
        System.out.println("\nProduto");
        Produto(x, y);
        System.out.println("\nDivisão");
        Divisão(x, y);
        System.out.println("\n Intersecao");
        Intersecao(x, y);
        System.out.println("\n União");//juro que tentei muito
        exerc20Part2.Uniao(x, y);

    }

    public static double[] PreencheArray(double[] vet) {
        Scanner entrada = new Scanner(System.in);
        boolean validador;
        int num;

        for (int i = 0; i < vet.length; i++) {

            do {
                validador = true;
                System.out.print("Digite o numero do array(" + (i + 1) + "): ");
                num = entrada.nextInt();
                for (int j = 0; j < vet.length; j++) {
                    if (num == vet[j]) {
                        validador = false;
                    }
                }
                if (validador == false) {
                    System.out.println("numero ja assiste no array, digite um valor novo");
                }

            } while (validador == false);
            vet[i] = num;
        }
        return vet;
    }

    public static void Soma(double[] x, double[] y) {
        double[] soma = new double[5];
        for (int i = 0; i < x.length; i++) {
            soma[i] = x[i] + y[i];
        }
        for (int i = 0; i < soma.length; i++) {
            System.out.print(soma[i] + ",");
        }
    }

    public static void diferença(double[] x, double[] y) {
        double[] diferença = new double[5];
        for (int i = 0; i < x.length; i++) {
            diferença[i] = x[i] - y[i];
        }
        for (int i = 0; i < diferença.length; i++) {
            System.out.print(diferença[i] + ",");
        }
    }

    public static void Produto(double[] x, double[] y) {
        double[] produto = new double[5];
        for (int i = 0; i < x.length; i++) {
            produto[i] = x[i] * y[i];
        }
        for (int i = 0; i < produto.length; i++) {
            System.out.print(produto[i] + ",");
        }
    }

    public static void Divisão(double[] x, double[] y) {
        double[] divisao = new double[5];
        for (int i = 0; i < x.length; i++) {
            divisao[i] = x[i] / y[i];
        }
        for (int i = 0; i < divisao.length; i++) {
            System.out.printf("%.2f ,", divisao[i]);
        }
    }

    public static void Intersecao(double[] x, double[] y) {
        int tamanhoArrIntersecao = 0;
        int indiceArrIntersecao = 0;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    tamanhoArrIntersecao++;
                }
            }
        }
        double[] intersecao = new double[tamanhoArrIntersecao];

        do {
                 
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < y.length; j++) {
                    if (x[i] == y[j]){
                        intersecao[indiceArrIntersecao]=x[i];
                        indiceArrIntersecao ++;
                    }
                }
             }
             
            }while (indiceArrIntersecao<tamanhoArrIntersecao);
        
        for (int i = 0; i < intersecao.length; i++) {
            System.out.print(intersecao[i] + ",");
        }
    }  

    
    
}
