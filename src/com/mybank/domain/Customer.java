package com.mybank.domain;

public class Customer { // Cliente es una clase contenedora.
	// AGREGACI�N: V�nculo intermedio entre asociaci�n y composici�n.

    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account acct) {
        account = acct;
    }
    
}
