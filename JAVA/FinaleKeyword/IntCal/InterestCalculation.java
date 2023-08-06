package IntCal;

import Ln.Loan;

final public class InterestCalculation {
    private  int rateOfInterest;
    private int time;
    private double principal;
    public InterestCalculation(){
        rateOfInterest=9;
    }

//    public InterestCalculation(int time,double principal){
//        this.time=time;
//        this.principal=principal;
//    }

    public final double calculateInterest(Loan l){
        double simpleInterest;
        simpleInterest=(principal*rateOfInterest*time/100);
        return simpleInterest;
    }
}
