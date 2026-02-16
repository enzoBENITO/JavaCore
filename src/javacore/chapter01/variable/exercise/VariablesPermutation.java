package javacore.chapter01.variable.exercise;

public class VariablesPermutation {
    public static void main (String[] args){
        int a = 25;
        int b = 30;
        int c;

        c = a;
        a = b;
        b = c;


        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
