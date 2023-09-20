import java.util.Comparator;

public class Person implements Comparator<Person>{
    private String name;
    private int ageInYears;

    public Person(){}
    public Person(String personName,int personAge){
        name=personName;
        ageInYears=personAge;
    }

    public String getName() {
        return name;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public String toString(){
        return name+"\t"+ageInYears+"\n";
    }

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getAgeInYears()==o2.getAgeInYears())
            return 0;
        else if (o1.getAgeInYears()>o2.getAgeInYears()) {
            return -1;
        }
        else
            return 1;
    }
}
