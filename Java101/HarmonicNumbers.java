package Java101;

import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int number;

        System.out.print("Enter a number : ");
        number = inp.nextInt();

        double result = 0;

        for(int i=1;i<=number;i++)
            result += Math.pow(i,-1);

        System.out.println("The sum of the Harmonic numbers is " + result);
    }
}
