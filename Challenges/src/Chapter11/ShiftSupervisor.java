package Chapter11;

/**
 * Created by Gerardo on 12/31/2014.
 */
public class ShiftSupervisor extends Employee {

    private double annualSalary;
    private double annualProductionBonus;

    public ShiftSupervisor(String n, String e, String d, double s, double b) {
        super(n, e, d);
        annualSalary = s;
        annualProductionBonus = b;
    }

    public ShiftSupervisor(String n, String e, String d) {
        super(n, e, d);
        annualSalary = 0.0;
        annualProductionBonus = 0.0;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualProductionBonus() {
        return annualProductionBonus;
    }

    public void setAnnualProductionBonus(double annualProductionBonus) {
        this.annualProductionBonus = annualProductionBonus;
    }

    public String toString() {
        return "Name: " + getName() + "\nEmpNum: " + getEmpNum() +
                "\nhireDate: " + getHireDate() + "\nannulaSalary: " + getAnnualSalary() +
                "\nannualProductionBonus: " + getAnnualProductionBonus();
    }

    public static void main(String[] args) {
        ShiftSupervisor supervisor = new ShiftSupervisor("BossMan", "555-B", "10/10/2010", 50000, 2000);
        ShiftSupervisor supervisor2 = new ShiftSupervisor("OtherBoss", "555-O", "10/10/2009");

        System.out.println(supervisor);
        System.out.print("\n" + supervisor2);
    }
}