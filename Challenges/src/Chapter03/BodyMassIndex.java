package Chapter03;
import javax.swing.JOptionPane;
/**
 * Created by Gerardo on 6/14/2014.
 */
public class BodyMassIndex {

    public static void main(String[] args) {
        String input;

        input = JOptionPane.showInputDialog(null, "To measure your BMI, enter your weight: ", "Weight Input", 2);
        float weight = Float.parseFloat(input);

        input = JOptionPane.showInputDialog(null, "Enter your height (in inches): ", "Height Input", 2);
        float height = Float.parseFloat(input);

        float BMI = weight * (703/(height * height));
        String message = "";
        if(BMI >= 18.5 && BMI <= 25)
        {
            message = "your weight is optimal.";
        }
        else if(BMI < 18.5)
        {
            message = "you're underweight.";
        }
        else
        {
            message = "you're overweight.";
        }

        JOptionPane.showMessageDialog(null, "Your BMI is " + BMI + ", " + message);
    }
}