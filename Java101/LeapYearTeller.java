package Java101;
import java.util.Scanner;
public class LeapYearTeller {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = inp.nextInt();

        boolean isLeapYear = false;

        if(year % 4 == 0 && year % 100 != 0)
            isLeapYear = true;
        else if (year % 100 == 0 && year % 400 == 0)
            isLeapYear = true;

        if (isLeapYear)
            System.out.println(year + " is a leap year!");
        else
            System.out.println(year + " is not a leap year!");
    }
}
