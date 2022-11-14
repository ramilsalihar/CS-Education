package pset7.composition.customer_account;

import pset7.composition.customer_invoice.Customer;

public class Account {
    private int ID;
    private Customer customer;
    private double balance = 0.0;

    public Account(int ID, Customer customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int ID, Customer customer) {
        this.ID = ID;
        this.customer = customer;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("name(%d) balance=$%.2f");
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public Account deposit(double amount){
        if(balance>=0){
            balance+=amount;
        }
        return this;
    }

    public Account withdraw(double amount){
        if(balance-amount>=0){
            balance-=amount;
        }
        return this;
    }
}
