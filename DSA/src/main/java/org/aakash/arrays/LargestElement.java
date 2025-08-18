package org.aakash.arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {2,7,1,7,5,3};
       int data= findLargest(arr);
        System.out.println(data);
    }

    private static int findLargest(int[] arr) {
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest= arr[i];
            }
        }
        return largest;

    }
}
