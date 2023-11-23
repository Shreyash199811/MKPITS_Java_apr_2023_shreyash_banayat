package com.example.springBootComponent.rest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Savings implements Accounts{

    public Savings(){
        System.out.println("This is Savings class Constructor");
    }

    public String accountDetails(){
        return "This is Savings Account";
    }

}
