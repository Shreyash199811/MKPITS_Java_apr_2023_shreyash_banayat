import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//FlatMap
//Create a list of lists of integers and use a stream to flattern the structure (i.e. merge all the lists into one )
//and then calculate the sum of all the integers
public class Main {
    public static void main(String[] args) {
    List <List<Integer>> listOfList=new ArrayList<>();
    listOfList.add(Arrays.asList(11,22,33,44,55));
    listOfList.add(Arrays.asList(101,202,303,404,505));
    listOfList.add(Arrays.asList(11,22,33,44,55));
    listOfList.add(Arrays.asList(100,200,300,400,500));
        System.out.println(listOfList);

    List<Integer> mergedList=listOfList.stream().flatMap(l->l.stream()).collect(Collectors.toList());
    System.out.println("Merged List=>"+mergedList);
    int total=mergedList.stream().reduce(0,Integer::sum);
        System.out.println("Total=>"+total);
    }
}