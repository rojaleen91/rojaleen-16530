

import java.util.Arrays;
import java.util.stream.Stream;

public class AverageSquaresIntegerArray {
    public static void main(String[] args) {
        //Find  average after double the numbers in integer array
        Arrays.stream(new int[]{6, 7, 5, 5, 5, 34, 78})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out :: println);
    }
}
