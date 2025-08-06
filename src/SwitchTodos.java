import java.util.Scanner;

public class SwitchTodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        switch (valor){
            case 1:
            case 2:
                System.out.println("A");
                break;
            case 3:
            case 4:
                System.out.println("B");
                break;
            case 5:
            case 6:
                System.out.println("C");
                break;
            default:
                System.out.println("X");

        }

    }
}
