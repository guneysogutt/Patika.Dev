package Java101;

import java.util.Scanner;

public class AdvancedCalculator {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print("Number" + i++ + " : ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("The quantity of the numbers that you will enter : ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print("Number" + i + " : ");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print("Number" + i++ + " : ");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("The quantity of the numbers that you will enter :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print("Number" + i + " : ");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cant enter 0 for divider!");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base = scan.nextInt();
        System.out.print("Enter the exponent : ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }

    static void modding() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scan.nextInt();

        System.out.print("Enter the mod number that you want to do : ");
        int mod_number = scan.nextInt();

        System.out.println("Result : " + number%mod_number);
    }

    static void rectangularAreaAndPerimeter(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first side : ");
        int side1 = scan.nextInt();

        System.out.print("Enter second side : ");
        int side2 = scan.nextInt();

        int area = side1 * side2;
        int perimeter = (side1 + side2) * 2;

        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponentiation\n"
                + "6- Factorial\n"
                + "7- Modding\n"
                + "8- Rectangular area and perimeter\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Please select an operation : ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modding();
                    break;
                case 8:
                    rectangularAreaAndPerimeter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered a wrong selection!!");
            }
        } while (select != 0);
    }
}