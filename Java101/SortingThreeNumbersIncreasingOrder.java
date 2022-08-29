package Java101;
import java.util.Scanner;
public class SortingThreeNumbersIncreasingOrder {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int number1,number2,number3;

        System.out.print("Enter the first number : ");
        number1 = inp.nextInt();

        System.out.print("Enter the second number : ");
        number2 = inp.nextInt();

        System.out.print("Enter the third number : ");
        number3 = inp.nextInt();

        if(number1>number2 && number1>number3) {
            if (number2 > number3)
                System.out.println("num3 < num2 < num1");
            else if (number2 < number3)
                System.out.println("num2 < num3 < num1");
            else
                System.out.println("num3 = num2 < num1");
        }
        else if(number2>number1 && number2>number3)
        {
            if(number1>number3)
                System.out.println("num3 < num1 < num2");
            else if (number1<number3)
                System.out.println("num2 < num3 < num1");
            else
                System.out.println("num3 = num1 < num2");
        }
        else if(number3>number1 && number3>number2)
        {
            if(number1>number2)
                System.out.println("num2 < num1 < num3");
            else if (number1<number2)
                System.out.println("num1 < num2 < num3");
            else
                System.out.println("num2 = num1 < num3");
        }
    }
}
