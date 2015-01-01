package Chapter02;

/**
 * Created by Gerardo on 5/20/2014.
 */
public class StockCommission {

    public static void main(String[] args) {
        double amountPaid = 600 * 21.77;
        double commission = (21.77 * 0.02) * 600;
        double total = amountPaid + commission;

        System.out.print("Kathryn paid $" + amountPaid + " for the stock, " +
                "\nthe commission at 2% per stock is $" + commission +
                ",\nResulting in a total of $" + total);
    }
}
