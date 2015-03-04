package Chapter17;

/**
 * Created by Gerardo on 3/4/2015.
 */
public class GenericBinarySearch<T extends Comparable<T>> {

    private T[] list;

    public GenericBinarySearch(T[] objs) {
        list = objs;
    }

    public int binarySearch(T value) {
        int first;
        int middle;
        int last;
        int position;
        boolean found;

        first = 0;
        last = list.length - 1;
        position = -1;
        found = false;

        while(!found && first <= last)
        {
            middle = (first + last)/2;

            //If the value is at the midpoint.
            if(list[middle].compareTo(value) == 0)
            {
                found = true;
                position = middle;
            }
            //else if value is in the upper half.
            else if(list[middle].compareTo(value) > 0)
                last = middle - 1;
            //Else if value is in the lower half.
            else
                first = middle + 1;
        }
        return position;
    }

    public static void main(String[] args) {
        Byte[] bytes = {2, 5 ,7, 9, 11, 13, 15, 17, 19};
        GenericBinarySearch binarySearch = new GenericBinarySearch(bytes);
        Byte value = 17;
        int position = binarySearch.binarySearch(value);

        if(position != -1)
            System.out.println("The value " + value + " was found at position " + position + " in the list.");
        else
            System.out.println("The value " + value + " was not in the list.");
    }
}