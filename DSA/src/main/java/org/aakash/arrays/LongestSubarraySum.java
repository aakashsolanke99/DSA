package org.aakash.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySum {
    public static void main(String[] args) {
        int[] arr={10, 5, 2, 7, 1, 9};
        int k=15;
        System.out.println(longestSubarray(arr,k));
    }

    public static int longestSubarray(int[] nums, int k) {
        int left=0;
        int right=0;
        int sum=nums[0];
        int maxLength=0;
        int n= nums.length;
        while(right<n){
            while(left<right && sum>k){
                sum-=nums[left];
                left++;
            }
            if(sum==k){
                maxLength= Math.max(maxLength,right-left+1);

            }
            right++;
            if(right<n){
                sum+=nums[right];
            }

        }
        return maxLength;

    }
//
//    public static int longestSum(int[] arr,int k) {
//
//        Map<Integer, Integer> prefSumMap = new HashMap<>();
//        long sum = 0;
//        long length = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            if (sum == k) {
//                length = Math.max(length, i + 1);
//            }
//
//        }
//
//    }
}
