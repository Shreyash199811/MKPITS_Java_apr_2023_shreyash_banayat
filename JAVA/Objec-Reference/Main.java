public class Main {
    public static void main(String[] args) {
//    giving reference of static method to functional interface
    MyInterface myInterface=MyClass::display;
    myInterface.disp();
//    Runnable runnable=MyClass::display;
//    Thread thread=new Thread(runnable);
//    thread.start();

//    giving reference of non-static method to functional interface
        MyClass myClass=new MyClass();
        SecondInterface secondInterface=myClass::exhibit;
        secondInterface.show();

//    giving reference of constructor to functional interface
        StudInterface studInterface= Student::new;
//        Student student=studInterface.getStudent(11,"Shreyash");
        Student student=studInterface.getStudent();

    }
}