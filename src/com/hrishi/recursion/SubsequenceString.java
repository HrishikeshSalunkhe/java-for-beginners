package com.hrishi.recursion;

public class SubsequenceString {
    public static void subsequenceString(String str, int index, String finalString){
        if(index==str.length()){
            System.out.println(finalString);
            return;
        }
        char currentChar = str.charAt(index);
        subsequenceString(str,index+1,finalString+currentChar);
        subsequenceString(str,index+1,finalString);
    }
    public static void main(String[] args) {
        String str="abc";
        subsequenceString(str,0,"");
    }
}
