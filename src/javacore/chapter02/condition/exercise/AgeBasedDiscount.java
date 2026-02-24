package javacore.chapter02.condition.exercise;

public class AgeBasedDiscount {
    public static void main(String[] args){

        //Il faut tester 24,25,26,65,66
        int age = 66;
        // Il faut verrifier 37.5,12.5 et 50
        double price = 50.0;


        if (age <= 25){
            System.out.println("Vous êtes éligible pour la réduction forfait Jeune.");
            price *= 0.75;
            System.out.println("Le billet de train fera : " + price);
        }
        else if (age >=65){
            System.out.println("Vous êtes éligible pour le forfait Sénior");
            price *=0.25;
            System.out.println("Le billet de train fera : " + price);
        }
        else {
            System.out.println("Vous n'êtes éligible à aucun forfait");
            System.out.println("Le billet de train fera : " + price);
        }
    }
}
