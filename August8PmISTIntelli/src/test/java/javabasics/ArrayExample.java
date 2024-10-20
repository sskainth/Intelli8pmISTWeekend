package javabasics;

public class ArrayExample {

    public static void main(String[] args) {

        int [] k = {10,20,30,40}; //0,1,2,3

        for(int j:k){
            System.out.println(j);
        }

        System.out.println(k.length);
        System.out.println(k[2]);

        String [] p = {"abc", "xyz"}; //0,1

        //hasNext

        for(String h:p){
            System.out.println(h);
        }


    }
}
