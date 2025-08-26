package org.aakash.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OnePlus {
    public static void main(String[] args) {
        int[] arr={1,7,3,6,5,6};

        int ints = pivotIndex(arr);
        System.out.println((ints));
    }

    public static int pivotIndex(int[] nums) {
        int sum=0;
        int pivoteSum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        System.out.println(sum);
        for(int i=0;i<nums.length;i++){
            pivoteSum = pivoteSum+nums[i];
            if(pivoteSum == (sum-pivoteSum)){
                return i;
            }
        }
        return -1;
    }
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]+1 != 10){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
        }
        int[] newResult = new int[digits.length+1];
        newResult[0]=1;
        return newResult;
    }
}
