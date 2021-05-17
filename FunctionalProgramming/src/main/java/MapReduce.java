import java.util.concurrent.ForkJoinPool;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class MapReduce {
    public static void main(String[] args) {

//        Coffee c = IntStream.range(1, 100).
//                mapToObj(i -> new Coffee("Name" + i, 2 + (int)(Math.random() * 20)))
//                .reduce((a, b) -> a.price > b.price? a : b).get();
//
//        System.out.println(c);

//        int sum = IntStream.range(1, 300).
//                mapToObj(i -> new Coffee("Name" + i, 2 + (int)(Math.random() * 2))).parallel()
//                .peek(System.out::println)
//                .reduce(0, (a, b) ->{
//                    System.out.println("first");
//                    return  a += b.price;
//                }, (a, b) -> {
//                    System.out.println("second");
//                   return a += b;
//                });
//        System.out.println(sum);

        System.out.println(ForkJoinPool.commonPool().getParallelism());



    }
}
