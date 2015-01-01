package Chapter03;
import java.util.Scanner;
/**
 * Created by Gerardo on 5/25/2014.
 */
public class MagicDates {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int day, month, year;

        System.out.print("Enter the day of your birth (DD): ");
        day = keyboard.nextInt();
        System.out.print("Enter the month of your birth (MM): ");
        month = keyboard.nextInt();
        System.out.print("Enter the year of your birth (YY): ");
        year = keyboard.nextInt();

        if(day * month == year)
            System.out.print(day + "/" + month + "/" + year + " is a magic date.");
        else
            System.out.print(day + "/" + month + "/" + year + " is not a magic date.");

    }
}
