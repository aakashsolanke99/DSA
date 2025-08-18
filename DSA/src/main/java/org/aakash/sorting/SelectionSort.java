package org.aakash.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,4,1,7,3};
//        int[] ints = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] selectionSort(int[] nums) {
        for(int i=0;i<=nums.length-2;i++){
            int min=i;
            for(int j=i;j<=nums.length-1;j++){
                if(nums[j]<nums[min]){
                    min=j;
                }
            }

            int temp=nums[i];
            nums[i]=nums[min];
            nums[min]=temp;

        }
        return nums;

    }


}
