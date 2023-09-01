import java.util.Comparator;

public class MarksComp implements Comparator<Students> {


    @Override
    public int compare(Students o1, Students o2) {
        if(o1.getMarks()==o2.getMarks()){
            return 0;
        } else if (o1.getMarks() < o2.getMarks()) {
            return -1;
        }
        else
            return 1;
    }
}
