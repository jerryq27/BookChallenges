package Chapter03;

import java.util.Scanner;

/**
 * Created by Gerardo on 12/23/2014.
 */
public class SoftwareSales {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the number of packages purchased: ");
        int packages = keyboard.nextInt();
        double discount;

        if(packages >= 100)
            discount = 50.00;
        else if(packages >= 50 && packages <= 99)
            discount = 40.00;
        else if(packages >= 20 && packages <= 49)
            discount = 30.00;
        else if(packages >= 10 && packages <= 19)
            discount = 20.00;
        else
            discount = 00.00;


        if(discount == 00.00)
            System.out.print("\nSorry, no discount, the total purchase amount is $" + packages * 99.00);
        else
            System.out.print("\nThe total discount is %" + discount + ", and the calculated price is $" +
                    (packages * 99.00) * discount);
    }
}
