package Java101;
import java.util.Scanner;
public class RoundAreaCalculator {
    public static void main(String[] args) {
        // calculator of the given piece
        Scanner input = new Scanner(System.in);

        double pi = 3.14;
        double radius = -1,angle_of_the_piece = -1;
        double area_of_the_round;

        while(radius<0)
        {
            System.out.print("Please enter the radius of the round : ");
            radius = input.nextDouble();
            System.out.print("Please enter the angle of the round's piece : ");
            angle_of_the_piece = input.nextDouble();
        }

        area_of_the_round = pi*Math.pow(radius,2)*(angle_of_the_piece/360.0);
        System.out.println("Area of the piece is " + area_of_the_round);
    }
}
