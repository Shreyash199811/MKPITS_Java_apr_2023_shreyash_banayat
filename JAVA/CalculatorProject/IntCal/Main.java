package IntCal;

import Ln.Loan;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Simple Interest is "+interestCalculation.calculateInterest());
        Loan myloan=new Loan();
        myloan.setAccountNo("1234");
        myloan.setAmt(50000);
        myloan.setDuration(5);
        InterestCalculation interestCalculation=new InterestCalculation();
        System.out.println("Simple Interest on loan is "+interestCalculation.calculateInterest(myloan));

    }
}

//intcal =>package
// class InterestCalculation
//  rateOfInterest
// method calculateInterest()

//composition association relationship
//passing object as argument
//array of objects <classname> obj[]=new <classname>[3];