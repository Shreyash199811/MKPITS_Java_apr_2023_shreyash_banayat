import java.util.Scanner;

public class Main {

    enum WeekDays{Mon(1),Tue(2),Wed(3),Thu(4),Fri(5),Sat(6),Sun(7);
    int value;
    WeekDays(int value){
        this.value=value;
    }
    }

    public static void main(String[] args) {
//        enum Months{January,February,March,April,May,June,July,August,September,October,November,December;}
//
//        Months months=Months.January;
//
//        switch(months)
//        {
//            case January:
//            case March:
//            case May:
//            case July:
//            case August:
//            case October:
//            case December:
//                System.out.println("31 Days");
//                break;
//            case April:
//            case June:
//            case September:
//            case November:
//                System.out.println("30 days");
//                break;
//            case February:
//                System.out.println("28 0r 29 days");
//
//        }

//            for each for enum
//        for(WeekDays i:WeekDays.values()){
//            System.out.println(i);
//        }

        WeekDays weekDays=WeekDays.Sat;
        System.out.println(weekDays.ordinal());     //ordinal means indexs

    }

}

//constructor of enum should be inside the enum

