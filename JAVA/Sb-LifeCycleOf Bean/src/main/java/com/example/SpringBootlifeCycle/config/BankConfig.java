package com.example.SpringBootlifeCycle.config;

import com.example.SpringBootlifeCycle.util.Accounts;
import com.example.SpringBootlifeCycle.util.LoanAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {
    @Bean
    public Accounts loanAccount(){
        return new LoanAccount();
    }
}
