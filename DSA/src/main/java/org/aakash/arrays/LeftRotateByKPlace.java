package org.aakash.arrays;

import java.util.Arrays;

public class LeftRotateByKPlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArrayWithOptimum(arr,k);
    }

    // brute force approach
    public static  void rotateArray(int[] nums, int k) {
        int[] temp = new int[k+1];

        for(int i=0;i<k;i++){
            temp[i]= nums[i];
        }

        for(int i=k;i<nums.length;i++){
            nums[i-k]=nums[i];
        }
        for(int i=nums.length-k ;i<nums.length;i++){
            nums[i]= temp[i-(nums.length-k)];
        }

        System.out.println(Arrays.toString(nums));
    }

    // optimum solution
    public static  void rotateArrayWithOptimum(int[] nums, int k) {
        reverseArray( nums,0,k-1);
        reverseArray(nums,k,nums.length-1);
        reverseArray(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

   public static void reverseArray(int[] nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]= nums[end];
            nums[end]= temp;
            start++;
            end--;
        }

    }
}
