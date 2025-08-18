package org.aakash.arrays;

import java.util.Arrays;

public class RotateArrayToRightByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArrayWithOptimum(arr,k);
    }
    public static void rotateArrayWithOptimum(int[] nums,int k){
        rotateArray(nums,0, nums.length-1);

        rotateArray(nums,0,k-1);

        rotateArray(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

   public static void rotateArray(int[] nums,int start,int end){
        while(start<=end){
            int temp= nums[start];
            nums[start]= nums[end];
            nums[end]=temp;
            start++;
            end--;

        }
    }
}
