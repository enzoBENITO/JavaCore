package javacore.chapter02.condition.exercise;

public class CoinChangerV2 {

    public static void main(String[] args){

        int totalBill = 56;
        int amountPaid = 200;
        int change;
        int error;
        int nombreBillet50 = 1;
        int nombreBillet20 = 5;
        int nombreBillet10 = 3;
        int nombrePiece2 = 2;
        int nombrePiece1 = 15;
        int billet50 = 50; // = 50
        int billet20 = 20; // = 100
        int billet10 = 10; //= 30
        int piece2 = 2; // = 4
        int piece1 = 1; //= 15
        int multiplicator;


        change = amountPaid - totalBill;
        error = 0 - change;


        if (change > 0) {
            System.out.println("La machine va vous remettre " + change + "€");
            if (change >= (billet50)) {
                multiplicator = change / (billet50);
                if (multiplicator == nombreBillet50){
                    change = change - multiplicator * (billet50);
                }
                else if (multiplicator > nombreBillet50){
                    multiplicator = nombreBillet50;
                    change = change - multiplicator * (billet50);
                }
                else if (multiplicator < nombreBillet50){
                    change = change - multiplicator * (billet50);
                }
                System.out.println(change);
            }
            if (change >= (billet20)) {
                multiplicator = change / (billet20);
                if (multiplicator == nombreBillet20){
                    change = change - multiplicator * (billet20);
                }
                else if (multiplicator > nombreBillet20){
                    multiplicator = nombreBillet20;
                    change = change - multiplicator * (billet20);
                }
                else if (multiplicator < nombreBillet20){
                    change = change - multiplicator * (billet20);
                }
                System.out.println(change);
            }
            if (change >= (billet10)) {
                multiplicator = change / (billet10);
                if (multiplicator == nombreBillet10){
                    change = change - multiplicator * (billet10);
                }
                else if (multiplicator > nombreBillet10){
                    multiplicator = nombreBillet10;
                    change = change - multiplicator * (billet10);
                }
                else if (multiplicator < nombreBillet10){
                    change = change - multiplicator * (billet10);
                }
                System.out.println(change);
            }
            if (change >= (piece2)) {
                multiplicator = change / (piece2);
                if (multiplicator == nombrePiece2){
                    change = change - multiplicator * (piece2);
                }
                else if (multiplicator > nombrePiece2){
                    multiplicator = nombrePiece2;
                    change = change - multiplicator * (piece2);
                }
                else if (multiplicator < nombrePiece2){
                    change = change - multiplicator * (piece2);
                }
                System.out.println(change);
            }
            if (change >= (piece1)) {
                multiplicator = change / (piece1);
                if (multiplicator == nombrePiece1){
                    change = change - multiplicator * (piece1);
                }
                else if (multiplicator > nombrePiece1){
                    multiplicator = nombrePiece1;
                    change = change - multiplicator * (piece1);
                }
                else if (multiplicator < nombrePiece1){
                    change = change - multiplicator * (piece1);
                }
            }
            System.out.println("Votre monnaie vous à été entierement rendu.");
            System.out.println(change);
        }




/*
        if (change > 0){
            System.out.println("La machine va vous remettre " + change +"€");
            if (change > 50){
                if (billet50 % 50 == 0){ //je verrifie le nombre de billet de 50
                    change -= billet50;
                }
                else if (billet50 % 50 != 0) { // dans ce cas j'ai plus que un billet de 50
                    change = change - ((billet50 / 50)* billet50);
                }
            }
            if (change > 20){
                multiplicator = change / billet20;
                //il faut diviser par 20 pour obtenir le nombr ede billet de 20 que l'on va remmettre
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
        */

    }
}
