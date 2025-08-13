import java.util.Scanner;

public class Slide10Ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] x=new int[10];
        int maior =Integer.MAX_VALUE;
        int menor=Integer.MIN_VALUE;
        for (int i=0;i<x.length;i++){
            System.out.println("digite um numero");
            x[i]= sc.nextInt();
            if (x[i]>maior){
                maior=x[i];
            }
            if (x[i]<menor){
                menor=x[i];
            }
        }
        System.out.println("maior valor =" +maior);
    }
}
