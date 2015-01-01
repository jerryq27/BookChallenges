package Chapter03;

import java.util.Scanner;

/**
 * Created by Gerardo on 12/23/2014.
 */
public class ShippingCharges {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the wight of the package in pounds: ");
        double weight = keyboard.nextDouble();
        double perFiveHundred = 0.00;
        if(weight > 10)
            perFiveHundred = 3.80;
        else if(weight > 6 && weight < 10)
            perFiveHundred = 3.70;
        else if(weight > 2 && weight < 6)
            perFiveHundred = 2.20;
        else if(weight <= 2)
            perFiveHundred = 1.10;

        System.out.print("\nThe price to ship the " + weight + " pound package " +
            "is $" + perFiveHundred + " per five-hundred miles.");
    }
}
