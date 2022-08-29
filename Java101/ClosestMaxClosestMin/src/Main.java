import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = inp.nextInt();
        int[] list = {15,12,788,1,-1,-778,2,0};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        int numberMin = min;
        int numberMax = max;

        for (int i : list) {
            if (i < number && i > numberMin) {
                numberMin = i;
            }
            if (i > number && i < numberMax) {
                numberMax = i;
            }
        }

        System.out.println("Minimum Value " + numberMin);
        System.out.println("Maximum Value " + numberMax);

    }
}
