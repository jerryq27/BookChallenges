package Chapter09;

/**
 * Created by Gerardo on 12/31/2014.
 */
public class Area {

    public static double getArea(float pi, double radius) {
        return pi * (radius * radius);
    }
    public static double getArea(double length, double width) {
        return length * width;
    }
    public static double getArea(float pi, double radius, double height) {
        return pi * (radius * radius) * height;
    }

    public static void main(String[] args) {
        System.out.println("Circle: " + Area.getArea((float)Math.PI, 2));
        System.out.println("Rectangle: " + Area.getArea(12, 12));
        System.out.println("Cylinder: " + Area.getArea((float)Math.PI, 2, 5));
    }
}
