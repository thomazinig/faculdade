public class exerc4ado {
    public static void main(String[] args) {
        //4. Faça um programa que leia uma matriz “mat” de tamanho 4 x 4, e 
        //imprima na tela a soma dos elementos abaixo da diagonal principal da matriz.
        int[][] mat = {{1,2,3,1},{3,2,1,8},{2,3,1,5},{5,7,8,5}};

        for(int i =0;i<mat.length;i++) { 
			System.out.println("\n");
			for(int j=0;j<mat[i].length;j++) { 
				System.out.print(mat[i][j]+"\t");
			}
		}




    }
}
