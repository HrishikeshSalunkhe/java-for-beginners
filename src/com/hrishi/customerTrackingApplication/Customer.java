package com.hrishi.customerTrackingApplication;

/**
 * @author: Hrishikesh Salunkhe
 */

import java.util.ArrayList;

/**
 * Represents a Customer with name,ID, and geography.
 */
public class Customer {

    // Class Variables
    static final String COMPANY = "ABC";
    static ArrayList<Customer> CUSTOMERS = new ArrayList<Customer>();
    static  Counter COUNTER;

    String name;
    String geography;
    int ID;

    // Constructor
    public Customer(String name, String geography){
            this.name = name;
            this.geography = geography;
            // getCount can be accessed directly by class name
            this.ID = Customer.COUNTER.getCount();
            Customer.COUNTER.increment();
            Customer.CUSTOMERS.add(this);
    }
    public static void displayAllCustomers(){
        System.out.println("All Customers: ");
        for (Customer c: Customer.CUSTOMERS) {
            System.out.println(c);
        }
    }

    public boolean equals(Object obj){
        Customer customer_2 = (Customer) obj;
        if((this.name.equals(customer_2.name)) && (this.geography.equals(customer_2.geography))){
            return true;
        }
        return false;
    }

    public static int findCustomer(Customer customer){
        int index = -1;
        for (int i = 0; i < Customer.CUSTOMERS.size() ; i++) {
            if(Customer.CUSTOMERS.get(i).equals(customer)){
                index =i;
                break;
            }
        }
        return  index;
    }

    public static void removeCustomer(Customer customer){
            int removingIndex = Customer.findCustomer(customer);
        if (removingIndex >= 0) {
                Customer.CUSTOMERS.remove(removingIndex);
        }
    }
    @Override
    public String toString() {
        return this.ID +": "+this.name +", Company"+ Customer.COMPANY + ", Location: " + this.geography ;
    }

    public static void main(String[] args) {
        // Initialize the counter for unique ID's
            Customer.COUNTER  = new Counter(1);
        // Create Customers
        Customer c1 = new Customer("Rohan","Pune");
        Customer c2 = new Customer("ABC","Pune");
        Customer c3 = new Customer("DEF","Pune");
        Customer c4 = new Customer("GHI","Pune");

        Customer.displayAllCustomers();
    }
}
