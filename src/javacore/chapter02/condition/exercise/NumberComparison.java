package javacore.chapter02.condition.exercise;

public class NumberComparison {
    public static void main(String[] args){

        int number1 = 999999;
        int number2 = 999999;

        if (number1 > number2){
            System.out.println(number1 + " est la plus grande valeur.");
        }
        else if (number2 > number1) {
            System.out.println(number2 + " est la plus grande valeur.");
        }
        else {
            System.out.println(number1 + " et " + number2 + " sont egaux");
        }
    }
}
