import java.util.Random;

public class Slide10Ex10 {
    public static void main(String[] args) {
        Random rd = new Random();
        int aux =0;
        int[] x = new int[10];
        // antes da ordenação
        System.out.println("antes da ordenação");
        for (int i = 0; i < x.length; i++) {
            x[i] = rd.nextInt(55);
            System.out.print(x[i] + " ");
        }
        //processo de ordenação-->ordem crescente
        for (int j=0;j<x.length;j++) {
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] > x[i + 1]) {
                    aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }
        }


        //impressão após ordenação
        System.out.println("\n depois da ordenação");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");

        }
    }
}
