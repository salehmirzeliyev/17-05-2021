import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//        Consumer<String> consumer = item -> System.out.println("c1 - " + item);
//        Consumer<String> consumer2 = item -> System.out.println("c2 - " + item);
//
//        consumer.andThen(consumer2.andThen(consumer)).accept("Hello");
//        List<String> myList = Arrays.asList("Orxan", "Aytan", "Mammad");
//        myList.forEach(consumer.andThen(consumer2));

//        Predicate<String> predicate = item -> {
//            System.out.println(item);
//            return item.endsWith("A");
//        };
//        Predicate<String> predicate2 = item -> item.startsWith("B");
//        Predicate<String> predicate3 = item -> item.endsWith("C");
//        System.out.println(predicate.and(predicate2).test("BlmA"));
        List<Coffee> myList = Arrays.asList(new Coffee("Latte"), new Coffee("Espresso"));
//        Main main = new Main();

//        myList.sort((a, b) -> a.compareTo(b));
////        myList.sort(Main::comp);
//        System.out.println(myList);

//        Function<String, Integer> calculateLength = item -> item.length();
//        System.out.println(calculateLength.apply("dsasafsaofhdsiugfdwsifhgiujewiuewtye"));

        Function<String, Coffee> f = Coffee::new;

    }
    public  int comp(String a, String b){
        return a.compareTo(b);
    }
}
