

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProgramMultiplyNo {
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
        ArrayList<Integer> multipleList=new ArrayList<Integer>();
        for (Integer i : ai){
            multipleList.add(i * 2);
        }
        System.out.println(multipleList);
        //Use of Stream
        List l1 = ai.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(l1);

    }
}

