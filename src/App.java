import java.util.Arrays;
import java.util.Scanner;

public class App {

      
    public static void main(String[] args) throws Exception {


        /////
        /////
        /////
        /////
        /////
        /////
        /////               the easy way 
        /////
        /////
        /////
        /////
        /////
        /////
        /////
        /////

        Scanner inputs = new Scanner(System.in);
        System.out.println("enter a number to to turn into binary form");
        int n ;
        n = inputs.nextInt();
        int[]  b= new int[100];
        int i =0;
        while(n > 0)
        
        {
        b[i++] = n%2;
           n = n/2;
        }        
       b =  Arrays.copyOfRange(b, 0, i-1);
        System.out.println(Arrays.toString(b).replace(",", "").replace("[", "").replace("]", "") );
        // System.out.println("at first array was ");
        // System.out.println("array reverse is ");

        // /////
        // /////
        // /////
        // /////
        // /////
        // /////
        // /////               the HARD way 
        // /////
        // /////
        // /////
        // /////
        // /////
        // /////
        // /////
        // /////
        // for (int i = 0; i < n/2; i++) {
        //   int x = data[i];
        //   int y = data[n-i-1];
        //     x = x - y;
        // y =x+y;
        // x = y-x;
        //   data[i] = x;
        //   data[n-i-1] = y;
        // }
        
        // System.out.println("HARD IS "+Arrays.toString(data) );


        inputs.close();

    }
}
