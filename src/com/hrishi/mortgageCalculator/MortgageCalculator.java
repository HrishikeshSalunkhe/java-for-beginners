package com.hrishi.mortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long principal,years;
        double air, result;
        System.out.println("Wel-come to Mortgage Calculator App");

        // Principal input
        while(true) {
            System.out.print("Principal: (1K to 10M ) ");
            principal = sc.nextLong();
            if(principal >= 1000 && principal <= 10_000_000){
                break;

            }
            System.out.println("Enter value between 1000 to 10M");
        }

        // Annual Interest Rate
        while(true){
            System.out.print("Annual Interest Rate: ");
            air = sc.nextDouble();
            if(air > 0 && air < 30){
                air = (air / 12)/100;
                break;
            }
            System.out.println("Enter value  in between 1 to 30");
        }

        // Period (in Years)
        while (true){
            System.out.print("Period (in Years)");
            years = sc.nextInt();
            if(years > 0 && years<= 30) {
                years = years*12;
                break;
            }
            System.out.println("Enter period in between 1 to 30");
        }
        result = principal * air *(((Math.pow((1+air),years)))/ (Math.pow(1+air,years)-1));
        String answer = NumberFormat.getCurrencyInstance().format(result);
        System.out.print("Mortgage: " + answer);
    }
}
