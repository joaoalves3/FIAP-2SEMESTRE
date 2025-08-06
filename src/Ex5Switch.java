import java.util.Scanner;

/*programa em java para ler um valor inteiro. se o valor for par imprimir uma msg e tambem imprimir o dobro do numero. se o valor do numero for impar imprimir uma msg e tambem o triplo do numero. */
public class Ex5Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, resultado;
        System.out.println("Digite um valor");
        valor = sc.nextInt();
        resultado = switch (valor % 2) {
            case 0 -> {
                System.out.println("Par");
                yield 2 * valor;
            }
            default -> {
                System.out.println("Impar");
                yield 3 * valor;
            }

        };
    }
}
