import java.util.List;

public class City {
    String name;
    List<Street> streets;

    public City(String name, List<Street> streets) {
        this.name = name;
        this.streets = streets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", streets=" + streets +
                '}';
    }
}
