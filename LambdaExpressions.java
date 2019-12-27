package Streams;

interface Interf{
    public void m1();
}

public class LambdaExpressions {
    int x = 10;

    public void m2() {
        int y = 20;
        Interf i = () -> {
            System.out.println(x);
            System.out.println(y);
        };
        i.m1();
    }
    public static void main (String[] args)
    {
        LambdaExpressions ls = new LambdaExpressions();
        ls.m2();
    }

}

