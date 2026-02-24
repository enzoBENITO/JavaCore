package javacore.chapter02.condition.exercise;

public class AgeCategorization {
    public static void main(String[] args){

        //Il faut verrifier 9,10,18,25,65,
        int age = 25;

        if (age < 10){
            System.out.println("Vous êtes un enfant");
        }
        else if (10 <= age && age < 18){
            System.out.println("Vous êtes un adolescent");
        }
        else if (18 <= age && age < 25){
            System.out.println("Vous êtes un jeune adulte");
        }
        else if (25 <= age && age < 65) {
            System.out.println("Vous êtes un adulte");

        } else {
            System.out.println("Vous êtes un senior");
        }
    }
}
