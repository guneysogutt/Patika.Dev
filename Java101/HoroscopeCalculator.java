package Java101;
import java.util.Scanner;
public class HoroscopeCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int day,month;
        System.out.print("Enter the month you born : ");
        month = inp.nextInt();
        System.out.print("Enter the day you born : ");
        day = inp.nextInt();
        boolean isError = false;

        if(month==1){
            if(day>=1 && day<=31){
                if(day<20)
                    System.out.println("Capricorn");
                else
                    System.out.println("Aquarius");
            }
            else
                isError = true;
        }

        else if(month==2){
            if(day>=1 && day<=29){
                if(day<=18)
                    System.out.println("Aquarius");
                else
                    System.out.println("Pisces");
            }
            else
                isError = true;
        }

        else if(month==3){
            if(day>=1 && day<=31){
                if(day<=20)
                    System.out.println("Pisces");
                else
                    System.out.println("Aries");
            }
            else
                isError = true;
        }

        else if(month==4){
            if(day>=1 && day<=30){
                if(day<=19)
                    System.out.println("Aries");
                else
                    System.out.println("Taurus");
            }
            else
                isError = true;
        }

        else if(month==5){
            if(day>=1 && day<=31){
                if(day<=20)
                    System.out.println("Taurus");
                else
                    System.out.println("Gemini");
            }
            else
                isError = true;
        }

        else if(month==6){
            if(day>=1 && day<=30){
                if(day<=21)
                    System.out.println("Gemini");
                else
                    System.out.println("Cancer");
            }
            else
                isError = true;
        }

        else if(month==7){
            if(day>=1 && day<=31){
                if(day<=22)
                    System.out.println("Cancer");
                else
                    System.out.println("Leo");
            }
            else
                isError = true;
        }

        else if(month==8){
            if(day>=1 && day<=31){
                if(day<=22)
                    System.out.println("Leo");
                else
                    System.out.println("Virgo");
            }
            else
                isError = true;
        }

        else if(month==9){
            if(day>=1 && day<=30){
                if(day<=22)
                    System.out.println("Virgo");
                else
                    System.out.println("Libra");
            }
            else
                isError = true;
        }

        else if(month==10){
            if(day>=1 && day<=31){
                if(day<=22)
                    System.out.println("Libra");
                else
                    System.out.println("Scorpio");
            }
            else
                isError = true;
        }

        else if(month==11){
            if(day>=1 && day<=30){
                if(day<=21)
                    System.out.println("Scorpio");
                else
                    System.out.println("Sagittarius");
            }
            else
                isError = true;
        }

        else if(month==12){
            if(day>=1 && day<=31){
                if(day<=21)
                    System.out.println("Sagittarius");
                else
                    System.out.println("Capricorn");
            }
            else
                isError = true;
        }

        else
            isError = true;

        if(isError)
            System.out.println("You entered wrong dates. Please try again!!!");
    }
}
