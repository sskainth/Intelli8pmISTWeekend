package javabasics;

public class CalcultorExample {

    public static void main(String[] args) {

        int a = 100 ;
        int b = 20 ;
        String operator = "-";

        if(operator.equals("+")){

            System.out.println(a+b);
        }
        else if(operator.equals("-")){
            if( a > b){
                System.out.println(a -b);
            }
            else{
                System.out.println(b -a );
            }
        }
        else if(operator.equals("*")){
            System.out.println(a * b);
        }
        else if(operator.equals("/")){
            System.out.println(a / b);
        }
        else{
            System.out.println("enter the valid operator");
        }

    }
}
