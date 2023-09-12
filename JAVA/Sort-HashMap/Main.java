import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> sortedMap=new HashMap<>();
        sortedMap.put(11,"Abhay");
        sortedMap.put(14,"Chaturvedi");
        sortedMap.put(12,"Ganesh");
        sortedMap.put(10,"Brijesh");
        sortedMap.put(44,"hutch");
        sortedMap.put(78,"Mru");
        sortedMap.put(1,"Skew");
        sortedMap.put(3,"ki");
        sortedMap.put(45,"ice");
        sortedMap.put(788,"hi");
        sortedMap.put(13,"Dinesh");

        Iterator iterator=sortedMap.keySet().iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
        System.out.println();

//        Set set=sortedMap.entrySet();
//        iterator=set.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next()+"\t");
//            System.out.println();
//        }


        Map<Integer,String> treeMap=new TreeMap<>(sortedMap);
        System.out.println("treeMap=>");
        System.out.println(treeMap);

        Collection<String> collection= treeMap.values();


        Collections.sort(collection,new ValueComparator());
`1

    }
}

