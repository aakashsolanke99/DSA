package org.aakash.staticvariablesandmethods;

import java.util.ArrayList;
import java.util.List;

class Parent {
    static int staticVeriable=0;
    int nonStaticVeriable=5;

    public static void showStatic(){
        System.out.println("inside static method method of parent");
    }

    public void showNonStatic(){
        System.out.println("Inside non static of parent ");
    }

    List<Integer> l= new ArrayList<>();
}

class Child extends Parent{
    static int staticVeriable=20;

    int nonStaticVeriable;
    public static void showStatic(){
        System.out.println("inside static method of child");
    }

    public void showNonStatic(){
        System.out.println("Inside non static inside child ");
    }
}

public class PracticeStatic {


    public static void main(String[] args) {
          Parent p= new Parent();
        System.out.println(p.nonStaticVeriable);
        p.showNonStatic();
        Parent.showStatic();
        System.out.println("-----------------------------------------------------");


        Child c = new Child();
        System.out.println(c.nonStaticVeriable);
        c.nonStaticVeriable=99;
        System.out.println(c.nonStaticVeriable);
        Child.staticVeriable=200;
        System.out.println(Child.staticVeriable);
        c.showNonStatic();
        Child.showStatic();
        System.out.println("-----------------------------------------------------");

        Parent p1= new Child();
        System.out.println(p1.nonStaticVeriable);
        p1.showNonStatic();

    }

}
