package com.hrishi.bankApp;

import java.text.NumberFormat;

/**
  * Represents a checking/saving bank account for a customer
  * @author: Hrishikesh Salunkhe
  */

public class BankAccount {
    // instance Variables
    /**
      * Type of Account(checking/saving)
      * Balance for bank account
      * Customer for the Account
      */
    String accountType;
    double balance;
    BankCustomer bkCustomer ;
    //Constructor

    public BankAccount(String accountType, BankCustomer bkCustomer){
        this.accountType =accountType;
        this.bkCustomer =bkCustomer;
    }

    /**
      * Deposit the given amount
      * @param amount to be deposited
      * @return Total balance
      */
    public double deposit(double amount){
        return this.balance += amount;
    }

    /**
     * Withdraw the given amount
     * @param amount to withdraw
     * @throws Exception if Balance is not Enough
     */
    public void withdraw(double amount) throws Exception {
        if(amount >this.balance){
            throw new Exception("Amount is not Enough");
        }
        this.balance -= amount;
    }

    /**
     *  Return account type and Balance of customer
     * @return account details
     */
    public String getAccountInfo() {
        String str = NumberFormat.getCurrencyInstance().format(this.balance);
        return this.accountType + ":" +  str;
    }

    /**
     * Returns Customer name and address
     * @return Customer details
     */
    public String getCustomerInfo(){
        return  this.bkCustomer.getName() + " from " + this.bkCustomer.getAddress();

    }
}
