package Chapter17;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Gerardo on 2/9/2015.
 */
public class PointList<T extends Point> {

    private ArrayList<T> list;

    public PointList() {
        list = new ArrayList<T>();
    }

    public void add(T item) {
        list.add(item);
    }

    public T getItem(int dex) {
        return list.get(dex);
    }

    public static void main(String[] args) {
        Point point = new Point(1, 2);
        Point point2 = new Point(2, 2);
        Point point3 = new Point(77, 77);
        PointList<Point> list = new PointList<Point>();
        list.add(point);
        list.add(point2);
        list.add(point3);

        System.out.print(list.getItem(2));
    }



}
