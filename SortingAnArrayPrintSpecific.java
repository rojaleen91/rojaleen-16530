

import java.util.stream.Stream;

public class SortingAnArrayPrintSpecific {
    public static void main(String[] args) {
        //Find  element starting with "g" after sorting the stream
        String[] names = {"hghd" , "gfds" , "gewe" , "gtkj" , "ffssf", "fsdfsf" , "sfsfs"};
        Stream.of(names)
                .filter(x -> x.startsWith("g"))
                .sorted()
                .forEach(System.out :: println);
    }
}
