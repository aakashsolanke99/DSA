package org.aakash.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,4,1,7,3};
        int[] ints = bubbleSort(arr);
        System.out.println(Arrays.toString(ints));
    }

    public static  int[] bubbleSort(int[] nums) {
        for(int i=nums.length-1;i>=0;i--){
            int swapcheck=0;
            for(int j=0;j<=i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    swapcheck=1;
                }
            }
            if(swapcheck==0){
                break;
            }
        }
        return nums;
    }
}
