import java.util.Scanner;


public class exerc17 {
    public static void main(String[] args) {
        // 17) Faça um programa para ler 10 números DIFERENTES a serem armazenados em um
        // vetor. Os
        // dados deverão ser armazenados no vetor na ordem que forem sendo lidos, sendo
        // que caso o
        // usuário digite um número que já foi digitado anteriormente, o programa deverá
        // pedir para ele
        // digitar outro número. Note que cada valor digitado pelo usuário deve ser
        // pesquisado no vetor,
        // verificando se ele existe entre os números que já foram fornecidos. Exibir na
        // tela o vetor final
        // que foi digitado

        Scanner entrada = new Scanner(System.in);
        int tamanhoVetor=0;
        int num;
        boolean validador;

        System.out.println("digite o tamanho do vetor: ");
        tamanhoVetor = entrada.nextInt();

        int[] array = new int[tamanhoVetor];

        for (int i = 0; i < array.length; i++) {

            do {
                validador = true;
                System.out.print("Digite o numero do array(" + (i + 1) + "): ");
                num = entrada.nextInt();
                for (int j = 0; j < array.length; j++) {
                    if (num == array[j]) {
                        validador = false;
                    }
                }
                if (validador == false) {
                    System.out.println("numero ja assiste no array, digite um valor novo");
                }

            } while (validador == false);
            array[i] = num;
        }
        System.out.println("Valor final do array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }

    }

}
