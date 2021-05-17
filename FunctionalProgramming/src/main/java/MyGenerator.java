import java.util.function.Supplier;

public class MyGenerator {
    Supplier<String> generator;

    public MyGenerator(Supplier generator) {
        this.generator = generator;
    }
    public void print(){
        System.out.println(generator.get());
    }
}
