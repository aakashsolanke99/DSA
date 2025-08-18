package org.aakash.patterns;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter No :- ");
        int n= sc.nextInt();
        twelve(n);
    }

    private static void first(int n) {
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void second(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void third(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void forth(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void fifth(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void six(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void seventh(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int l=1;l<i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void eight(int n){
        for(int i=1;i<=n;i++){
           for(int j=0;j<=i-1;j++) {
               System.out.print(" ");
           }
           for(int k=1;k<=n-i;k++ ){
               System.out.print("*");
           }

           for(int l=1;l<n-i;l++){
               System.out.print("*");
           }

            System.out.println();
        }
    }

    static void nine(int n){
        seventh(n);
        eight(n);
    }

    static void ten(int n){
        int star;

        for(int i=1;i<=2*n-1;i++){
            star=i;
            if(i>n){
                star=(2*n-i);
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void eleven(int n){
        int start=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                start=1;
            }else {
                start=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1- start;
            }
            System.out.println();
        }
    }


    static void twelve(int n){
        int start = 2*(n-1);
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int j=1;j<start;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            start= start-2;

            System.out.println();
        }
    }
}
