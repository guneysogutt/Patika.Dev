package Java101;
import java.sql.SQLOutput;
import java.util.Scanner;
public class PowersOf4And5Printer {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = inp.nextInt();

        if(number < 0)
            System.out.println("Please enter a positive integer");

        else{
            int i = 0;
            double power_4=-1, power_5=-1;

            System.out.println("Powers of 4 :");
            while(power_4 <= number){
                power_4 = Math.pow(4,i);
                if(power_4<=number)
                    System.out.println(power_4);
                else
                    break;
                i++;
            }
            i = 0;
            System.out.println("Powers of 5 :");

            while(power_5 <= number){
                power_5 = Math.pow(5,i);
                if(power_5<=number)
                    System.out.println(power_5);
                else
                    break;
                i++;
            }
        }
    }
}
