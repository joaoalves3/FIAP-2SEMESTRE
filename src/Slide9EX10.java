import java.util.Scanner;

public class Slide9EX10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int valor;
        System.out.println("Digite um numero");
        valor= sc.nextInt();
        if (valor<=0){
            System.out.println("digite um numero positivo e inteiro");
        }
        else {
            for (int cont=1;cont<=valor;cont++){
                if (valor%cont==0){
                    System.out.print(cont + " ");
                }
            }
        }

    }
}
