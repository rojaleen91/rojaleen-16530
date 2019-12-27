

import java.util.stream.IntStream;

public class PrintIntegerStreamSkipMethod {

    public static void main(String[] args) {
        //IntegerStream skip upto 5
        IntStream.range(1, 10)
                .skip(5)
                .forEach(System.out ::println);
        System.out.println();
    }
}
