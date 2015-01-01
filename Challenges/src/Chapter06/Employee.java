package Chapter06;
/**
 * Created by Gerardo on 12/23/2014.
 */
public class Employee {

    private String name, department, position;
    private int idNumber;

    public Employee(String n, int id, String d, String p) {
        name = n;
        idNumber = id;
        department = d;
        position = p;
    }

    public Employee(String n, int id) {
        name = n;
        idNumber = id;
        department = "";
        position = "";
    }

    public Employee() {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public static void main(String[] args) {
        Employee Emp1 = new Employee("Susan Meyers",  47899, "Accounting", "Vice President");
        Employee Emp2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee Emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        System.out.println("Name   ID Number   Department   Position");
        System.out.println("----------------------------------------");
        System.out.print(Emp1.getName() + "   " + Emp1.getIdNumber() + "   " + Emp1.getDepartment() + "   " + Emp1.getPosition() +
                "\n" + Emp2.getName() + "   " + Emp2.getIdNumber() + "   " + Emp2.getDepartment() + "   " + Emp2.getPosition() +
                "\n" + Emp3.getName() + "   " + Emp3.getIdNumber() + "   " + Emp3.getDepartment() + "   " + Emp3.getPosition());
    }
}