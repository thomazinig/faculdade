public class exerc1ado {
    public static void main(String[] args) {
        //1. Faça um programa para somar duas matrizes.

        int[][] matrize1 = {{1,2,3},{3,2,1},{2,3,1}};
        int[][] matrize2 = {{1,2,3},{3,2,1},{2,3,1}};
        int[][] resultadoSoma = new int[3][3];

        for (int i = 0; i < resultadoSoma.length; i++) {
           for (int j = 0; j < resultadoSoma.length; j++) {
            resultadoSoma[i][j] = matrize1[i][j] + matrize2[i][j];
           }
           
        }
        for(int i =0;i<resultadoSoma.length;i++) { 
			System.out.println("\n");
			for(int j=0;j<resultadoSoma.length;j++) { 
				System.out.print(resultadoSoma[i][j]+"\t");
			}
		}

    }
}
