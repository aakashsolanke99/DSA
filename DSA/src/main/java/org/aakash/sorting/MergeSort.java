package org.aakash.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
       int[] arr = {7, 4, 1, 5, 3};
        mergeSortInPlace(arr,0,arr.length);
//        int[] ints = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int [] arr){
        if(arr.length ==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] firstHalf = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] secondHalf = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(firstHalf,secondHalf);
    }

    private static int[] merge(int[] firstHalf, int[] secondHalf) {
        int[] mix = new int[firstHalf.length+secondHalf.length];
        int i=0;
        int j=0;
        int k=0;

        while(i< firstHalf.length && j < secondHalf.length){
            if(firstHalf[i] < secondHalf[j]){
                mix[k]= firstHalf[i];
                i++;
            }else{
                mix[k]=secondHalf[j];
                j++;
            }
            k++;
        }

        // if one off this array not complete
        while(i < firstHalf.length){
            mix[k]= firstHalf[i];
            i++;
            k++;
        }

        while(j < firstHalf.length){
            mix[k]= firstHalf[j];
            j++;
            k++;
        }

        return mix;
    }


     static void mergeSortInPlace(int [] arr,int s,int e){
        if(e-s ==1){
            return;
        }
        int mid = (s+e)/2;
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);
        mergeInPlace(arr,s,mid,e);
    }

      static void  mergeInPlace(int[] arr,int s,int mid,int e) {
        int[] mix = new int[e-s];
        int i=s;
        int j=mid;
        int k=0;

        while(i< mid && j < e){
            if(arr[i] < arr[j]){
                mix[k]= arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        // if one off this array not complete
        while(i < mid){
            mix[k]= arr[i];
            i++;
            k++;
        }

        while(j < e){
            mix[k]= arr[j];
            j++;
            k++;
        }

          for (int l = 0; l < mix.length; l++) {
              arr[s+l]=mix[l];
          }

    }
}
