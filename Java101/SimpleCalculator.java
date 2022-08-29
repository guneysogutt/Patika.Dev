package Java101;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {

        int n1,n2,select;
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the first number : ");
        n1 = input.nextInt();
        System.out.print ("Enter the second number : ");
        n2= input.nextInt();
        System.out.println("1-Sum\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print ("Your Choice : ");
        select = input.nextInt();
        switch(select)
        {
            case 1: System.out.println("Sum : "+ (n1 + n2)); break;
            case 2: System.out.println("Subtraction :"+ (n1 - n2)); break;
            case 3: System.out.println("Multiplication : " + (n1 * n2)); break;
            case 4:
                if(n2==0)
                    System.out.println("Error: You cannot be able to divide a number by \'0\'");
                else
                    System.out.println("Division"+ (n1 / n2));
                break;
            default:
                System. out.println("You've made a wrong selection. Please try again."); break;
        }
    }
}
