package Java101;

import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int a, b;

        System.out.print("Enter the first number : ");
        a = inp.nextInt();
        System.out.print("Enter the second number : ");
        b = inp.nextInt();

        int a2 = a, b2 = b;

        //GCD
        int gcd = 0;

        while (b != 0)
        {
            gcd = a % b;
            a = b;
            b = gcd;
        }
        System.out.println("Great common divisor is " + a);

        //LCM
        int x, y, lcm;
        x = a2;
        y = b2;

        while (a2 != b2)
        {
            if (a2 > b2)
                a2 = a2 - b2;
            else
                b2 = b2 - a2;
        }

        lcm = (x * y) / a2;
        System.out.println("Least Common Multiple is: " + lcm);
    }
}
