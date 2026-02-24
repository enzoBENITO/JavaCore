package javacore.chapter02.condition.practice;

public class PracticeOperatorComarison {
    public static void main(String[] args){

        int a = 30;
        int b = 40;

        boolean isEqual = a == b;

        System.out.println("Est-ce que a == b : " + isEqual);

        boolean isNotEqual = a != b;

        System.out.println("Est-ce que a != b : " + isNotEqual);

        boolean isLessThan = a < b;

        System.out.println("Est-ce que a < b : " + isLessThan);

        boolean isLessThanOrEqual = a <= b;

        System.out.println("Est-ce que a <= b : " + isLessThanOrEqual);

        int age = 45;

        boolean isThirtyOrYounger = age <= 30;

        System.out.println(isThirtyOrYounger);

        boolean isGreaterThan = a > b;


    }
}
