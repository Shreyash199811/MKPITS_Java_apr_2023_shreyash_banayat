import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Using Predicates
//Create a list of integers and  use a stream to filter out numbers greater than 10
// using a custom predicate
public class Main {
    public static void main(String[] args) {
        List<Integer> numberList= Arrays.asList(33,34,2,5,9,4,6,24,20,5,23,27,16);
        Predicate<Integer> lessThanTen=number->number<10;
        List list=numberList.stream().filter(lessThanTen).collect(Collectors.toList());
        System.out.println(list);
    }
}