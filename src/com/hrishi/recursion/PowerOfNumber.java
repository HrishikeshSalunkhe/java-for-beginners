package com.hrishi.recursion;

public class PowerOfNumber {
    public static int powerOfNumber(int number,int power){
        if(number==0 || power==0)
            return 1;
        if(power%2==0)
            return powerOfNumber(number,power/2)*powerOfNumber(number,power/2);
        else
            return powerOfNumber(number,power/2) * powerOfNumber(number,power/2) *number;
    }
    public static void main(String[] args) {
        int number = 5;
        int power = 4;
        System.out.println(powerOfNumber(number,power));
    }
}
