package Chapter11;

/**
 * Created by Gerardo on 12/31/2014.
 */
public class TeamLeader extends ProductionWorker {

    private double monthlyBonus;
    private double trainingHoursNeeded;
    private double trainingHoursAttended;

    public TeamLeader(String n, String e, String d, int s, double w, double m, double need, double attended) {
        super(n, e, d, s, w);
        monthlyBonus = m;
        trainingHoursNeeded = need;
        trainingHoursAttended = attended;
    }

    public TeamLeader(String n, String e, String d, int s, double w) {
        super(n, e, d, s, w);
        monthlyBonus = 0.0;
        trainingHoursNeeded = 0.0;
        trainingHoursAttended = 0.0;
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public double getTrainingHoursAttended() {
        return trainingHoursAttended;
    }

    public void setTrainingHoursAttended(double trainingHoursAttended) {
        this.trainingHoursAttended = trainingHoursAttended;
    }

    public double getTrainingHoursNeeded() {
        return trainingHoursNeeded;
    }

    public void setTrainingHoursNeeded(double trainingHoursNeeded) {
        this.trainingHoursNeeded = trainingHoursNeeded;
    }

    public String toString() {
        return "Name: " + getName() + "\nEmpNum: " + getEmpNum() +
                "\nhireDate: " + getHireDate() + "\nshift: " + getShift() +
                "\nhourlyWage: " + getHourlyWage() + "\nmonthlyBonus: " + getMonthlyBonus() +
                "\ntrainingHoursNeeded: " + getTrainingHoursNeeded() + "\ntrainingHours Attended: " + getTrainingHoursAttended();
    }

    public static void main(String[] args) {
        TeamLeader lead = new TeamLeader("Tim", "888-T", "02/02/2002", 1, 15.00, 1000, 40, 35);
        TeamLeader lead2 = new TeamLeader("Hugh", "999-H", "03/03/2003", 2, 15.00);

        System.out.println(lead);
        System.out.print("\n" + lead2);
    }
}