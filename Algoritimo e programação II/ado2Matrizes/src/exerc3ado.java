public class exerc3ado {
    public static void main(String[] args) {
        //3. Faça um programa que leia uma matriz “mat” de tamanho 2 x 3 e imprima na tela 
        //a soma de todos os elementos da matriz.
        int[][] matrize1 = {{1,2,3},{3,2,1},};
        int resultadoSoma = 0;

        for (int i = 0; i < matrize1.length; i++) {
           for (int j = 0; j < matrize1[i].length; j++) {
            resultadoSoma += matrize1[i][j];
            
           }
        }
        
        System.out.println(resultadoSoma);
      
    }
}
