package Chapter02;
import java.util.Scanner;
/**
 * Created by Gerardo on 5/19/2014.
 */
public class CircuitBoardProfit {

    public static void main(String[] args) {
        final double percent = 0.4;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the price for the circuit board: $");
        double price = keyboard.nextDouble();
        System.out.print("The profit for the circuit board is $" + percent * price);
    }
}
