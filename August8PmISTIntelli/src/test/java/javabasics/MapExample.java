package javabasics;

import io.cucumber.java.hu.Ha;
import io.cucumber.java.sl.In;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map <Integer, String> m = new HashMap<Integer,String>();
        m.put(123,"abc");
        m.put(890,"xyz");
        System.out.println(m);
        System.out.println(m.get(890));

    }
}
