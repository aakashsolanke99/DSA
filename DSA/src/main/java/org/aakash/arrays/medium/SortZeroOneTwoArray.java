package org.aakash.arrays.medium;

import java.util.Arrays;

public class SortZeroOneTwoArray {
    public static void main(String[] args) {
        int[] arr={1, 0, 2, 1, 0};
        sortZeroOneTwo(arr);
        System.out.println(Arrays.toString(arr));

    }

        public static  void sortZeroOneTwo(int[] nums) {
            int n=nums.length;
            int low=0,mid=0;
            int high= n-1;

            while(mid<=high){
                if(nums[mid]==0){
                    swap(nums,mid,low);
                    mid++;
                    low++;
                }else if(nums[mid]==1){
                    mid++;
                }else if(nums[mid]==2){
                    swap(nums,mid,high);
                    high--;
                }
            }
        }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    }
