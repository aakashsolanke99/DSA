package org.aakash.arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr= {2,3,8,6,9};
//        secondLargestBruteForce(arr);
        secondLargestBetterSolution(arr);
        secondLargestOptimalSolution(arr);
        secondSmallest(arr);

    }

   public static void secondLargestOptimalSolution(int[] arr){
        int largest=arr[0];
        int secondLargest=-1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];


            }
        }
       System.out.println(secondLargest);

    }

    private static void secondSmallest(int[] arr){
        int smallest=arr[0];
        int secSmallest= Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                secSmallest= arr[i];
                smallest=arr[i];
            }
            else if(arr[i] != smallest && arr[i]<secSmallest){
                secSmallest=arr[i];
            }
        }
        System.out.println("second smallest "+ secSmallest);

    }
    private static void secondLargestBetterSolution(int[] arr){
        int largest =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int secondLargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>secondLargest && arr[i]!= largest){
                secondLargest=arr[i];
            }
        }
        System.out.println(secondLargest);
    }

    private static void secondLargestBruteForce(int[] arr) {
        int largest=arr[0];
        sortArray(arr);
        for(int i=1;i<arr.length;i++){

        }


    }

    private static void sortArray(int[] arr) {

    }
}
