package MethodsInJava;

import javax.swing.plaf.PanelUI;

public class BankAccount {
    double checking;
    double saving;
    double creaditBalance;

    public  BankAccount( double checking, double saving,  double creaditBalance){
        this. checking = checking;
        this.saving = saving;
        this.creaditBalance = creaditBalance;

    }

    public void  deposit(double amount){
        System.out.println("Your current balance is: " + this.checking);
        System.out.println("You are depositing: " + amount);
        this.checking += amount; //this.checking = this.checking + amount; this.checking = 1450.78 + 100;
        System.out.println("Your updated balance is: " + this.checking);
        System.out.println("=======================================");
    }

    public  void  withdraw (double amount){
        System.out.println("Your current balance is: " + this.checking);
        System.out.println("You are withdrawing: " + amount);
        this.checking = this.checking - amount;
        System.out.println("Your updated balance is: " + this.checking);
        System.out.println("=======================================");
    }

public  void  printAccountBalance(){
        System.out.println("Your checking balance is: " + this.checking);
    System.out.println("Your saving balance is: " + this.saving);
    System.out.println("Your credit balance is: " + this.creaditBalance);
}
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1450.78, 23.42, 18980.86);
        System.out.println("Current checking acc balance: " + myAccount.checking);
        myAccount.deposit(100);
        myAccount.withdraw(600);
        myAccount.printAccountBalance();


    }
}
