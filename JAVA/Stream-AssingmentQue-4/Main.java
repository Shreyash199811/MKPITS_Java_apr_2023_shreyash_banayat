//Combining Operations:
//Create a list of Integer and use a stream to filter out the even numbers,
// double each remaining numbers,and then find the sum of the doubled numbers.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int sum=0;
        List<Integer> numberList= Arrays.asList(33,34,24,20,45,23,27,16);
        System.out.println(numberList);

        numberList=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("Even numbers=>"+numberList);

        numberList=numberList.stream().map(n->n*2).collect(Collectors.toList());
        System.out.println("Doubled Numbers=>"+numberList);

        for (Integer iterator:numberList) {
            sum=sum+iterator;
        }
        System.out.println("sum of numbers is ="+sum);
    }
}