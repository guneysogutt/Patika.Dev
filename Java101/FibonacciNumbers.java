package Java101;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the limit : ");
        int limit = inp.nextInt();

        int n1=0,n2=1,n3;

        System.out.print(n1+" "+n2);//printing 0 and 1

        for(int i=2;i<limit;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
