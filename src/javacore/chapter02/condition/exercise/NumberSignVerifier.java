package javacore.chapter02.condition.exercise;

public class NumberSignVerifier {
    public static void main(String[] args){

        int number = -25;
        double numberBonus = 0.0;

        System.out.println("-------Exo------");
        if (number > 0){
            System.out.println(number + " est positif.");
        }
        else if (number < 0){
            System.out.println(number + " n'est pas positif.");
        }
        else {
            System.out.println(number + " est neutre.");
        }


        System.out.println("-------Bonus 1------");
        //Bonus 1
        if (numberBonus > 0.0){
            System.out.println(numberBonus + " est positif.");
        }
        else if (numberBonus < 0.0){
            System.out.println(numberBonus + " n'est pas positif.");
        }
        else {
            System.out.println(numberBonus + " est neutre.");
        }

        
        //Bonus 2
        System.out.println("-------Bonus 2------");
        if (numberBonus >= 0.0){
            System.out.println(numberBonus + " est positif.");
        }
        else if (numberBonus <= 0.0){
            System.out.println(numberBonus + " n'est pas positif.");
        }
    }
}
