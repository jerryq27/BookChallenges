package Chapter17;

import java.util.ArrayList;

/**
 * Created by Gerardo on 2/9/2015.
 */
public class MyListMod <T extends Comparable<T>> implements Comparable<MyListMod> {

    private ArrayList<T> list = new ArrayList<T>();

    public void add(T num) {
        list.add(num);
    }

    public T largest() {
        T largest = list.get(0);

        for(T value : list) {
            if (((Comparable) value).compareTo(largest) > 0)
                largest = value;
        }
        return largest;
    }

    public T smallest() {
        T smallest = list.get(0);

        for (T value : list) {
            if (((Comparable) value).compareTo(smallest) < 0)
                smallest = value;
        }
        return smallest;
    }

    @Override
    public int compareTo(MyListMod o) {
        return 0;
    }

    public static void main(String[] args) {
        MyListMod<Byte> list = new MyListMod<Byte>();
        list.add((byte) 7);
        list.add((byte) 2);
        list.add((byte) 4);
        System.out.print(list.smallest() + " " + list.largest());

        MyListMod<String> stringList = new MyListMod<String>();
        stringList.add("Adam");
        stringList.add("Sam");
        stringList.add("Zack");
        System.out.print("\n" + stringList.smallest() + " " + stringList.largest());
    }
}