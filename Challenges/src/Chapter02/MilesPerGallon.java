package Chapter02;
import java.util.Scanner;
/**
 * Created by Gerardo on 5/19/2014.
 */
public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the number of miles driven: ");
        double miles = keyboard.nextDouble();

        System.out.print("\nEnter the number of gallons used: ");
        double gallons = keyboard.nextDouble();

        System.out.print("\n\nMiles per Gallon: " + miles/gallons);
    }
}
