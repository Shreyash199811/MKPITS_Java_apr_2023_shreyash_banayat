import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add(11);
        hashSet.add(12);
        hashSet.add(13);
        hashSet.add(19);
        hashSet.add(13);
        hashSet.add(14);

        System.out.println(hashSet);
        System.out.println(hashSet.size());

        Set set=Set.of(11,22,33,44,55,66,77,88);
        System.out.println(set);

        Integer []numArray1={34,54,65,66};
        Integer []numArray2={44,65,12,43};

        HashSet hashSet1=new HashSet(Arrays.asList(numArray1));
        HashSet hashSet2=new HashSet(Arrays.asList(numArray2));

        System.out.println("********************Union*************************");

        System.out.println(hashSet1);
        System.out.println(hashSet2);

        HashSet unionOfSet1andSet2=new HashSet();
        unionOfSet1andSet2.addAll(hashSet1);
        unionOfSet1andSet2.addAll((hashSet2));



        System.out.println(unionOfSet1andSet2);

        System.out.println("********************Intersection*************************");
        HashSet intersetion=new HashSet();

        intersetion.addAll(hashSet1);
        intersetion.retainAll(hashSet2);
        System.out.println(intersetion);

        System.out.println("********************Difference*************************");

        hashSet1.removeAll(hashSet2);
        System.out.println(hashSet1);

        Iterator iterator= hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}