package Java101;
import java.util.Scanner;
public class BasicLogInSimulation {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter your nickname or email : ");
        String nick_or_email = inp.nextLine();
        System.out.print("Create a new password : ");
        String password = inp.nextLine();

        String signed_email, signed_password;
        System.out.println("SIGNING UP IS SUCCESSFULLY COMPLETED!");

        System.out.print("Enter your email or nickname to login : ");
        signed_email = inp.nextLine();
        System.out.print("Enter your password to login : ");
        signed_password = inp.nextLine();

        if(!(signed_email.equals(nick_or_email)) || !(signed_password.equals(password)))
            System.out.println("Incorrect email or password. Please try again!!!");
        else
            System.out.println("Successfully logged in!!!");



    }
}
