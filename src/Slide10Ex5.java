import java.util.Scanner;

public class Slide10Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux;
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            System.out.println("digite um numero");
            x[i] = sc.nextInt();

        }
        System.out.println("\n Dados antes da inversão");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "  ");
        }
        for (int i=0;i<x.length/2;i++){

            aux=x[i];
            x[i]=x[x.length-1-i];
            x[x.length-1-i]=aux;
        }
        System.out.println("\n Dados depois da inversão");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "  ");
        }
    }
}
