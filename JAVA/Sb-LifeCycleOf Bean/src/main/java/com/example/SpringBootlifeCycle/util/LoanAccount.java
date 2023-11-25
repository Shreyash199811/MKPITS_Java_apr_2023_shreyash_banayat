package com.example.SpringBootlifeCycle.util;

public class LoanAccount implements  Accounts{

    @Override
    public String accountsDetails() {
        return  "This is loan Account";
    }
}
