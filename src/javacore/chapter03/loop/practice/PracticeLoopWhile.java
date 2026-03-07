package javacore.chapter03.loop.practice;

public class PracticeLoopWhile {
    public static void main(String[] args){
//        int age = 15;
//
//        if (age < 18){
//            System.out.println("Condition - Age =" + age);
//        }
//        while (age < 18){
//            System.out.println("Boucle - Age =" + age);
//            age++;
//        }
//        System.out.println("On est sortie de la boucle");
//        int result = 1+2+3+4+5+6+7+8+9;
//        System.out.println("resultat = " + result);


        int result2 = 0;
        int compteur =0;
        while (compteur <= 100){
            result2 += compteur;
            compteur++;
            System.out.println(result2);
        }
    }
}
