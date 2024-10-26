package javabasics;

import org.openqa.selenium.TimeoutException;

public class TryCatch {

    public static void main(String[] args) {

        String a = "$1234";

        System.out.println(a.substring(1));

        try{
            int b = Integer.parseInt(a);
            int c = 100;
            System.out.println(b+c);
        }
        catch (NumberFormatException e){

            int k = Integer.parseInt(a.substring(1));
            System.out.println(100+k);
        }
        catch(TimeoutException n){

        }

        finally {
            System.out.println("abc");
        }


    }
}
