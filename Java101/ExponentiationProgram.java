package Java101;

import java.util.Scanner;

public class ExponentiationProgram {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n1,n2;

        System.out.print("Enter the base : ");
        n1 = inp.nextInt();
        System.out.print("Enter the power : ");
        n2 = inp.nextInt();

        int result =1;

        for (int i = 0;i < n2; i++){
            result *= n1;
        }

        System.out.println(n1 + " ^ " + n2 + " = " + result);
    }
}
