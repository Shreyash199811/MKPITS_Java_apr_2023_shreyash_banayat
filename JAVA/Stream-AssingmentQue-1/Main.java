//Filtering and collecting
//Create a list of Strings and use a Stream to filter out strings that start with the letter "A".
//Collect the filtered strings into a new list.
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    List<String> cities=new ArrayList<>();
    cities.add("Nagpur");
    cities.add("Pune");
    cities.add("Wardha");
    cities.add("Mumbai");
    cities.add("Thane");
    cities.add("Kolhapur");
    cities.add("NAnded");
    cities.add("Nashik");

    List<String> citiesWithAnA=new ArrayList<>();

    citiesWithAnA=cities.stream().filter(c->c.contains("a")).collect(Collectors.toList());
    System.out.println(citiesWithAnA);
    }
}