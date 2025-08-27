import java.text.DecimalFormat;
import java.util.Scanner;

public class Slide10Ex9 {
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("#,##0.00");
        Scanner sc =new Scanner(System.in);
        int quantidade;
        double total=0;
        double maiorSalrio=0;
        int posicao=0;

        System.out.println("digite a quantidade de funcionarios");
        quantidade= sc.nextInt();

        String[]nome = new String[quantidade];
        double[] salario=new double[quantidade];


        //entrada de dados
        for (int i=0;i<quantidade;i++){
            System.out.println("informe o nome do funcionario");
            nome[i]= sc.next();
            System.out.println("informe o salrio do "+nome[i]+" --->");
            salario[i]=sc.nextDouble();
            System.out.println();
            total=total+salario[i];
            if (salario[i]>maiorSalrio){
                maiorSalrio=salario[i];
                posicao=i;
            }
        }
        System.out.println("Total da folha de pagamento R$" + df.format(total));
        System.out.println("Media da folha de pagamento R$" + df.format(total/quantidade));
        System.out.println("Funcionario com o maior salrio é " +nome[posicao]);
        }
    }

