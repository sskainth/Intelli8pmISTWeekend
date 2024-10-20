package javabasics;

import io.cucumber.java.sl.In;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set <Integer> s = new HashSet<Integer>();
        s.add(34);
        s.add(67);
        s.add(55);
        s.add(67);
        System.out.println(s);

    }
}
