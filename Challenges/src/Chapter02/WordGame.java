package Chapter02;
import java.util.Scanner;
/**
 * Created by Gerardo on 5/21/2014.
 */
public class WordGame {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name, age, city, college, profession, animal, pet;

        System.out.print("Enter your name: ");
        name = keyboard.nextLine();

        System.out.print("Enter your age: ");
        age = keyboard.nextLine();

        System.out.print("Enter the name of your city: ");
        city = keyboard.nextLine();

        System.out.print("Enter the name of your college: ");
        college = keyboard.nextLine();

        System.out.print("Enter a profession: ");
        profession= keyboard.nextLine();

        System.out.print("Enter a type of animal: ");
        animal = keyboard.nextLine();

        System.out.print("Enter your pet's name: ");
        pet = keyboard.nextLine();

        System.out.print("\nThere once was a person named " + name + " who lived in " + city + "." +
                " At the age of " + age + ", \n" + name + " went to college at " + college + ". " +
                name + " graduated and went to work as a \n" + profession + ". Then, " +
                name + " adopted a(n) "+ animal + " named " + pet + ". They both lived \nhappily " +
                "ever after!");
    }
}
