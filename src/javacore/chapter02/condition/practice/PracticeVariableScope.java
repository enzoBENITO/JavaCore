package javacore.chapter02.condition.practice;

public class PracticeVariableScope {
    public static void main(String[] args){

        int age = 15;

        if (age < 18){
            System.out.println("Vois etes mineur (" + age + ") ans.");

            int discountPercentage = 20;

            System.out.println("Vous avez le droit à " + discountPercentage + "% de reducton");

            if (true){
                discountPercentage = 30;
            }
        }

    }
}
