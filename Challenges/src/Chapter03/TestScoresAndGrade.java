package Chapter03;
import javax.swing.JOptionPane;
/**
 * Created by Gerardo on 6/14/2014.
 */
public class TestScoresAndGrade {

    public static void main(String[] args) {
        String input;
        float average;
        String grade;

        input = JOptionPane.showInputDialog(null, "Enter the first test score: ", "Score Input", 3);
        float first = Float.parseFloat(input);

        input = JOptionPane.showInputDialog(null, "Enter the second the test score: ", "Score Input", 3);
        float second = Float.parseFloat(input);

        input = JOptionPane.showInputDialog(null, "Enter the last test score: ", "Score Input", 3);
        float third = Float.parseFloat(input);

        average = (first + second + third)/3;

        if(average <= 100 && average >= 90)
            grade = "A";
        else if(average <= 89 && average >= 80)
            grade = "B";
        else if(average <= 79 && average >= 70)
            grade = "C";
        else if(average <= 69 && average >= 60)
            grade = "D";
        else
            grade = "F";
        JOptionPane.showMessageDialog(null, "With an average of " + average + " your letter grade is a(n) " + grade  + ".", "Grade", 3);
    }
}
