import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List list=new LinkedList();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);
        list.add(77);
        list.add(88);

        ListIterator listIterator= list.listIterator();

        while(listIterator.hasNext()){
            System.out.print(listIterator.next()+"\t");
        }
        System.out.println();

        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+"\t");
        }
    }
}