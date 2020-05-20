package com.mybank.domain;

public class Account {
    
    protected double balance; // Esta es mi variable de instancia
    // ¿Por qué es de instancia?
    // Implica que para cada objeto que cree el balance puede cambiar,
    // toma distintos valores dependiendo de las instancias.    
    
    // Cuando heredamos, heredamos todo menos los constructores.
    // Para invocarlos utilizamos el (super).
    
    // El constructor por defecto sería protected Acount(){}
    // Entonces decimos que hay una sobre-carga, pero pueden ser infinitas.
    protected Account(double initBalance) { 
    // Protected - Utilizamos cuando jerarquizamos
    // Acceso "como" si fuera público.
    // Un constructor no lleva tipo de retorno. Porque va a retornar una instancia.
        balance = initBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amt) {
        balance = balance + amt;
        return true;
    }
    
    public boolean withdraw(double amt) {
        boolean result = false; // Una variable local no tiene modificador de acceso,
        // porque accedemos a través del método.
        // assume operation failure
        if ( amt <= balance ) {
            balance = balance - amt;
            result = true;  // operation succeeds
        }
        return result;
    }
}
