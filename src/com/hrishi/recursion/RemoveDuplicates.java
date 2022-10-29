package com.hrishi.recursion;

public class RemoveDuplicates {
    static boolean isCharPresent[] = new boolean[26];
    public static void removeDuplicates(String str, int index,String finalString){
        if(index ==str.length()){
            System.out.println(finalString);
            return;
        }
        char currentChar = str.charAt(index);
        if(isCharPresent[currentChar - 'a'] == false){
            isCharPresent[currentChar - 'a'] = true;
            finalString += currentChar;
        }
        removeDuplicates(str,index+1,finalString);
    }
    public static void main(String[] args) {
        for (int i = 0; i < isCharPresent.length; i++) {
            isCharPresent[i] = false;
        }
        String str= "abbcccdddde";
        removeDuplicates(str,0,"");

    }
}
