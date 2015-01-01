package Chapter02;
import java.util.Scanner;
/**
 * Created by Gerardo on 5/17/2014.
 */
public class SalesTax {

    public static void main(String[] args) {
        final double STATE_TAX = 0.04;
        final double COUNTY_TAX = 0.02;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double purchase = keyboard.nextDouble();
        double total = purchase + (purchase * STATE_TAX) + (purchase * COUNTY_TAX);

        System.out.print("\nPurchase amount: $" + purchase +
                   "\nState Tax: $" + (purchase * STATE_TAX) +
                   "\nCounty Tax: $" + (purchase * COUNTY_TAX) +
                   "\nTotal Tax: $" + ((purchase*STATE_TAX) + (purchase * COUNTY_TAX)) +
                   "\nSale Total: $" + total);
    }
}
