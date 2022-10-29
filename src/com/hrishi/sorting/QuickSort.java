package com.hrishi.sorting;

public class QuickSort {
    public static int partition(int[] myArray, int left, int right){
        int pivot = myArray[right];
        int i =(left-1);
        int temp;
        for (int i1 = left; i1 < right; i1++) {
            if(myArray[i1]<=pivot){
                i++;
                temp = myArray[i];
                myArray[i] = myArray[i1];
                myArray[i1] = temp;
            }
        }
        temp = myArray[i+1];
        myArray[i+1] = myArray[right];
        myArray[right] = temp;
        return (i+1);
    }
    public static void quickSort(int[] myArray, int left, int right){
        if(left<right){
            int partitionIndex = partition(myArray,left,right);
            quickSort(myArray,left,partitionIndex-1);
            quickSort(myArray,partitionIndex+1,right);
        }
    }
    public static void main(String[] args) {
        int[] myArray ={8,7,3,5,2,1,0,-1};
        int right = myArray.length-1;
        int left= 0;

        System.out.println("<-------------------------------------->");
        System.out.println("Array Before Quick Sort Algorithm");
        for (int i = 0; i < myArray.length ; i++) {
            System.out.print(myArray[i]+ " ");
        }

        //quickSort() function
        quickSort(myArray,left,right);

        System.out.println();
        System.out.println("<-------------------------------------->");


        //Array After Quick Sort Algorithm
        System.out.println("Array After Quick Sort Algorithm");
        for (int i = 0; i < myArray.length ; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.println("<-------------------------------------->");

    }
}
