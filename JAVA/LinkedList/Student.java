public class Student {
    private int marks;
    private String name;
    public Student(){}
    public Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }

    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }

    public String toString(){
       return name+"\t"+marks;
    }
}
