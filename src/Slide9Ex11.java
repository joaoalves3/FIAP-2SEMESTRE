import java.util.Scanner;

public class Slide9Ex11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero;
        int total=0;
        System.out.println("numero postivo e inteiro ");
        numero= sc.nextInt();
        if (numero<=0){
            System.out.println("numero positivo e inteiro ");
        }
        else {
            for (int cont=2;cont<numero;cont++){
                if (numero%cont==0){
                    total++;
                    break;
                }
            }
            if (total==0){
                System.out.println("é primo");
            }
            else {
                System.out.println("não é primo");
            }
        }
    }
}
