import java.util.Scanner;

public class Slide9Ex12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int produto, cont1, resposta;
        double preco, totalpreco=0;
        System.out.println("digite a quantidad de produto");
        produto= sc.nextInt();
        for (cont1=1;cont1<=produto;cont1++){
            System.out.println("digite o preço");
            preco= sc.nextDouble();
            totalpreco=totalpreco+preco;

        }
        System.out.println("o preço ficou "+totalpreco);
        System.out.println("digite 1 para pagar à vista ou 2 para parcelar em duas vezes");
        resposta= sc.nextInt();
        switch (resposta){
            case 1->{
                totalpreco=totalpreco-(totalpreco*10/100);
                System.out.println("o preço vai será de "+totalpreco);
            }
            default -> {
                totalpreco=(totalpreco+(totalpreco*15.5/100))/2;
                System.out.println("o preço de cada parcela será de "+totalpreco);
            }
        }
    }
}


