

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("raju", "saritha" , "roja") ;
        for(String name : names){
            if (!name.equals("raju")){
                System.out.println(name);
            }
        }
         List l1= names.stream()
                .filter(name -> !name.equals("raju")).collect(Collectors.toList());
        System.out.println(l1);
    }
}

