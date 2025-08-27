import java.util.Random;

public class Slide10Ex8 {
    public static void main(String[] args) {
        Random rd=new Random();
        int aux;
        boolean achou;
        int[] x = new int[10];
        for (int i=0;i<x.length;){
            aux= rd.nextInt(1,11);
            achou=false;
            for (int k=0;k<i;k++){
             if (x[k]==aux){
                 achou=true;
                 break;
             }
            }
            if (achou==false){
                x[i]=aux;
                System.out.println(x[i]+ " ");
                i++;
            }

        }
    }
}
