package org.aakash.arrays;

import java.util.Arrays;

public class ShiftZeroToEnd {
    public static void main(String[] args) {
       int[] nums= { 0, 1, 4, 0, 5, 2};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
        public static void moveZeroes(int[] nums) {
            int j=-1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    j=i;
                    break;
                }
            }

            if(j==-1){
                return;
            }

            for(int i= j+1;i<nums.length;i++){
                if(nums[i]!=0){
                    swap(nums,i,j);
                    j++;
                }
            }

        }

    public static void swap(int[] nums,int i,int j ){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
