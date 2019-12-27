

import java.util.stream.Stream;

public class SortedandFindFirstStringUsingStream {
    public static void main(String[] args) {
    //Find first element after sorting the stream
        Stream.of("roja", "mama", "lucly")
                .sorted()
                .findFirst()
                .ifPresent(System.out :: println);
    }
}
