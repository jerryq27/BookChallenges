package Chapter11;

/**
 * Created by Gerardo on 12/31/2014.
 */
public class Person {

    private String name, address, phone;

    public Person(String n, String a, String p) {
        name = n;
        address = a;
        phone = p;
    }

    public Person() {
        name = "";
        address = "";
        phone = "XXX-XXX-XXXX";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
