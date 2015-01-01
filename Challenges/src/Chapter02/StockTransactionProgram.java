package Chapter02;

/**
 * Created by Gerardo on 5/21/2014.
 */
public class StockTransactionProgram {

    public static void main(String[] args) {
        final double COMMISSION = 0.02;

        double shares = 1000;
        double priceEach = 32.87;

        System.out.print("Joe purchased " + shares + " for $" + priceEach + " resulting in a total of $" +
                (shares * priceEach) + " \nand his stockbroker received $" + ((priceEach * COMMISSION) * shares) +
                " as commission.");

        double priceSold = 33.92;

        System.out.print("\nTwo weeks later, Joe sold " + shares + " for $" + priceSold + " resulting in a total of $ " +
                (shares * priceSold) + "\nand his stockbroker received $" + ((priceSold * COMMISSION) * shares) +
                " as commission.");

        System.out.print("\nJoe paid a total of $" + (shares * priceEach) + " for the stock and sold the same " +
                "\namount of stock for $" + (shares * priceSold) + ". His stock broker received $" +
                ((priceEach * COMMISSION) * shares) + " for the purchase and $" + ((priceSold * COMMISSION) * shares)+
                "\nresulting in a loss for Joe of $" + (((shares * priceSold) - (shares * priceEach)) -
                (((priceEach * COMMISSION) * shares)) - (((priceSold * COMMISSION) * shares))) + ".");

    }
}
