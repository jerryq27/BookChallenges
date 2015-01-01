package Chapter02;

/**
 * Created by Gerardo on 5/20/2014.
 */
public class EnergyDrinkConsumption {

    public static void main(String[] args) {
        final double CUSTOMERS = 12467.00;
        final double PURCHASE_PERCENT = 0.14;
        final double FLAVORED_PREFERANCE = 0.64;

        System.out.print("A total of " + CUSTOMERS + " were surveyed, " + (PURCHASE_PERCENT*CUSTOMERS) +
                " purchased one or more energy drinks per week, \nand " + ((PURCHASE_PERCENT*CUSTOMERS)*FLAVORED_PREFERANCE) +
                " preferred citrus-flavored energy drinks.");
    }
}
