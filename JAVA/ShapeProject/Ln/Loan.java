package Ln;

public  class Loan {
    private String accountNo;
    private double amt;
    private int duration;
    public Loan(){}

    public Loan(String accountNo, double amt, int duration) {
        this.accountNo = accountNo;
        this.amt = amt;
        this.duration = duration;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String  accountNo) {
        this.accountNo = accountNo;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
