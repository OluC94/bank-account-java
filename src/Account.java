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
        this.bankStatement.add("Opened account with balance: £" + this.balance);
    }

    public void deposit(float amount){
        if (amount >= 0){
            float amountInCurrency = Utils.convertToCurrency(amount);
            this.balance += amountInCurrency;
            this.bankStatement.add("Deposited £" + amountInCurrency + ", current balance: £" + this.balance);
        }
        else {
            System.out.println("you have attempted to deposit a negative sum of money");
        }
    }

    public WithdrawalResult withdraw(float amount){
        float amountInCurrency = Utils.convertToCurrency(amount);

        WithdrawalResult withdrawalResult;
        if (amountInCurrency > this.balance){
            System.out.println("You have insufficient funds");
            withdrawalResult = new WithdrawalResult("failure", this.balance);

        } else {
            this.balance -= amountInCurrency;
            System.out.println("Your new balance: " + this.balance);
            this.bankStatement.add("Withdrew £" + amountInCurrency + ", current balance: £" + this.balance);
            withdrawalResult =  new WithdrawalResult("success", this.balance);
        }
        return withdrawalResult.getWithdrawalResult();
    };

    public ArrayList<String> getBankStatement() {
        return this.bankStatement;
    }

    public void display(){
        System.out.println(
                "id: " + id + " balance: £" + balance
        );
    }
}
