public class exerc12 {
    //Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O
    //programa deve executar os seguintes passos:
    //(a) Atribua os seguintes valores a esse vetor: 1, 0, 5,-2,-5, 7.
    //(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0],
    //A[1] e A[5] do vetor e mostre na tela esta soma.
    //(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
    //(d) Mostre na tela cada valor do vetor A, um em cada linha.

    public static void main(String[] args) {
        int arrayD[] = {1,0,5,-2,-5,7};
        int soma;

        soma = arrayD[0]+arrayD[1]+arrayD[5];
        System.out.println("a soma entre as posições 0,1e5 é:"+soma);
        arrayD[4] = 100;

        for (int i = 0; i < arrayD.length; i++) {
            System.out.println("valor da posição "+i+" : "+arrayD[i]);
        }
        
    }
}
