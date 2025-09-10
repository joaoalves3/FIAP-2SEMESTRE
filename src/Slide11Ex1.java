import java.util.Random;

public class Slide11Ex1 {

    public static void main(String[] args) {
        Random rd=new Random();
        int [][] m = new int[4][4];
        int dp = 0, ds= 0 ;
        for (int i=0;i<m.length;){
            for ( int j=0;j< m.length;j++){
                System.out.printf("valor-->");
                m[i][j] = rd.nextInt(2,30);
                System.out.println(m[i][j] + "\t");

                //verificar se estou na diagonal pricipal
                if (i==j){
                    dp+=m[i][j];
                }
                //verificar se estou na diagonal secundaria
                if (i+j==m.length-1){
                    ds+=m[i][j];
                }
            }
            System.out.println();

        }
        System.out.println("\n soma da diagonal principal " + dp);
        System.out.println("\n soma da diagonal secundaria  " + ds);
    }
}
