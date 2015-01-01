package Chapter02;

/**
 * Created by Gerardo on 5/17/2014.
 */
public class LandCalculation {

    public static void main(String[] args) {
        int acre = 43560;
        int land = 389767;

        System.out.print("The total number of acres in a land of " + land + " feet is " +
                  + land/acre + " acres with " + land % acre + " feet left over.");
    }
}
