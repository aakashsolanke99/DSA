package org.aakash.sorting;

public class InsertionSort {
    public static void main(String[] args) {

    }
    public static int[] insertionSort(int[] nums) {
        for(int i=0;i<=nums.length-1;i++){
            int j=i;
            while(j>0 && nums[j-1]>nums[j]){
                int temp=nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
                j--;
            }
        }
        return nums;

    }
}
