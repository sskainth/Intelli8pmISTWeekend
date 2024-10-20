package javabasics;

public class Inherit2 extends Inherit1 {

   static int a = 100 ;

    public static void main(String[] args) {
        Inherit2 i1 = new Inherit2();
        i1.m1();
        System.out.println(b);
    }

    public void m1(){
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
