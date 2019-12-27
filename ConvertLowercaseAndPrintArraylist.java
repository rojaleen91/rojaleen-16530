

import java.util.Arrays;
import java.util.List;

public class ConvertLowercaseAndPrintArraylist {

    public static void main(String[] args) {

        // Convert the arraylist string to lowercase and print the arraylist starting with specific letter
        List<String> people = Arrays.asList("fsdfs" , "ffsasa" , "gfdgdg" , "ghfgg") ;
        people
                .stream()
                .map(String :: toLowerCase)
                .filter(x -> x.startsWith("f"))
                .forEach(System.out :: println);
    }
}
