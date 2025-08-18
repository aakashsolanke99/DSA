package org.aakash.Recursion;

public class FactorialOfN {
    public static void main(String[] args) {
        int factorial = factorial(4);
        System.out.println(factorial);
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }

        return n * factorial(n-1);
    }
}
