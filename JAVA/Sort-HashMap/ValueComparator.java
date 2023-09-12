import java.util.*;

public class ValueComparator implements Comparator<TreeMap> {


    @Override
    public int compare(TreeMap o1, TreeMap o2) {
        if(o1.values().hashCode() == o2.values().hashCode()){
            return 0;
        } else if (o1.values().hashCode() < o2.values().hashCode()) {
            return -1;
        }
        else
            return 1;
    }
}
