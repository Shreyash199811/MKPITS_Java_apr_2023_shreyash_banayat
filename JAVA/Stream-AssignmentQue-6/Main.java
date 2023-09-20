//Finding Max and Min
//Creating a list of Objects
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    Person[] person=new Person[6];
    person[0]=new Person("Shreyash",25);
    person[1]=new Person("Abhi",23);
    person[2]=new Person("Mru",22);
    person[3]=new Person("Pk",24);
    person[4]=new Person("teju",23);
    person[5]=new Person("Pranay",25);

    List<Person> listOfPerson=new ArrayList<>();
    listOfPerson.addAll(Arrays.asList(person));

//    listOfPerson=listOfPerson.stream().filter(p->p.getAgeInYears()<=p.getAgeInYears()).collect(Collectors.toList());
//        System.out.println(listOfPerson);

    Person minimumAge=listOfPerson.stream().min(Comparator.comparingInt(Person::getAgeInYears)).get();//Returns Object
        System.out.println("Minimum age is ="+minimumAge.getAgeInYears());

    Person maxAge=listOfPerson.stream().max(Comparator.comparingInt(Person::getAgeInYears)).get();//Returns Object
        System.out.println("Maximum age is ="+maxAge.getAgeInYears());

    }
}