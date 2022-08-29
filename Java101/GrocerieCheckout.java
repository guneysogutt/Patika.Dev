package Java101;
import java.util.Scanner;
public class GrocerieCheckout {
    public static void main(String[] args) {
        // grocerie checkout calculator

        double pear =2.14,apple = 3.67,tomatoes = 1.11,banana = 0.95,aubergine = 5.00;
        double pear_kg =-1,apple_kg = -1,tomatoes_kg = -1,banana_kg = -1,aubergine_kg = -1;

        Scanner input = new Scanner(System.in);

        while(pear_kg<0&&apple_kg<0&&tomatoes_kg<0&&banana_kg<0&&aubergine_kg<0)
        {
            System.out.print("ENter the kilograms of the pears : ");
            pear_kg = input.nextDouble();

            System.out.print("ENter the kilograms of the apple : ");
            apple_kg = input.nextDouble();

            System.out.print("ENter the kilograms of the tomatoes : ");
            tomatoes_kg = input.nextDouble();

            System.out.print("ENter the kilograms of the banana : ");
            banana_kg = input.nextDouble();

            System.out.print("ENter the kilograms of the aubergine : ");
            aubergine_kg = input.nextDouble();
        }

        System.out.println("Pear price : " + pear*pear_kg);
        System.out.println("Apple price : " + apple*apple_kg);
        System.out.println("Tomatoes price : " + tomatoes*tomatoes_kg);
        System.out.println("Banana price : " + banana*banana_kg);
        System.out.println("Aubergine price : " + aubergine*aubergine_kg);

    }
}
