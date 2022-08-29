package Java101;
import java.util.Scanner;
public class ChineseZodiacCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int birth_year, zodiac_int;
        String zodiac_name = "";
        System.out.print("Please enter your birth year : ");
        birth_year = inp.nextInt();
        zodiac_int = birth_year % 12;
        switch(zodiac_int)
        {
            case 0:
                zodiac_name = "Monkey";
                break;
            case 1:
                zodiac_name = "Rooster";
                break;
            case 2:
                zodiac_name = "Dog";
                break;
            case 3:
                zodiac_name = "Pig";
                break;
            case 4:
                zodiac_name = "Rat";
                break;
            case 5:
                zodiac_name = "Ox";
                break;
            case 6:
                zodiac_name = "Tiger";
                break;
            case 7:
                zodiac_name = "Rabbit";
                break;
            case 8:
                zodiac_name = "Dragon";
                break;
            case 9:
                zodiac_name = "Snake";
                break;
            case 10:
                zodiac_name = "Horse";
                break;
            case 11:
                zodiac_name = "Goat";
                break;
            default:
                zodiac_name = "You entered wrong info";
                break;
        }
        System.out.println("Your zodiac is \'" + zodiac_name + "\'");
    }
}
