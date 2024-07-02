package javacore.nelio.exercicios.poo.bankATM.domain;

public class Account {
    private int number;
    private double balance;
    private String holder;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialValue) {
        this.number = number;
        this.holder = holder;
        deposit(initialValue);
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount + 5;
    }

    public void changeHolder(String newHolder){
        this.holder = newHolder;
    }

    public String toString(){
        return "Account: "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
