package com.hrishi.bankApp;

/**
 * @author: Hrishikesh Salunkhe
 * Represents a Customer of a Bank.
 */
public class BankCustomer {
    // Instance Variable
    /**
     * name: Name of Customer
     * address: Address of the customer
     */
    String name;
    String address;
    // Constructor

    /**
     * Creates a customer with given name
     * @param name of the customer
     */
    public BankCustomer(String name){
        // Set instance var name to given name
        this.name = name;
    }
    // Methods

    /**
     * Sets the address of the customer to given address
     * @param address for customer
     */
    public void setAddress(String address){
        this.address = address;
    }

    /**
     *  Returns name of the customer
     * @return name of customer
     */
    public String getName() {
        return this.name;
    }

    /**
     *  Returns Address of the customer
     * @return Address of customer
     */
    public String getAddress() {
        return this.address;
    }
}

