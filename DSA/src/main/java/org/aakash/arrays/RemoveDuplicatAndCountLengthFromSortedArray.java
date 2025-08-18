package org.aakash.arrays;

public class RemoveDuplicatAndCountLengthFromSortedArray {
    public static void main(String[] args) {

        int[] arr= {1,1,2,3,3,4,4,4,4};
        System.out.println(removeDuplicateAndCont(arr));

    }

    public static int removeDuplicateAndCont(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;

    }

}
