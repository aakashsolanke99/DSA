package org.aakash.Recursion;

public class SumOfNumber {
     static int sum=0;
    public static void main(String[] args) {
        int i = sumOfNumber(3);
        int z= sumOfNumber1(3);
        System.out.println(i);
        System.out.println(z);
    }

    public static  int sumOfNumber(int i){
        if(i<1) {
            return -1;

        }
        sumOfNumber(i-1);
        sum= sum+i;
        return sum;
    }

    public static int sumOfNumber1(int n){
        if(n==0){
            return 0;
        }

        return n + sumOfNumber1(n-1);

    }
}
