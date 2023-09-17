//Sorting
//Create a list of Strings and use a stream to sort them in ascending order
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    List<String> studNames=new LinkedList<>();
    studNames.add("Shreyash");
    studNames.add("Namita");
    studNames.add("Prajwal");
    studNames.add("Nachiket");
    studNames.add("Kaustabh");
    studNames.add("Vipul");
    studNames.add("Akanksha");
    studNames.add("Ritu");

    System.out.println(studNames);

    studNames=studNames.stream().sorted().collect(Collectors.toList());
    System.out.println(studNames);

    }
}