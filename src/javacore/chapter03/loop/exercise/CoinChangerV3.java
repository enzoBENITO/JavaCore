package javacore.chapter03.loop.exercise;

public class CoinChangerV3 {
    public static void main(String[] args){

        //J'ai testé totalBill > amountPaid et totalBill < amountPaid et totalBill = amountPaid.
        int totalBill = 280;
        int amountPaid = 220;
        int change;
        int error;
        int billet50 = 50;
        int billet20 = 20;
        int billet10 = 10;
        int piece2 = 2;
        int piece1 = 1;

        change = amountPaid - totalBill;
        error = 0 - change;

        System.out.println("La machine va vous remettre " + change +"€");

        while (change > 0){
            if (change >= 50){
                change -= billet50;
            }
            if (change >= 20){
                change -= billet20;
            }
            if (change >= 10){
                change -= billet10;
            }
            if (change >= 2){
                change -= piece2;
            }
            if (change == 1){
                change -= piece1;
            }
            System.out.println("Votre monnaie vous à été entierement rendu.");
        }
        if (change < 0) {
            System.out.println("La machine n'accepte pas il vous manque " + error +"€. Veuillez réessayer." );
        }
        else {
            System.out.println("Vous avez remit l'appoint.");
        }
        System.out.println(change);
    }
}
