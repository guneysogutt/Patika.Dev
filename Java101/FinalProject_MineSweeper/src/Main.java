import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int row = 1, column = 1;

        while(row <= 1 || column <= 1) {

            System.out.print("Enter the row size : ");
            row = inp.nextInt();

            System.out.print("Enter the column size : ");
            column = inp.nextInt();
        }
        MineSweeper game = new MineSweeper(row, column);

        game.start();
    }
}