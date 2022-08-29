package Java101;

import java.util.Scanner;

public class Minus5Plus5 {

    static int PatternHomework(int number1,int number2,boolean flag){
        if(number1 == number2 + 5)
            return 1;

        else if(!flag) {
            System.out.print(number1 + " ");
            number1+=5;
        }

        else if(number1<=0)
            flag = false;

        else if(flag) {
            System.out.print(number1 + " ");
            number1-=5;
        }

        return PatternHomework(number1,number2,flag);

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number1 = inp.nextInt();
        boolean flag = true;
        int number2 = number1;
        PatternHomework(number1,number2,flag);
    }
}
