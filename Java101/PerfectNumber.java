package Java101;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = inp.nextInt();

        int summ = 0;

        for(int i=1;i<=number/2;i++){
            if(number%i==0)
                summ += i;
        }

        if(summ==number)
            System.out.println(number + " is a Perfect Number");
        else
            System.out.println(number + " is not a Perfect Number");
    }
}
