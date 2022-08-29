package Java101;
import java.util.Scanner;
public class AverageCalculatorOfMultiplesOf12 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int number = 0;
        int sum = 0,counter = 0;
        double average;
        while(number<1)
        {
            System.out.print("Enter the limit number : ");
            number = inp.nextInt();
        }
        for (int i = 1; i<=number; i++)
        {
            if(i % 12 == 0)
            {
                sum += i;
                counter++;
            }
        }
        average = sum / counter;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
