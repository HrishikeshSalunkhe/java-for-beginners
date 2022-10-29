package com.hrishi.recursion;

public class MergeSort {
    public static void mergeSort(int dataArr[], int left, int right){
        if(left<right){
            int mid = left + ((right-left)/2);
            mergeSort(dataArr,left,mid);
            mergeSort(dataArr,mid+1,right);
            merge(dataArr,left,mid,right);
        }
    }

    public static void merge(int dataArr[], int left,int mid,int right){
        int tempArr[] = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k =0;

        // merge both sub-arrays until condition is true
        while(i<=mid && j<=right){
            if(dataArr[i] <= dataArr[j]){
                tempArr[k++] = dataArr[i++];
            }
            else{
                tempArr[k++] = dataArr[j++];
            }
        }
        while (i<=mid){
            tempArr[k++] = dataArr[i++];
        }
        while (j<=right){
            tempArr[k++] = dataArr[j++];
        }

        for (int l = left; l <= right ; l++) {
            dataArr[l] = tempArr[l-left];
        }
    }
    public static void main(String[] args) {
        System.out.println("Merge Sort using Recursion");
        int arr[] = {10, 22,30,49,0,-1,-5, 99,100};
        int left =0;
        int right = arr.length-1;
        mergeSort(arr,left,right);
        for (int i = 0; i < right; i++) {
            System.out.println(arr[i]);
        }
    }
}
