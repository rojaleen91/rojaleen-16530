package assignments;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main (String args[]) {
    int a[]  = new int[5];
    a[0] = 1;
    a[1] = 2;
    a[2] = 3;
    a[3] = 35;
    //Use of stream
    Arrays.stream(a).forEach(System.out::println);
    }
}
