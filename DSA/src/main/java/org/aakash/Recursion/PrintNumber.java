package org.aakash.Recursion;

import java.util.Scanner;

public class PrintNumber {
//    static int count=1;
    public static void main(String[] ar5gs) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
//        printNumber(1,n);
        printInReverseOrder(n,n);
    }

    static void printNumber(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
//        i++;
        printNumber(i+1,n);
    }

    static void printInReverseOrder(int i,int n){
        if(i<1){
            return ;
        }

        System.out.println(i);
        printInReverseOrder(i-1,n);
    }
}
