package org.aakash.Recursion;

import java.util.Scanner;

public class printUsingBackTracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
//        printNumber(n,n);
        printFromNto1(1,n);
    }


    static void printNumber(int i,int n){
        if(i<1){
            return;
        }
        printNumber(i-1,n);
        System.out.println(i);
    }

    static void printFromNto1(int i,int n){
        if(i>n){
            return ;
        }
        printFromNto1(i+1,n);
        System.out.println(i);

    }
}
