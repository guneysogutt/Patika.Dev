package Java101;
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mass = -1,height = -1;
        double bmi;
        while(mass<0 && height<0)
        {
            System.out.print("Please enter your mass as kilograms : ");
            mass = input.nextDouble();
            System.out.print("Please enter your height as meters : ");
            height = input.nextDouble();
        }
        bmi = mass/Math.pow(height,2);
        System.out.println("You body-mass index is " + bmi);
    }
}
