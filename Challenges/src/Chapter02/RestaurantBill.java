package Chapter02;
import java.util.Scanner;
/**
 * Created by Gerardo on 5/19/2014.
 */
public class RestaurantBill {

    public static void main(String[] args) {
        final double TAX = 0.0675;
        final double TIP = 0.15;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the price of the meal: ");
        double mealPrice = keyboard.nextDouble();

        double taxPrice = mealPrice * TAX;
        double tipTotal = taxPrice * TIP;

        System.out.print("The price of the meal is $" + mealPrice + ", \nthe tax is $" +
                taxPrice + " and the tip is $" + tipTotal + ". \nThe total for the meal is $" +
                (taxPrice + tipTotal + mealPrice));
    }
}