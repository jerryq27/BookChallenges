package Chapter02;

/**
 * Created by Gerardo on 5/16/2014.
 */
public class NameAndInitials {

    public static void main(String[] args) {

        String firstName = "Gerardo";
        String middleName = "Junior";
        String lastName = "Quintero";

        char firstInitial = 'G';
        char middleInitial = 'J';
        char lastInitial = 'Q';

        System.out.print(firstName + " " + middleName + " " + lastName + "\n" +
            firstInitial + "." + middleInitial + "." + lastInitial + ".");
    }
}
