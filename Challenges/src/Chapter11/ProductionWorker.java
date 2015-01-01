package Chapter11;

/**
 * Created by Gerardo on 12/31/2014.
 */
public class ProductionWorker extends Employee {

    private int shift; //Day shift 1, night shift 2.
    private double hourlyWage;

    public ProductionWorker(String n, String e, String h, int s, double w) {
        super(n, e, h);
        shift = s;
        hourlyWage = w;
    }

    public ProductionWorker(String n, String e, String h) {
        super(n, e, h);
        shift = 0;
        hourlyWage = 0.0;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public String toString() {
        return "Name: " + getName() + "\nEmpNum: " + getEmpNum() +
                "\nhireDate: " + getHireDate() + "\nshift: " + getShift() +
                "\nhourlyWage: " + getHourlyWage();
    }


    public static void main(String[] args) {
        ProductionWorker worker = new ProductionWorker("Jim", "111-J", "02/11/2013", 1, 12.00);
        ProductionWorker worker2 = new ProductionWorker("Sam", "222-S", "03/12/2013");

        System.out.println(worker);
        System.out.print(worker2);

    }
}
