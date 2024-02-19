package com.accenture.programmingtasks;

public class BankAccount {
    private int balance;
    public BankAccount(int balance) {
        this.balance = balance;
    }
    public BankAccount() {}
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void transact(int amount) {
        if(this.balance + amount < 0) throw new InsufficientBalanceException("not enough balance to execute this transaction");
        this.balance += amount;
        System.out.println("new balance: " + this.balance);
    }
}
