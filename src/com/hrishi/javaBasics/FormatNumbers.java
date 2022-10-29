package com.hrishi.javaBasics;

import java.text.NumberFormat;

public class FormatNumbers {
    public static void main(String[] args) {
        System.out.println("Formatting Numbers in Java");
        NumberFormat nf= NumberFormat.getCurrencyInstance();
        String result = nf.format(12345.6789);
        System.out.println(result);


        NumberFormat nfp = NumberFormat.getPercentInstance();
        String result2 = nfp.format(0.718);
        System.out.println(result2);
    }
}
