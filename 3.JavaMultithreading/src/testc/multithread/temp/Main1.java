package testc.multithread.temp;

public class Main1 {

    public static void main(String[] args) {
        int k = 2;
        int[] array = {1, 2 ,3};

        for(int n : array) {
            if ( k < n) {
                System.out.println( "число " + n + " меньше k");
            }
            if ( k > n) {
                System.out.println( "число " + n + " больше k");
            }
            if ( k == n) {
                System.out.println( "число " + n + " равно k");
            }


            String str = "union";
            str = str.substring(1, str.length() -1 );
            System.out.println(str);

            int nz = 10;

            byte nza = (byte)nz;

            System.out.println(nza);


        }






    }








}
