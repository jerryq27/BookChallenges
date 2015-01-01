package Chapter11;

/**
 * Created by Gerardo on 12/31/2014.
 */
public class Customer extends Person {

    private int custNum;
    private boolean isOnMailingList;

    public Customer(String n, String a, String p, int num, boolean list) {
        super(n, a, p);
        custNum = num;
        isOnMailingList = list;
    }

    public int getCustNum() {
        return custNum;
    }

    public void setCustNum(int custNum) {
        this.custNum = custNum;
    }

    public boolean isOnMailingList() {
        return isOnMailingList;
    }

    public void setOnMailingList(boolean isOnMailingList) {
        this.isOnMailingList = isOnMailingList;
    }

    public String toString() {
        return "Name: " + getName() + "\nAddress: " + getAddress() + "\nPhone: " + getPhone() +
                "\nCustNum: " + getCustNum() + "\nOnMailingList? " + isOnMailingList();
    }

    public static void main(String[] args) {
        Customer customer = new Customer("John", "123 Some Street", "555-555-5555", 12345, true);
        System.out.print(customer);
    }
}
