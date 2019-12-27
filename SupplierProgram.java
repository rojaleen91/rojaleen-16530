

import java.util.function.Supplier;

public class SupplierProgram {

    public static void main(String[] args) {
        //Use of supplier functional interface
        Supplier<String> sp = () -> {String[] s1={"ssss", "dfdfd", "fsfsfds"};
                                    int x = (int)Math.random()*3+1 ;
                                    return s1[x];


        };
        System.out.println(sp.get());
        System.out.println(sp.get());
        System.out.println(sp.get());



    }
}


