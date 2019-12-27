

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProgramEvenNo {
    public static void main(String[] args) {
        ArrayList<Integer> ai=new ArrayList<Integer>();
        ai.add(34);
        ai.add(53);
        ai.add(96);
        ai.add(40);
        ai.add(73);
        ai.add(39);
        ai.add(92);
        System.out.println(ai);
        //Without using Stream
        ArrayList<Integer> evenlist=new ArrayList<Integer>();
        for (Integer i : ai){
            if (i % 2 == 0) {
                evenlist.add(i);
            }
        }
        System.out.println(evenlist);
        //Use of Stream
        List l1 = ai.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(l1);

    }
    }

