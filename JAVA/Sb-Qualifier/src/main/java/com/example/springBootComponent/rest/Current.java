package com.example.springBootComponent.rest;

import org.springframework.stereotype.Component;

@Component
public class Current implements Accounts{
    public Current(){
        System.out.println("This is Current class Constructor");
    }
    public String accountDetails(){
        return "This is Current account";
    }
}
