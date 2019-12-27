package Streams;

interface Left{
    default void m1(){
     System.out.println("left default method");
    }
}

interface Right{
    default void m1(){
        System.out.println("right default method");
    }
}

public class DefaultMethodWrtInheritance implements Left, Right {

        //As both interface contains same method name compiler give unrelated default method for m1()
        public void m1 () {
            //we can override the method
            System.out.println("my own implementation");
            //we can access m1() of Left interface by using super
            Left.super.m1();
            //we can access m1() of Right interface by using super
            Right.super.m1();
        }
    public static void main(String[] args) {
        DefaultMethodWrtInheritance dw = new DefaultMethodWrtInheritance();
        dw.m1();
    }
    }

