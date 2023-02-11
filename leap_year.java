import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {

        int year;
        int rem4;
        int rem100;
        int rem400;

        System.out.println("Enter the 4 digits of a year, e.g. 1990: ");
        Scanner sccc = new Scanner(System.in);
        year = sccc.nextInt();
        sccc.close();

        rem4 = year % 4;
        rem100 = year % 100;
        rem400 = year % 400;

        if (rem100==0 && rem400!=0){

            System.out.println("Year " + year + " is not a leap year.");
        }

        else{
            System.out.println("Year " + year + " is a leap year.");
        }
    }
}