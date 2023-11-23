package com.example.springBootComponent.rest;

import org.springframework.stereotype.Component;

@Component
public class Accounts implements SavingsAccount{


    public String accountDetails(){
        return "This is Savings Account";
    }
}
