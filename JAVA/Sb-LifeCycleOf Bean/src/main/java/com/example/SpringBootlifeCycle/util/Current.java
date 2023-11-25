package com.example.SpringBootlifeCycle.util;

import com.example.SpringBootlifeCycle.util.Accounts;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Current implements Accounts {
    @Override
    public String accountsDetails() {
        return "This is Current Account";
    }

    @PostConstruct      //After  Start
    public void beanBirth(){
        System.out.println("Start working=>"+getClass().getName());
    }

    @PreDestroy         //Before End
    public void beanDestroy(){
        System.out.println("finished working");
    }
}
