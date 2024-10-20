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

        System.out.println(l);
        l.add(78);
        l.add(90);
        l.add(90);
        l.add(90);
        System.out.println(l);
        System.out.println(l.get(2));

        List <String> l2 = new ArrayList<String>();
        l2.add("abc");

    }
}
