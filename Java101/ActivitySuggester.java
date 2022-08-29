package Java101;
import java.util.Scanner;
public class ActivitySuggester {
    public static void main(String[] args) {

        double weather_temperature;
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter the current weather temperature : ");
        weather_temperature = inp.nextDouble();

        if(weather_temperature < 5.0)
            System.out.println("You can go \'Skiing\'");
        else if(weather_temperature <= 25.0)
        {
            if(weather_temperature <= 15.0)
                System.out.println("You can go \'Cinema\'");
            if(weather_temperature >= 15.0)
                System.out.println("You can go \'Picnic\'");
        }
        else
            System.out.println("You can go \'Swimming\'");
    }
}
