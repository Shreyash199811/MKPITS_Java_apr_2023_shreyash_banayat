package AnonymousClassComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Students> studentList=new LinkedList<>();
        Students[] students=new Students[5];
        students[0]=new Students("shubham",89);
        students[1]=new Students("abhay",97);
        students[2]=new Students("niraj",92);
        students[3]=new Students("prit",86);
        students[4]=new Students("Namita",72);

        studentList.addAll(Arrays.asList(students));
//      Compare marks using Anonymous
        Collections.sort(studentList, new Comparator<Students>() {

            @Override
            public int compare(Students o1, Students o2) {
                if (o1.getMarks() == o2.getMarks()) {
                    return 0;
                } else if (o1.getMarks() < o2.getMarks()) {
                    return -1;
                } else
                    return 1;
            }
        });
        System.out.println("Using Marks=>"+studentList);
//      Compare name using Anonymous
        Collections.sort(studentList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Using name=>"+studentList);

//      Compare marks using lambda
        Comparator<Students> sortMarks=( o1, o2)->{

            if(o1.getMarks()==o2.getMarks())
                return 0;
                //> for descending < for ascending
            else if ((o1.getMarks()>o2.getMarks())) {
                return -1;
            }
            else{
                return 1;
            }
        };
        Collections.sort(studentList,sortMarks);
        System.out.println("Using Marks=>"+studentList);

//      Compare name using lambda

        Comparator<Students> sortName=(name1,name2)->{
           return  name1.getName().compareTo(name2.getName());
        };

        Collections.sort(studentList,sortName);
        System.out.println("Using name=>"+studentList);


    }
}
