package Java101;

import java.util.Scanner;

public class PrimeNumberRecursion {

    static int PrimeOrNot(int number,int divider){
        if(divider == 1)
            return 1;
        else if (number % divider == 0)
            return 0;
        else{
            divider--;
            return PrimeOrNot(number,divider);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = inp.nextInt();

        int divider = number/2;

        if(number == 1 || PrimeOrNot(number,divider) == 0 )
            System.out.println(number + " is not prime");
        else
            System.out.println(number + " is prime");
    }
}
