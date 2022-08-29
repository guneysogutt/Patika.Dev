package Java101;
import java.util.Scanner;
public class FlightPriceCalculator {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double distance, price;
        int age, selection;

        System.out.print("Enter the travel distance in km : ");
        distance = inp.nextDouble();
        System.out.print("Enter your age : ");
        age = inp.nextInt();
        System.out.print("Enter the type of the trip (1 => One Way, 2 => Round-Trip) : ");
        selection = inp.nextInt();

        if(age >= 0 && distance >0 && (selection > 0 && selection <= 2))
        {
            price = distance * 0.1;
            if(age<12)
                price -= price * 0.5;
            else if(age<25)
                price -= price * 0.1;
            else if(age>65)
                price -= price * 0.3;

            if (selection==2)
            {
                price -= price * 0.2;
                price = price * 2;
            }
            System.out.println("Your total flight price is " + price);
        }

        else
            System.out.println("You entered wrong infos!!!");
    }
}
