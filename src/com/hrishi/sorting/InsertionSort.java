package com.hrishi.sorting;

public class InsertionSort {
    public static void insertionSort(int[] myArray){
        int key,j;
        for (int i = 0; i < myArray.length; i++) {
            key = myArray[i];
            j=i-1;
            while(j>=0 && myArray[j]>key){
                myArray[j+1]=myArray[j];
                j=j-1;
            }
            myArray[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] myArray={99,88,77,66,55,44,33,22,11};
        insertionSort(myArray);
        System.out.println("Sorted Array(Ascending Order):  ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
    }
}
