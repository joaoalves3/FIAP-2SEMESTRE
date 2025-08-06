import java.util.Scanner;

/*programa em java para ler um valor inteiro. se o valor for par imprimir uma msg e tambem imprimir o dobro do numero. se o valor do numero for impar imprimir uma msg e tambem o triplo do numero. */
public class Ex4Switch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor");
        valor= sc.nextInt();
        switch (valor % 2){
            case 0 ->{
                System.out.println("Par");
                System.out.println(2*valor);
            }
            case 1 ->{
                System.out.println("Impar");
                System.out.println(3*valor);
            }
        }
    }
}
