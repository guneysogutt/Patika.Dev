package Java101;
import java.util.Scanner;
public class AreaCalculatorOfATriangle {
    public static void main(String[] args) {
        // area calculator of a triangle

        Scanner input = new Scanner(System.in);
        double side_a = -1,side_b = -1,side_c = -1;
        double area_u,area;

        while(side_a<0&&side_b<0 &&side_c<0)
        {
            System.out.print("Please enter the first side : ");
            side_a = input.nextDouble();
            System.out.print("Please enter the second side : ");
            side_b = input.nextDouble();
            System.out.print("Please enter the third side : ");
            side_c = input.nextDouble();
        }

        area_u = (side_a+side_b+side_c)/2.0;
        area = Math.pow((area_u*(area_u-side_a)*(area_u-side_b)*(area_u-side_c)),0.5);

        System.out.println("The area of the triangle is "+area);

    }
}
