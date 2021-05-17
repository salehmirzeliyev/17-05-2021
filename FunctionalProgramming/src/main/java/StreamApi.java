import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
//        Optional<String> o = Optional.of("adadfd");
//        o.ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));
//        List<String> names = Arrays.asList()
//        List<String> coffees = Arrays.asList("Affe", "Bjhrjet", "Adfdgfgfjh");
//        coffees.stream()
//                .peek(System.out::println)
//                .filter(item -> item.startsWith("A"))
//                .map(item -> item.toUpperCase())
//                .forEach(System.out::println);

        List<City> cities = Arrays
                .asList(new City("Baki", Arrays.asList(new Street("A. Aiyev"),
                        new Street("Dadash Bunyadzade"), new Street("Nizami")))
                , new City("Sumqayit", Arrays.asList(new Street("Pushkin"),
                                new Street("M.Araz"), new Street("Fuzuli"))));
        List<Street> streets = cities.stream().flatMap(item -> item.getStreets().stream())
                .peek(System.out::println)
                .collect(Collectors.toList());



    }
}
