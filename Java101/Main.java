package Java101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // grade average calculating program

        Scanner input = new Scanner(System.in);

        int input_math,input_phy,input_che,input_bio; //input variables
        int sum_math = 0,sum_phy = 0,sum_che = 0,sum_bio = 0; // sum variables
        double av_math,av_phy,av_che,av_bio,av_general; // average variables

        for (int m = 1;m<=3;m++) // loop for input operation
        {
            System.out.print("Enter the math " + m + " : ");
            input_math = input.nextInt();
            sum_math+=input_math;

            System.out.print("Enter the phy " + m + " : ");
            input_phy = input.nextInt();
            sum_phy+=input_phy;

            System.out.print("Enter the che " + m + " : ");
            input_che = input.nextInt();
            sum_che+=input_che;

            System.out.print("Enter the bio " + m + " : ");
            input_bio = input.nextInt();
            sum_bio+=input_bio;
        }
        // calculating process of the averages
        av_math = sum_math/3.0;
        av_phy = sum_phy/3.0;
        av_che = sum_che/3.0;
        av_bio = sum_bio/3.0;
        av_general = (av_math +av_phy+av_che+av_bio)/4.0;

        boolean check = av_general>60;
        int check1 = check? 1:0;
        String check2 = check1==1? "Passed" : "Not passed";
        System.out.println(check2);
    }
}
