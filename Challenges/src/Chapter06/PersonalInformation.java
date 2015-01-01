package Chapter06;

/**
 * Created by Gerardo on 12/23/2014.
 */
public class PersonalInformation {

    private String name, address, phone;
    private int age;

    public PersonalInformation(String n, String add, int a, String p) {
        name = n;
        address = add;
        age = a;
        phone = p;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        PersonalInformation info = new PersonalInformation("Jerry", "916 E. Street", 21, "402-418-2702");
        System.out.print(info.getName() + " " + info.getAddress() + " " + info.getAge() + " " + info.getPhone());
    }
}
