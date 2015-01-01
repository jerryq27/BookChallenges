package Chapter11;

/**
 * Created by Gerardo on 1/1/2015.
 */
public class Ship {

    private String name;
    private String yearBuilt;

    public Ship(String n, String y) {
        name = n;
        yearBuilt = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nYear Built: " + getYearBuilt();
    }
}