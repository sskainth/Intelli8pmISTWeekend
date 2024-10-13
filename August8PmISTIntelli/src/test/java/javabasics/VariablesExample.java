package javabasics;

public class VariablesExample {

    String name = "lmti"; // global variable
    int j ;
    public static void main(String[] args) {
        VariablesExample v = new VariablesExample();
        v.m1();
    }

    public void m1(){
        int a = 1;  //local variable
        System.out.println(a);
        String name = "aravinth";
        System.out.println(name);
        System.out.println(this.name);
        j = 500 ;
        j = 800 ;
    }

    public void m2(){

       int b = 100 ; // local variable for m2
        System.out.println(b);
        System.out.println(name);
        System.out.println(j);
    }
}
