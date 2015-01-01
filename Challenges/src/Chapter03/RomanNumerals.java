package Chapter03;
import java.util.Scanner;
/**
 * Created by Gerardo on 5/25/2014.
 */
public class RomanNumerals {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number between 1-10: ");
        int testNum = keyboard.nextInt();
        if(testNum > 0 && testNum <= 10)
        {
            System.out.print("The roman numeral for " + testNum + " is: ");
            switch (testNum)
            {
                case 1:
                    System.out.print("I");
                    break;
                case 2:
                    System.out.print("II");
                    break;
                case 3:
                    System.out.print("III");
                    break;
                case 4:
                    System.out.print("IV");
                    break;
                case 5:
                    System.out.print("V");
                    break;
                case 6:
                    System.out.print("VI");
                    break;
                case 7:
                    System.out.print("VII");
                    break;
                case 8:
                    System.out.print("VIII");
                    break;
                case 9:
                    System.out.print("IX");
                    break;
                case 10:
                    System.out.print("X");
                    break;
            }
        }
        else
            System.err.print("That number isn't between 1 and 10!");
    }
}
