package Chapter11;

/**
 * Created by Gerardo on 12/31/2014.
 */
public class Employee {

    private String name;
    private String EmpNum;
    private String hireDate;

    public Employee(String n, String e, String h) {
        name = n;
        EmpNum = e;
        hireDate = h;
    }

    public Employee(String n, String e) {
        name = n;
        EmpNum = e;
        hireDate = "xx/xx/xxxx";
    }

    public String getEmpNum() {
        return EmpNum;
    }

    public void setEmpNum(String empNum) {
        EmpNum = empNum;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
