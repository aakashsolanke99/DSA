package org.aakash.arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
      int[] arr={ 1, 2, 3, 4, 5};
        int length = arr.length;
        System.out.println(length
        );

        rotateArrayByOne(arr);
        System.out.println(arr);
    }

    public static void rotateArrayByOne(int[] nums) {
        int temp=nums[0];
        for(int i=1;i<nums.length; i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
    }
}
