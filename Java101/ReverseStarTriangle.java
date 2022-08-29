package Java101;

import java.util.Scanner;

public class ReverseStarTriangle {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the line number : ");
        int n = inp.nextInt();

        for (int i = n-1; i >= 0 ; i--){
            for (int j = n-i; j > 0; j--)
                System.out.print(" ");
            for (int k = (2 * i + 1); k >=1 ; k--)
                System.out.print("*");

            System.out.println(" ");
        }
    }
}
