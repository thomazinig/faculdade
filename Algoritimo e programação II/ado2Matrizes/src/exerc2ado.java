public class exerc2ado {
    public static void main(String[] args) {
        //2. Faça um programa para calcular a transposta de uma matriz.

        int[][] matrize1 = {{1,2,3},{3,2,1},{2,3,1}};

        for (int i = 0; i < matrize1.length; i++) {
            for (int j = 0; j < matrize1[i].length; j++) {
                matrize1[i][j]=matrize1[j][i];  
            }
        }

        
        for(int i =0;i<matrize1.length;i++) { 
			System.out.println("\n");
			for(int j=0;j<matrize1.length;j++) { 
				System.out.print(matrize1[i][j]+"\t");
			}
		} 
        

       
    }
}
