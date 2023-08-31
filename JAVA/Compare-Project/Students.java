public class Students implements Comparable<Students>{

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


    @Override
    public int compareTo(Students student) {
            if(marks==student.marks) {
                return 0;
            } else if (marks<student.marks) {
                return -1;
            }
            else {
                return 1;
            }
    }

}
