package Java101;
import java.util.Scanner;
public class TxiMeterCalculator {
    public static void main(String[] args) {
        double taxi_price_per_meter = 0.0022;
        Scanner input = new Scanner(System.in);
        double passed_meter = -1;
        double total_price = 0;
        while(passed_meter<0)
        {
            System.out.print("Please enter the passed meter length : ");
            passed_meter = input.nextDouble();
        }
        total_price = passed_meter * taxi_price_per_meter + 10.0;
        double qualified_price = total_price<20.0? 20.0: total_price;
        System.out.println("the taxi price is " + qualified_price);
    }
}
