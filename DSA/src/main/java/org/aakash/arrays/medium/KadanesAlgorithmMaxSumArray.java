package org.aakash.arrays.medium;

import java.util.Arrays;

public class KadanesAlgorithmMaxSumArray {
    public static void main(String[] args) {
        int[] ar={2, 3, 5, -2, 7, -4};
        System.out.println(maxSum(ar));
        System.out.println(Arrays.toString(maxSumPrintArray(ar)));

    }

    public static int maxSum(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            if(sum>max){
                max=sum;
            }

        }
        return max;
    }

    public static int[] maxSumPrintArray(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int stratIndex=-1;
        int endIndex=-1;
        int start=0;
        for (int i = 0; i < arr.length; i++) {
            if(sum==0){
                start=i;
            }
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            if(sum>max){
                max=sum;
                stratIndex=start;
                endIndex=i;
            }

        }
        return  new int[]{stratIndex,endIndex};
    }
}
