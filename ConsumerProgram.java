
import java.util.function.Consumer;
public class ConsumerProgram {

    public static void main(String[] args) {
        //Use of consumer functional interface
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Hello");
        c.accept("Roja");

    }
}

