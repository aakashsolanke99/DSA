package org.aakash.Recursion;

import java.util.Scanner;

public class PrintName {
     static int  count=0;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        printName(5);


    }

    public static void printName(int n){
        if(n==count){
            return;
        }
        System.out.println("AAKASH");
        count++;
        printName(n);


    }
}
