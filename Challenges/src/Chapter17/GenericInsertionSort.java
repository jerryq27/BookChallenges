package Chapter17;

/**
 * Created by Gerardo on 2/9/2015.
 */
public class GenericInsertionSort<T extends Comparable<T>> {

    private T[] array;

    public GenericInsertionSort(T[] list) {
        array = list;
    }

    public void insertionSort() {
        T unsortedVal;
//       CAUSED AN ERROR: Why?
//        int scan;
//
//        for(T value : array)
//        {
//            unsortedVal = value;
//            scan = 1;
//
//            while(scan > 0 && array[scan - 1].compareTo(unsortedVal) > 0)
//            {
//                array[scan] = array[scan - 1];
//                scan--;
//            }
//            array[scan] = unsortedVal;
//            scan++;
//        }

        for(int dex = 0; dex < array.length; dex++)
        {
            unsortedVal = array[dex];
            while(dex > 0 && array[dex - 1].compareTo(unsortedVal) > 0)
            {
                array[dex] = array[dex - 1];
                dex--;
            }
            array[dex] = unsortedVal;
        }

    }

    public void printArray() {
        for(int dex = 0; dex < array.length; dex++)
        {
            System.out.print(array[dex] + " ");
        }
    }


    public static void main(String[] args) {
        Short[] list = {7, 2, 5};
        GenericInsertionSort<Short> sortedList = new GenericInsertionSort<Short>(list);
        sortedList.insertionSort();
        sortedList.printArray();
    }
}