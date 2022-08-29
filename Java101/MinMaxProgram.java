package Java101;

import java.util.Scanner;

public class MinMaxProgram {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the amount of the numbers that you will enter : ");
        int quantity = inp.nextInt();

        int min = 0, max = 0;
        int number;

        for(int i=0;i<quantity;i++){
            System.out.print("Enter a number : ");
            number = inp.nextInt();
            if(number<min)
                min = number;
            else if(number>max)
                max = number;
        }

        System.out.println("Min number is " + min);
        System.out.println("Max number is " + max);

    }
}
