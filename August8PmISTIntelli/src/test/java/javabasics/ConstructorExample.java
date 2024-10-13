package javabasics;

import org.checkerframework.checker.units.qual.C;

public class ConstructorExample {

    static int a ;  //global variable
    public ConstructorExample(){
        a = 100;
    }

    public ConstructorExample(int a){  //500
        this.a = a;
    }

    public ConstructorExample(String b){

    }

    public static void main(String[] args) {

        ConstructorExample c = new ConstructorExample(500);
        c.m1();
        c.m2();
        System.out.println(a);
    }

    public void m1(){
        System.out.println(a);
    }

    public void m2(){
        System.out.println(a);
    }
}
