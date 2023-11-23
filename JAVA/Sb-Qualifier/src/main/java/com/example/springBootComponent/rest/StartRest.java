package com.example.springBootComponent.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartRest {
    @GetMapping("/")
    public String display(){
        return "Starting... Working on it...";
    }

    private Accounts accounts;

    @Autowired
//    public StartRest(@Qualifier("savings") Accounts accounts){
//        this.accounts=accounts;
//    }


    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    @GetMapping("/showdetails")
    public String ShowDetails(){
        return accounts.accountDetails();
    }

}
