
package javaapplication1;

import java.util.Comparator;
import java.io.Serializable;

public class MyPoint implements Serializable, Comparator<MyPoint> {

    Integer x, y, z;

    public MyPoint(int xx, int yy, int zz) {
        x = xx;
        y = yy;
        z = zz;
    }

    @Override
    public int compare(MyPoint p1, MyPoint p2) {
        if (p1.x.compareTo(p2.x) != 0) {
            return p1.x.compareTo(p2.x);
        } else {
            if (p1.y.compareTo(p2.y) != 0) {
                return p1.y.compareTo(p2.y);
            } else {
                if (p1.z.compareTo(p2.z) != 0) {
                    return p1.z.compareTo(p2.z);
                } else {
                    return 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        MyPoint pp1 = new MyPoint(1, 2, 3);
        MyPoint pp2 = new MyPoint(2, 1, 3);
        int difference = pp1.compare(pp1, pp2);
        System.out.println(difference);
    }
}
