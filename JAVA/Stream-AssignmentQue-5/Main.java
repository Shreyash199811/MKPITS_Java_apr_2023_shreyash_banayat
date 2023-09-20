//Grouping and Counting
//Create a list of String and use a stream to group them by their length,and
//then count the number of strings in each group.
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    List<String> listOfNames=new LinkedList<>();
    listOfNames.add("ram");
    listOfNames.add("ved");
    listOfNames.add("Ria");
    listOfNames.add("ritu");
    listOfNames.add("sita");
    listOfNames.add("shyam");
    listOfNames.add("vikram");
    listOfNames.add("veda");

//    List listOfThreeLetters=listOfNames.stream().filter(n->(n.length()==3).collect(Collectors.toList());
//        System.out.println(listOfThreeLetters);

        Map<Integer,Long> map=listOfNames.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println("no. of letters"+"\t"+"Number of repetetions");
        map.forEach((key,value)->System.out.println(key+"\t\t\t\t"+value));
    }
}