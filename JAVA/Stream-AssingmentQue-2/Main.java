import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Mapping
//Create a list of Integers and use a stream to double each integer in the list.
public class Main {
    public static void main(String[] args) {
        List<Integer> intList=new ArrayList();
        intList.add(24);
        intList.add(3);
        intList.add(6);
        intList.add(44);
        intList.add(11);
        intList.add(20);

        intList=intList.stream().map(i->2*i).collect(Collectors.toList());
        System.out.println(intList);

    }
}