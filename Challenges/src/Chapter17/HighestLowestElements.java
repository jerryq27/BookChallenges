package Chapter17;

import java.awt.*;

/**
 * Created by Gerardo on 3/4/2015.
 */
public class HighestLowestElements<T extends Comparable<T>> {

    private T[] list;

    public HighestLowestElements(T... array) {
        list = array;
    }

    public T getHighest() {
        T highest = list[0];

        for(int count = 0; count < list.length; count++)
        {
            if(highest.compareTo(list[count]) < 0)
                highest = list[count];
        }
        return highest;
    }

    public T getLowest() {
        T lowest = list[0];

        for(int count = 0; count < list.length; count++)
        {
            if(lowest.compareTo(list[count]) > 0)
                lowest = list[count];
        }
        return lowest;
    }

    public static void main(String[] args) {
        Float[] floats = {0.5f, 0.3f, 0.7f};
        HighestLowestElements search = new HighestLowestElements(floats);

        System.out.println(search.getHighest());
        System.out.println(search.getLowest());
    }
}