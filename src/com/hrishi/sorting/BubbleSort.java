package com.hrishi.sorting;

public class BubbleSort {
    public static void bubbleSort(int[] myArray){
        int temp;
        for (int i = 0; i < myArray.length-1; ++i) {
            for (int i1 = 0; i1 < myArray.length-i-1; ++i1) {
                if(myArray[i1] > myArray[i1 +1]){
                    temp = myArray[i1];
                    myArray[i1] = myArray[i1+1];
                    myArray[i1+1] = temp;
                }
            }
        }
    }
    public static void bubbleDescSort(int[] myArray){
        int temp;
        for (int i = 0; i < myArray.length-1; i++) {
            for (int i1 = 0; i1 < myArray.length-1; i1++) {
                if(myArray[i1]<myArray[i1 +1]){
                    temp = myArray[i1];
                    myArray[i1] = myArray[i1+1];
                    myArray[i1+1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Bubble Sort in Java");
        // My Array initialization
        int myArray[] ={99,88,77,66,55,44,33,22,11};
        //Call the bubble sort function(Ascending order)
        bubbleSort(myArray);
        System.out.println("Elements in the Ascending order: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
        System.out.println();
        bubbleDescSort(myArray);
        System.out.println("Elements in the Descending Order order: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }

    }
}
