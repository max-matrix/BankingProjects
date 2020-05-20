package com.mybank.domain;

public class SavingsAccount extends Account {
    
    private double interestRate;
    
    public SavingsAccount(double initBalance, double interestRate) {
        super(initBalance);
        this.interestRate = interestRate;
    }
    
    // No necesito una implementación diferente (ni depositar ni retirar).
    
}
