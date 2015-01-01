package Chapter11;

/**
 * Created by Gerardo on 1/1/2015.
 */
public class CargoShip extends Ship {

    private int cargoCapacity;

    public CargoShip(String n, String y, int cap) {
        super(n, y);
        cargoCapacity = cap;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nCargo Capacity: " + getCargoCapacity();
    }


    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new CruiseShip("SS Anne", "July 12, 1991", 2000);
        ships[1] = new CargoShip("12-2X10", "May 12, 1995", 5000);
        ships[2] = new Ship("NewShip", "January 1, 2015");

        for(int dex = 0; dex < ships.length; dex++)
        {
            System.out.print(ships[dex].toString() + "\n\n");
        }
    }
}
