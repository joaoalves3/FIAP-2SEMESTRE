import java.util.Scanner;

public class Slide10Vetores {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] x=new int[5];

        //armazenar 5 valores recebidos pelo tecado //
        for (int i =0;i<x.length;i++) {
            System.out.println("informe o valor de x");
            x[i]= sc.nextInt();
        }

        //impressao dos valores no terminal //

        for (int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }

    }
}
