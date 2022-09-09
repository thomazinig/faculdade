public class exerc20Part2 {
    public static void Uniao(double[] x, double[] y) {

        
        int contador = 0;
        int validador=0;

        int[] arrContador = new int[x.length + y.length];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {

                if (x[i] == y[j]) {
                    
                    arrContador[contador] = j;
                    contador++;
                    System.out.println(contador);
                }
            }
        }
        for (int i = 0; i < arrContador.length; i++) {
            System.out.print(arrContador[i]+"-");
        }
        System.out.println("aaaa");
        double[] arrRemovedor = new double[x.length+y.length];

        for (int i = 0; i < arrRemovedor.length; i++) {
            arrRemovedor[i] = arrContador[i];
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+",");
        }


        for (int i = 0; i < y.length; i++) {
            if (arrRemovedor[validador]==i) {
                validador++;
            }else{
                System.out.print(y[i]+",");
            }
        }
    
    }
    public static void main(String[] args) {
        double[]x = {1,2,3,4,5};
        double[] y = {2,1,4,5,14};
        Uniao(x, y);
    }
}
