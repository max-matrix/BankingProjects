package com.mybank.domain;

public class Bank {
    private Customer[] customers; // Array de clientes, por lo tanto tengo COMPOSICIÓN.
    private int        numberOfCustomers;
    
    public Bank() {
        customers = new Customer[10]; // Inicializo el objeto.
        numberOfCustomers = 0;
    }
    
    public void addCustomer(String f, String l) {
        int i = numberOfCustomers++;
        customers[i] = new Customer(f, l);
    }
    public int getNumOfCustomers() {
        return numberOfCustomers;
    }
    public Customer getCustomer(int customer_index) {
        return customers[customer_index];
    }
}
