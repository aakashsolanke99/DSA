package org.aakash.Recursion;

public class ReverseArray {
    public static void main(String[] args) {
          int[] arr = {2,3,4,5,7};
          reverse(0,arr,arr.length);
          for (int i=0;i<arr.length;i++){
              System.out.println(arr[i]);
          }
        System.out.println(arr.toString());
    }

    public static void reverse(int i,int[] arr, int n){
        if(i>= n/2){
            return ;
        }
        swap(arr,i,n-i-1);
//        int temp= arr[i];
//        arr[i]=arr[n-i-1];
//        arr[n-i-1]=temp;
        reverse(i+1,arr,n);


    }

    public static void swap(int[] arr,int i,int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
