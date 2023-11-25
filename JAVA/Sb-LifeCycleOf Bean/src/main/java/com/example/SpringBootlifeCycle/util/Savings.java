package com.example.SpringBootlifeCycle.util;

import com.example.SpringBootlifeCycle.util.Accounts;
import org.springframework.stereotype.Component;

@Component
public class Savings implements Accounts {

    @Override
    public String accountsDetails() {
        return "This is Savings Account";
    }
}
