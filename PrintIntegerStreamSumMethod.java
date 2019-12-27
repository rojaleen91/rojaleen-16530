

import java.util.stream.IntStream;

public class PrintIntegerStreamSumMethod {
    public static void main(String[] args) {
        //Print Integer Stream with sum
        System.out.println(
                IntStream
                        .range(1, 10)
                .sum());

        System.out.println();

    }
}
