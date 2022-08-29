package Java101;
import java.util.Scanner;
public class VATCalculator {
    public static void main(String[] args) {

        // Price calculating by including VAT

        Scanner input = new Scanner(System.in);
        
        double priceWithVAT = 0;
        double price=-1;
        
        while(price<0)
        {
            System.out.print("Please enter the price : ");
            price = input.nextDouble();
        }
        
        double vat = price<1000? 0.18 : 0.8;
        priceWithVAT = price + price * vat;
        System.out.println("Price with VAT : " + priceWithVAT);

    }
}
