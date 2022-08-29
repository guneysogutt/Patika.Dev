package Java101;

import java.util.Scanner;

public class FibonacciNumbersRecursion {
    static int FibonacciNumbers(int limit, int n1, int n2){
        if(limit == 0)
            return 1;
        else{
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            limit--;
            n1 = n2;
            n2 = n3;
            return FibonacciNumbers(limit,n1,n2);
        }
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the limit : ");
        int limit = inp.nextInt();

        int n1 = 0, n2 = 1;

        System.out.print(n1 + " " + n2 + " ");
        FibonacciNumbers(limit-2,n1,n2);
    }
}
