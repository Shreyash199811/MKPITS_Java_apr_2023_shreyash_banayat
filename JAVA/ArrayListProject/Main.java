import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList aList=new ArrayList();
        aList.add(10);
        aList.add(20);
        aList.add(30);
        aList.add(40.45);
        aList.add("Java-ArrayList");
        System.out.println(aList);
        System.out.println("Size of arraylist="+aList.size());

        System.out.println("******************Print Using for loop******************");
        for(int element=0;element<aList.size();element++){
            System.out.println(aList.get(element));
        }

        //Print using Iterator
        System.out.println("******************Iterator******************");
        Iterator iterator= aList.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
        System.out.println();
        System.out.println("******************Print using  Iterator******************");
        List secondList=new ArrayList();
        System.out.println(secondList.addAll(aList));

        System.out.println("*******************Using For each***************************");

        for(Object iter:aList){
            System.out.println(iter);
        }


    }
}