package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(20);
        l.add(56);
        l.add(100);
        l.add(1,78);
        l.add(78);
        l.add(90);
        l.add(90);
        l.add(90);


        for(int d:l){
            System.out.println(d);
        }

        List <String> l2 = new ArrayList<String>();
        l2.add("abc");
        l2.add("a");
        l2.add("y");

        System.out.println(l2);

        for(int i =0 ; i < l2.size() ;i++){
            System.out.println(l2.get(i));;
        }

        for(String p:l2){
            System.out.println(p);
        }




    }
}
