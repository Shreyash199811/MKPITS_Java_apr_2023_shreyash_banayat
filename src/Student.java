public class Student {

    private String rollNo;
    private String stud_Name;
    private String stud_address;

    public Student(){}

    public Student(String rollNo, String stud_Name, String stud_address) {
        this.rollNo = rollNo;
        this.stud_Name = stud_Name;
        this.stud_address = stud_address;
    }
    public Student(String rollNo){
        this.rollNo = rollNo;
    }

    public String getRollNo(){
        return rollNo;
    }

    public String getStud_Name() {
        return stud_Name;
    }

    public String getStud_address() {
        return stud_address;
    }

}
