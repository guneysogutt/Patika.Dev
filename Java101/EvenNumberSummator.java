package Java101;
import java.util.Scanner;
public class EvenNumberSummator {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int number = 0,summ = 0;

        while(number %2 == 0){

            System.out.print("Enter a number : ");
            number = inp.nextInt();
            if(number %4 == 0)
                summ += number;
        }

        System.out.print("Sum of the numbers is " + summ);
    }
}
