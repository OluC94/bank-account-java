import jdk.jshell.execution.Util;

import java.util.ArrayList;

public class Account {
//    instance variables
    private final int id;
    private float balance;
    private final ArrayList<String> bankStatement;

//  constructor
    public Account(int id, float balance ){
        this.id= id;
        this.balance = Utils.convertToCurrency(balance);
        this.bankStatement = new ArrayList<String>();
    }

    public void deposit(float amount){
        if (amount >= 0){
            float amountInCurrency = Utils.convertToCurrency(amount);
            this.balance += amountInCurrency;
            this.bankStatement.add("Deposited £" + amountInCurrency + ", current balance: " + this.balance);
        }
        else {
            System.out.println("you have attempted to deposit a negative sum of money");
        }
    }

    public void withdraw(float amount){
        float amountInCurrency = Utils.convertToCurrency(amount);

        if (amountInCurrency > this.balance){
            System.out.println("You have insufficient funds");
        } else {
            this.balance -= amountInCurrency;
            System.out.println("Your new balance: " + this.balance);
            this.bankStatement.add("Withdrew £" + amountInCurrency + ", current balance: " + this.balance);
        }
    }

    public ArrayList<String> getBankStatement() {
        return this.bankStatement;
    }

    public void display(){
        System.out.println(
                "id: " + id + " balance: " + balance
        );
    }
}
