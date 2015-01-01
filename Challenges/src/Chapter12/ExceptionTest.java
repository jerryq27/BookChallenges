package Chapter12;

/**
 * Created by Gerardo on 1/1/2015.
 */
public class ExceptionTest {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int count = 0;
        try {
            for(int dex = 0; dex <= 5; dex++)
            {
                count += nums[dex];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("\nBad Array!!");
        }
    }
}
