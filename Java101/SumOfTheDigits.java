package Java101;

import java.util.Scanner;

public class SumOfTheDigits {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String input = inp.nextLine();
        boolean flag = false;
        int summ = 0;
        if(!(input.charAt(0)<=57 && input.charAt(0)>=49))
            flag = true;
        if(flag)
            System.out.print("Please enter a number!");
        else{
            for (int i=0;i<input.length();i++) {
                if(!(input.charAt(i)<=57&&input.charAt(i)>=48)){
                    flag = true;
                    break;
                }
                else
                    summ += Integer.parseInt(input.substring(i,i+1));
            }
            if(flag)
                System.out.println("Please enter a number!");
            else
                System.out.println("The sum of the digits is " + summ);
        }

    }
}
