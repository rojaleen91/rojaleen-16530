

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TextFileReading {
    public static void main(String[] args) throws IOException {
        Stream<String> bands = Files.lines(Paths.get("C:\\Users\\nisum\\IdeaProjects\\Javastreams\\src\\main\\java\\band.txt"));
        bands
                .sorted()
                .filter( x -> x.length() > 3)
                .forEach(System.out :: println);
                ;
                bands.close();
    }
}
