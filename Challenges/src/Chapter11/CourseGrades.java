package Chapter11;

/**
 * Created by Gerardo on 12/31/2014.
 */
public class CourseGrades implements Analyzable {

    private GradedActivity[] grades;

    public CourseGrades() {
        grades = new GradedActivity[4];
    }

    public void setLab(GradedActivity lab) {
        grades[0] = lab;
    }

    public void setPassFailExam(GradedActivity passFail) {
        grades[1] = passFail;
    }

    public void setEssay(GradedActivity essay) {
        grades[2] = essay;
    }

    public void setFinalExam(GradedActivity finalExam) {
        grades[3] = finalExam;
    }

    @Override
    public double getAverage() {
        //Add all scores, divide by 4, and return result.
        return 0;
    }

    @Override
    public GradedActivity getHighest() {
        //Compare scores of all GradedActivities and return highest.
        return null;
    }

    @Override
    public GradedActivity getLowest() {

        //Compare scores of all GradedActivities and return lowest.
        return null;
    }

    public String toString() {
        return "Lab: " + "\nPassFailExam: " + "\nEssay: " + grades[2].getScore() +
                " " + grades[2].getGrade() + "\nFinalExam: ";
    }

    public static void main(String[] args) {
        CourseGrades grades = new CourseGrades();
        GradedActivity essay = new Essay(20, 20, 10, 20);

        grades.setEssay(essay);
        System.out.print(grades);

    }
}
