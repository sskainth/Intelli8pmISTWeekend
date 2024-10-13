package javabasics;

public class ConditionsExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 100;

        if(a == b){
            System.out.println("both are equal");
        }
        else if (a > b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("not equal");
        }
    }
}
