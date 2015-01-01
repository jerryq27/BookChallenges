package Chapter11;

/**
 * Created by Gerardo on 12/31/2014.
 */
public class Essay extends GradedActivity {

    private double grammarScore, spellingScore, lengthScore, contentScore;

    public Essay(double g, double s, double l, double c) {
        grammarScore = g;
        spellingScore = s;
        lengthScore = l;
        contentScore = c;

        setScore(g + s + l + c);
    }

    public static void main(String[] args) {
        Essay scoreOne = new Essay(30, 20, 20, 30);
        Essay scoreTwo = new Essay(20, 20, 10, 20);
        System.out.println(scoreOne.getGrade());
        System.out.print(scoreTwo.getGrade());
    }

}