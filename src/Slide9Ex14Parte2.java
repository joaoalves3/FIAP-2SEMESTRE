import java.util.Scanner;

public class Slide9Ex14Parte2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero;
        double total=0;
        System.out.println("digite um numero");
        numero= sc.nextInt();
        for (int cont=1;cont<=numero;cont++){
            total=total+ 1.0/cont;
            if (numero%2==0){
                total=total-1.0/numero;

            }
            else {
                total=total+1.0/numero;
            }



        }
        System.out.println(total);
    }
}
