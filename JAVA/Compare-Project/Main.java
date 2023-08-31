import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList studentList=new LinkedList();        //LinedList

        Students[] students=new Students[4];            //Object array
        students[0]=new Students("shubham",89);
        students[1]=new Students("abhay",97);
        students[2]=new Students("niraj",92);
        students[3]=new Students("prit",86);
        //adding elements to list    //converting an array into a list
        studentList.addAll(Arrays.asList(students));
        Collections.sort(studentList);

        for (Object p:studentList) {
            System.out.println(p.toString());
        }
    }
}