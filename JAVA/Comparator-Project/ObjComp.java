import java.util.Comparator;

public class ObjComp implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
            return o1.toString().compareTo(o2.toString());

    }
}
