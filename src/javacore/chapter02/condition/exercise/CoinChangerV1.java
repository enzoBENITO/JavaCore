package javacore.chapter02.condition.exercise;

public class CoinChangerV1 {

    public static void main(String[] args){

        //J'ai testé totalBill > amountPaid et totalBill < amountPaid et totalBill = amountPaid.
        int totalBill = 280;
        int amountPaid = 290;
        int change;
        int error;
        int billet50 = 50;
        int billet20 = 20;
        int billet10 = 10;
        int piece2 = 2;
        int piece1 = 1;
        int multiplicator;


        change = amountPaid - totalBill;
        error = 0 - change;


        if (change > 0){
            System.out.println("La machine va vous remettre " + change +"€");
            if (change > 50){
                multiplicator = change / 50;
                change -= multiplicator * billet50;
            }
            if (change > 20){
                multiplicator = change / 20;
                change -= multiplicator * billet20;
            }
            if (change > 10){
                multiplicator = change / 10;
                change -= multiplicator * billet10;
            }
            if (change > 2){
                multiplicator = change / 2;
                change -= multiplicator * piece2;
            }
            if (change == 1){
                multiplicator = change / 1;
                change -= multiplicator * piece1;
            }
            System.out.println("Votre monnaie vous à été entierement rendu.");


        } else if (change < 0) {
            System.out.println("La machine n'accepte pas il vous manque " + error +"€. Veuillez réessayer." );
        }
        else {
            System.out.println("Vous avez remit l'appoint.");
        }
        System.out.println(change);
    }
}
