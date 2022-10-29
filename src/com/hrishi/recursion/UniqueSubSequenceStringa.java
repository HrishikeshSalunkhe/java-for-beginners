package com.hrishi.recursion;

import java.util.HashSet;

public class UniqueSubSequenceStringa {
    public static void subsequenceString(String str, int index, String finalString,HashSet<String> set){
        if(index==str.length()){
            if(set.contains(finalString)){
                return;
            }
            System.out.println(finalString);
            set.add(finalString);
            return;
        }
        char currentChar = str.charAt(index);
        subsequenceString(str,index+1,finalString+currentChar,set);
        subsequenceString(str,index+1,finalString,set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set = new HashSet<>();
        subsequenceString(str,0,"",set);
    }
}
