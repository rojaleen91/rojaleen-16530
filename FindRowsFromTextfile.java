

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FindRowsFromTextfile {
    public static void main(String[] args) throws IOException {
        List<String> bands = Files.lines(Paths.get("C:\\Users\\nisum\\IdeaProjects\\Javastreams\\src\\main\\java\\band.txt"))
                .filter(x -> x.contains("k"))
                .collect(Collectors.toList());

       bands.forEach(x -> System.out.println(x));

    }
}
