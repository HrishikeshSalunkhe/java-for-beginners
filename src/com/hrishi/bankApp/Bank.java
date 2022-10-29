package com.hrishi.bankApp;

import java.util.Scanner;

/**
 * Represents a Bank for managing Customers and their bank accounts
 * @author : Hrishikesh Salunkhe
 */
public class Bank {

    // Deposit Amount
    void depositInSaving(BankAccount savingAccount,Scanner sc){
        // For Saving Account
        System.out.println("Enter amount to deposit into Saving Account");
        double savingAmountDeposit = sc.nextDouble();
        savingAccount.deposit(savingAmountDeposit);


    }
    void depositInChecking(BankAccount checkingAccount, Scanner sc){
        // For Checking Account
        System.out.println("Enter amount to deposit into Checking Account");
        double checkingAmountDeposit = sc.nextDouble();
        checkingAccount.deposit(checkingAmountDeposit);

    }


    // Withdraw Amount
    void withdrawFromChecking(BankAccount checkingAccount, Scanner sc){
        // For Checking Account
        System.out.println("Enter amount to withdraw into Checking Account");
        double checkingAmountWithdraw = sc.nextDouble();
        try {
            checkingAccount.withdraw(checkingAmountWithdraw);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    void withdrawFromSaving(BankAccount savingAccount, Scanner sc){
        // For Saving Account
        System.out.println("Enter amount to withdraw into Saving Account");
        double savingAmountWithdraw = sc.nextDouble();
        try {
            savingAccount.withdraw(savingAmountWithdraw);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // Display Details
    void displayDetails(BankAccount savingAccount,BankAccount checkingAccount){
        // Display Details
        System.out.println("Customer Info: ");
        System.out.println(savingAccount.getCustomerInfo());
        System.out.println("Checking Account:");
        System.out.println(checkingAccount.getAccountInfo());

        System.out.println("Saving Account:");
        System.out.println(savingAccount.getAccountInfo());
    }


    public static void main(String[] args) {
        System.out.println("Wel-come to Banking App");
        // Create new instance of Bank class
        Bank bk = new Bank();
        //Call the run method in the Bank class
        bk.run(bk);
    }

    /**
     * Runs the program by initializing and managing, bank accounts and customers
     */
    public void  run(Bank bank)  {
        System.out.println("Hello World! Welcome to Banking App");
        System.out.println("What is good name?");
        // To get user input create a scanner object
         Scanner sc = new Scanner(System.in);

        //Get Name
        String name = sc.next();
        System.out.println("Hello " + name + ", We are creating or checking account in our database.");
        BankCustomer bankCustomer = new BankCustomer(name);


        BankAccount checkingAccount =  new BankAccount("checking",bankCustomer);
        BankAccount savingAccount =  new BankAccount("saving",bankCustomer);


        // get Address
        System.out.println("What is your Address?");
        String address = sc.next();
        bankCustomer.setAddress(address);

        //Deposit
        bank.depositInChecking(checkingAccount,sc);
        bank.depositInSaving(savingAccount,sc);

        //Withdraw
        bank.withdrawFromChecking(checkingAccount,sc);
        bank.withdrawFromSaving(savingAccount,sc);

        // Display
        bank.displayDetails(savingAccount,checkingAccount);




    }
}
