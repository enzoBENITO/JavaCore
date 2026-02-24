package javacore.chapter02.condition.exercise;

public class FirstBooleanCondition {
    public static void main(String[] args){

        byte age = 25;
        boolean isAdult = true;


        if (age >= 18){
            System.out.println("Vous êtes majeur.");
        }
        else {
            System.out.println("Vous êtes mineur.");
        }
    }
}
