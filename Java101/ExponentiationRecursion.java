package Java101;

import java.util.Scanner;

public class ExponentiationRecursion {

    static int exponentiation(int number,int exponent,int result){

        if(exponent == 0)
            return result;

        else{
         result *= number;
         exponent--;
         return exponentiation(number,exponent,result);
        }
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int result = 1;

        System.out.print("Enter the base : ");
        int number = inp.nextInt();

        System.out.print("Enter the exponent : ");
        int exponent = inp.nextInt();

        System.out.println(number + " ^ " + exponent + " = " + exponentiation(number,exponent,result));
    }
}
