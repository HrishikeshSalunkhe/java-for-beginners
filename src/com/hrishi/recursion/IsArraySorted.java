package com.hrishi.recursion;

public class IsArraySorted {
    public static boolean isArraySorted(int myArray[],int index){
        if(index== myArray.length-1){
            return true;
        }
        if(myArray[index] >= myArray[index+1]){
            return false;
        }
        return isArraySorted(myArray,index+1);
    }
    public static void main(String[] args) {
        int[] myArray={1,2,3,4,5};
        System.out.println(isArraySorted(myArray,0));
    }
}
