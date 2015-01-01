package Chapter02;
import java.util.Scanner;
/**
 * Created by Gerardo on 5/19/2014.
 */
public class TestAverage {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter three test scores. \nTest Score 1: ");
        double score1 = keyboard.nextDouble();
        System.out.print("Test Score 2: ");
        double score2 = keyboard.nextDouble();
        System.out.print("Test Score 3: ");
        double score3 = keyboard.nextDouble();

        System.out.print("\nThe three test scores are " + score1 + ", " + score2 + ", and " + score3 + "." +
                "\nAverage: " +  (score1 + score2 + score3)/3);
    }
}
