package org.aakash.exception;


import java.io.IOException;

class Parent{
    public void doWork() throws IOException {
        System.out.println("inside Prent class");
    }

}

class Child extends Parent{
    @Override
    public void doWork() throws IOException {
         try {
             throw  new IOException("III");
         }
//         catch (Exception e){
//             System.out.println(e);
//         }
         finally {
             System.out.println("indide finally");
         }



    }
}

public class Test {
    public static void main(String[] args) throws IOException {
        Child c= new Child();
        c.doWork();

    }
}
