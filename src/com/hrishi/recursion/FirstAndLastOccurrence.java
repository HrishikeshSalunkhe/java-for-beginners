package com.hrishi.recursion;

public class FirstAndLastOccurrence {
    static int firstOccurrence = -1;
    static int lastOccurrence = -1;
    public static void firstAndLastOccurrence(String str, int index,char characterToFindIndex){
        if(index == str.length()){
            System.out.println(firstOccurrence);
            System.out.println(lastOccurrence);
            return;
        }
        // We can't put currentChar statement before base
        // condition because it will give "IndexOutOfBound Error"
        char currentChar = str.charAt(index);
        if(currentChar==characterToFindIndex){
            if(firstOccurrence ==-1)
                firstOccurrence = index;
            else
                lastOccurrence = index;
        }
        firstAndLastOccurrence(str,index+1,characterToFindIndex);
    }
    public static void main(String[] args) {
        String str = "abcdefghiiggfedcba";
        firstAndLastOccurrence(str,0,str.charAt(0));
    }
}
