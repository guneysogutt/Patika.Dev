import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);


        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;


        while (right < 5) {
            System.out.print("Please enter your prediction : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter the number between 0-100.");
                if (isWrong) {
                    right++;
                    System.out.println("You entered too many wrong values. Remaining : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("If you enter wrong again, your right will be decreased by 1.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congrats! Correct prediction! Predicted number : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Wrong number !");
                if (selected > number) {
                    System.out.println(selected + " is greater than the mystery number.");
                } else {
                    System.out.println(selected + " is less than the mystery number.");
                }

                wrong[right++] = selected;
                System.out.println("Remaining : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lose!!! ");
            if (!isWrong) {
                System.out.println("Your predictions : " + Arrays.toString(wrong));
            }
        }
    }
}
