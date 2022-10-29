package com.hrishi.sorting;

public class SelectionSort {
    public static void selectionSort(int[] myArray){
        int min_index;
        int temp;
        for (int i = 0; i < myArray.length-1; i++) {
            min_index = i;
            for (int i1 = i+1; i1 < myArray.length; i1++) {
                if(myArray[min_index] > myArray[i1]){
                    min_index = i1;
                }
            }
            temp = myArray[min_index];
            myArray[min_index] = myArray[i];
            myArray[i] =temp;
        }
    }
    public static void main(String[] args) {
        int myArray[] = {99,88,77,66,55,44,33,22,11};
        selectionSort(myArray);
        System.out.println("Sorted Array(Ascending Array):  ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+ " ");
        }
    }
}
