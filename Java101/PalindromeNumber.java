package Java101;

import java.util.Scanner;

public class PalindromeNumber {
    static boolean PalindromeOrNot(String input){
        String frst = "", last = "";

        if (input.length() %2 == 0){

            for (int i = 0; i<input.length()/2; i++)
                frst += input.substring(i,i+1);

            for (int i = input.length()-1; i>=input.length()/2; i--)
                last += input.substring(i,i+1);
        }
        else{

            for (int i = 0; i<input.length()/2; i++)
                frst += input.substring(i,i+1);

            for (int i = input.length()-1; i>=input.length()/2+1; i--)
                last += input.substring(i,i+1);
        }

        if(frst.equals(last))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String input = inp.nextLine();

        boolean flag = !(input.charAt(0) <= 57 && input.charAt(0) >= 49);

        if(flag)
            System.out.println("Please enter a number!");

        else {
            for (int i = 0; i < input.length(); i++)
                if (!(input.charAt(i) <= 57 && input.charAt(i) >= 48))
                    flag = true;

            if (flag)
                System.out.print("Please enter a number!");
            else {
                boolean result = PalindromeOrNot(input);
                System.out.println(result);
            }
        }
    }
}
