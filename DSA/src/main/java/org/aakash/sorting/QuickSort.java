package org.aakash.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr= {3,2,1,6,5,8};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

        public static  int[] quickSort(int[] nums,int low,int high) {

            if(low < high){
                int partition = givePartition(nums,low,high);
                quickSort(nums,low,partition-1);
                quickSort(nums,partition+1,high);
            }
            return nums;

        }

        public static  int givePartition(int[] nums,int s,int l){
            int pivote = nums[s];
            int i=s;
            int j = l;
            while(i<j){
                while(nums[i] <= pivote && i<= l){
                    i++;
                }
                while(nums[j] > pivote && j > s){
                    j--;
                }
                if(i<j){
                    swap(nums,i,j);
                }
            }
            swap(nums,s,j);
            return j;
        }

        public static void swap(int[] a,int i,int j){
            int temp = a[i];
            a[i]= a[j];
            a[j]= temp;
        }
    }

