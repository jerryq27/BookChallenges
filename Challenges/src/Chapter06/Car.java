package Chapter06;

/**
 * Created by Gerardo on 12/23/2014.
 */
public class Car {

    private int yearModel, speed;
    private String make;

    public Car(int year, String m) {
        yearModel = year;
        make = m;
        speed = 0;
    }

    private int getYearModel() {
        return yearModel;
    }

    private int getSpeed() {
        return speed;
    }

    private String getMake() {
        return make;
    }

    private void accelerate() {
        speed += 5;
    }

    private void brake() {
        speed -= 5;
    }


    public static void main(String[] args) {
        Car car = new Car(2007, "Honda");

        for(int count = 0; count < 5; count++)
        {
            car.accelerate();
            System.out.println(car.getSpeed() + " mph");
        }
        for(int count = 0; count < 5; count++)
        {
            car.brake();
            System.out.println(car.getSpeed() + " mph");
        }
    }
}
