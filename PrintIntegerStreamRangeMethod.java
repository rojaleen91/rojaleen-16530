
import java.util.stream.IntStream;

public class PrintIntegerStreamRangeMethod {
    public static void main(String[] args) {
    //Print Integer Stream
        IntStream.range(1, 10)
                .forEach(System.out ::print);
        System.out.println();
    }
}
