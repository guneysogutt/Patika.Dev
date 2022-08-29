package Java101;

import java.util.Scanner;

public class PrimeNumbersInTheGivenInterval {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the limit greater than 1 : ");
        int limit = inp.nextInt();

        if(limit<1)
            System.out.println("Please enter the limit greater than 1!");
        else {
            boolean flag;

           for (int i=2; i<=limit; i++){
               flag = false;
               for (int j=2; j<=i/2; j++){
                   if(i%j==0)
                       flag = true;
               }
               if(!flag)
                   System.out.print(i + " ");
           }
        }
    }
}
