package Chapter03;
import javax.swing.JOptionPane;
/**
 * Created by Gerardo on 6/14/2014.
 */
public class MassAndWeight {

    public static void main(String[] args) {
        String input;
        double answer;

        input = JOptionPane.showInputDialog(null, "Enter an object's mass: ", "Mass Input", 1);
        float mass = Float.parseFloat(input);

        answer = mass * 9.8;
        if(answer > 1000)
            JOptionPane.showMessageDialog(null, "The object weights " + answer + " Newtons. \nIt's too heavy!", "Answer", 1);
        else if(answer < 10)
            JOptionPane.showMessageDialog(null, "The object weights " + answer + " Newtons. \nIt's too light!", "Answer", 1);
        else
            JOptionPane.showMessageDialog(null, "The object weights " + answer + " Newtons.", "Answer", 1);

    }
}
