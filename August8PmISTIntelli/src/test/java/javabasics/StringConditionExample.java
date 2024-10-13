package javabasics;

public class StringConditionExample {

    public static void main(String[] args) {

        String name1 = "lmti";
        String name2 = "LMTI";

        if(name1.equals(name2)){
            System.out.println("both are equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
