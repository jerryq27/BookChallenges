package Chapter02;
import java.util.Scanner;
/**
 * Created by Gerardo on 5/19/2014.
 */
public class StringManipulator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the name of your favorite city: ");
        String city = keyboard.nextLine();

        System.out.print("Number of characters: " + city.length() +
                "\nUpper Case: " + city.toUpperCase() +
                "\nLower Case: " + city.toLowerCase() +
                "\nFirst Character: " + city.charAt(0));
    }
}
