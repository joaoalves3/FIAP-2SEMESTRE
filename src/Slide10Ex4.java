import java.util.Scanner;

public class Slide10Ex4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] mes = {"Janeiro" , "Fevereiro", "Março" , "Abril" , "Maio" , "Junho" , "Julho" , "Agosto" , "Setembro" , "Outubro" , "Novembro" , "Dezembro "};
        double [] temeperatura = new double[mes.length];
        double media =0;
        for (int i =0;i<mes.length;i++){
            System.out.println("Digite a media de cada mes");
            temeperatura[i]= sc.nextInt();
            media= media+temeperatura[i];
        }
        //calculo da media
        media=media/ mes.length;
        System.out.println("Temperatura media anual"+ media);
        for (int i=0;i< temeperatura.length;i++){
            if (temeperatura[i]> media){
                System.out.println(mes[i]+ "-->"+ temeperatura[i]);
            }
        }
    }
}
