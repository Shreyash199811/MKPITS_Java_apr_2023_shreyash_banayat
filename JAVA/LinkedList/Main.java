import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList lList=new LinkedList();
        lList.add(11);
        lList.add(22);
        lList.add(33);
        lList.add(44);
        lList.add(55);
        lList.add(66);
        lList.add(77);
        lList.add(88);
        lList.add(99);

        for(int iterate=0;iterate<lList.size();iterate++){
            System.out.print(lList.get(iterate)+"\t");
        }
        System.out.println();
        System.out.println("******************Iterator******************");

        Iterator iterator= lList.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
        System.out.println();
        System.out.println("**********************************************");

        lList.addFirst(00);
        System.out.println(lList);

        lList.addLast(111);
        System.out.println(lList);
        System.out.println("**********************************************");

        Object newList=lList.clone();       //This is an object not a List
        System.out.println("newList="+newList);

        System.out.println("*****************Using For each loop*****************************");

        for(Object integer:lList){
           System.out.print(integer+"\t");
       }


        LinkedList secondList=new LinkedList();
        secondList.add(5);
        secondList.add(6);
        secondList.add(7);
        secondList.add("8");
        secondList.add("Shreyash");

        for(Object iter:secondList){
            System.out.print(iter+"\t");
        }
        System.out.println();

        System.out.println(secondList.peekFirst());
        System.out.println(secondList.peekFirst());

    UserInputList userInputList=new UserInputList();
    userInputList.enteringNameInList();


        StudentInfo studentInfo=new StudentInfo();
        studentInfo.enteringData();





    }
}

