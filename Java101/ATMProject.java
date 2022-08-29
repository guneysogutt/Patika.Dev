package Java101;

import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0)
        {
            System.out.print("Username :");
            userName = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123"))
            {
                System.out.println("Welcome to the Patika Bank!");
                do {
                        System.out.println("1-Deposit\n" +
                                "2-Withdraw\n" +
                                "3-Balance Check\n" +
                                "4-Exit");
                        System.out.print("Please select an action : ");
                        select = input.nextInt();
                        switch (select)
                        {
                            case 1:
                            {
                                System.out.print("Amount : ");
                                int price = input.nextInt();
                                balance += price;
                                break;
                            }
                            case 2:
                            {
                                System.out.print("Amount : ");
                                int price = input.nextInt();
                                if (price > balance)
                                    System.out.println("Insufficient Balance!");
                                else
                                    balance -= price;
                                break;
                            }
                            case 3:
                            {
                                System.out.println("Balance : " + balance);
                                break;
                            }
                        }
                } while (select != 4);
                System.out.println("Have a good day!");
                break;
            }
                 else
                 {
                    right--;
                    System.out.println("Incorrect username or password! Please try again!");
                    if (right == 0)
                        System.out.println("Your account has been blocked. Please contact with the bank!");
                    else
                        System.out.println("Remaining chance : " + right);
                }
        }

    }
}
