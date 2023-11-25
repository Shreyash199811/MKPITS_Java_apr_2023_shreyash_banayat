package com.example.SpringBootlifeCycle.util;

import com.example.SpringBootlifeCycle.util.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String display(){
        return "Starting... Working on it...";
    }

    private Accounts accounts;

    @Autowired
    public Controller(@Qualifier("current")Accounts accounts){
        this.accounts=accounts;
    }

    @GetMapping("/details")
    public String show(){
        return accounts.accountsDetails();
    }


}
