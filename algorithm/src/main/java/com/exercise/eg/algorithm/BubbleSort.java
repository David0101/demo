package com.exercise.eg.algorithm;

import java.util.Arrays;

/**
 * @program: demo
 * @author: jim
 * @create: 2020-09-01 10:38
 */
public class BubbleSort {
    private static void BubbleSort(int[] arr){
        int temp ;
        for(int i=0;i<arr.length -1;i++){
            for(int j =0 ;j <arr.length -i -1;j ++ ){
                if(arr[j] >arr[j+1]){
                  temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1]= temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,6,2,2,5};
        BubbleSort.BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
