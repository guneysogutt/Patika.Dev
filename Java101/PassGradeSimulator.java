package Java101;
import java.util.Scanner;
public class PassGradeSimulator {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double math, physics, biology, chemistry;
        double average_grade = 0;

        System.out.print("Please enter your \'Math\' grade : ");
        math = inp.nextDouble();
        if(math >-1 && math < 101)
            average_grade += math;

        System.out.print("Please enter your \'Physics\' grade : ");
        physics = inp.nextDouble();
        if(physics >-1 && physics < 101)
            average_grade += physics;

        System.out.print("Please enter your \'Biology\' grade : ");
        biology = inp.nextDouble();
        if(biology >-1 && biology < 101)
            average_grade += biology;

        System.out.print("Please enter your \'Chemistry\' grade : ");
        chemistry = inp.nextDouble();
        if(chemistry >-1 && chemistry < 101)
            average_grade += chemistry;

        average_grade /= 4.0;
        System.out.println("Your average grade is " + average_grade);
        if (average_grade<55)
            System.out.println("Not passed!!");
        else
            System.out.println("Passed");
    }
}
