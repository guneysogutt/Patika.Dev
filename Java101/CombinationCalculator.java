package Java101;
import java.util.Scanner;
public class CombinationCalculator {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n,r;
        System.out.print("Enter \'n\' : ");
        n = inp.nextInt();
        System.out.print("Enter \'r\' : ");
        r = inp.nextInt();

        double combinationResult;
        int nFacto = 1,rFacto = 1, nmrFacto = 1;

        for(int i = n; i>0;i--)
            nFacto *= i;
        for(int i = r; i>0;i--)
            rFacto *= i;
        for(int i = n-r; i>0;i--)
            nmrFacto *= i;

        combinationResult = nFacto / (rFacto * nmrFacto);

        if(combinationResult==0)
            System.out.println("You entered wrong numbers!!");
        else
            System.out.println("C(" + n + "," + r + ") = " + combinationResult);
    }
}
