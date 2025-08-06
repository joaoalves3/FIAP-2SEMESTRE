import java.util.Scanner;

public class Slide9Ex12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double valor,produtos,total,totalpreco=0,resposta,totalprecoAvista,aux,totalprecoParcelado;
        System.out.println("quantos produtos vc comprou");
        produtos= sc.nextDouble();
        for (int cont=1;cont<=produtos;cont++){
            System.out.println("digite o valor do seu produto" +  cont);
            valor= sc.nextDouble();
            totalpreco=valor+totalpreco;

        }
        System.out.println("o preço total é de "+totalpreco);
        System.out.println("se desejar parcelar digite 1 se deseja pagar a vista digita 2");
        resposta= sc.nextDouble();
        if (resposta==2){
            aux=totalpreco/10;
            totalprecoAvista=totalpreco-aux;
            System.out.println(totalprecoAvista);
        }
        else {
            aux=totalpreco/1.155;
            totalprecoParcelado=totalpreco+aux;
            System.out.println(totalprecoParcelado);
        }


    }
}
