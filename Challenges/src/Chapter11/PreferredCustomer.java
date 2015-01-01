package Chapter11;

/**
 * Created by Gerardo on 12/31/2014.
 */
public class PreferredCustomer extends Customer {

    private double purchaseAmount;
    private int discountLevel;

    public PreferredCustomer(String n, String a, String p, int num, boolean list, double amount, int level) {
        super(n, a, p, num, list);
        purchaseAmount = amount;
        discountLevel = level;
    }

    public PreferredCustomer(String n, String a, String p, int num, boolean list) {
        super(n, a, p, num, list);
        purchaseAmount = 0.0;
        discountLevel = 0;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public int getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(int discountLevel) {
        this.discountLevel = discountLevel;
    }


    public static void main(String[] args) {
        PreferredCustomer cust1 = new PreferredCustomer("Lisa", "SomeStreet", "333-333-3333", 123, true, 2000, 4);
        PreferredCustomer cust2 = new PreferredCustomer("John", "SomeOther Street", "444-444-4444", 456, false);

        System.out.print(cust1 + "\n" + cust2);
    }
}