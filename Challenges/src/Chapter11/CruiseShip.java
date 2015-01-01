package Chapter11;

/**
 * Created by Gerardo on 1/1/2015.
 */
public class CruiseShip extends Ship {

    private int numOfPassengers;

    public CruiseShip(String n, String y, int p) {
        super(n, y);
        numOfPassengers = p;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nNumber of Passengers: " + getNumOfPassengers();
    }
}
