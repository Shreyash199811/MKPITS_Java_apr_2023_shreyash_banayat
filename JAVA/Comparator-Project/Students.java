import java.util.Comparator;

public class Students {
    private String name;
    private int marks;
    Students(){
    }

    Students(String name,int marks){
        this.name=name;
        this.marks=marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String toString(){
        return name+" "+marks;
    }



}
