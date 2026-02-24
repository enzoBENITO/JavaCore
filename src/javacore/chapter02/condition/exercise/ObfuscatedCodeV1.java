package javacore.chapter02.condition.exercise;

public class ObfuscatedCodeV1 {
    public static void main(String[] args) {

        int vehicleType = 1; // Type de véhicule (1 = 2 Roues, 2 = Voiture, 3 = Poid lourd)

        double distance = 100; // Distance en mètre


        double d = 0.03;

        double price = 0;

        if (vehicleType == 1) {
            price = distance * 0.10;
        }
        if (vehicleType == 2) {
            price = distance * 0.20;
        }
        if (vehicleType == 3) {
            price = distance * 0.35;
        }

        price = price - (distance * d);

        System.out.println("Catégorie de vehicule (1 = 2 Roues, 2 = Voiture, 3 = Poid lourd)");
        System.out.println("Votre vehicule est categorisé : " + vehicleType + "le prix est : " + price + "€");

    }
}
// je pense que le code calcul la consomation de chaque type de vehicule et renvoie le prix en fonction de la distance parcouru par ces véhicule.
// Concerant le rôle du if true je ne comprend pas pourquoi garder 3% de la distance peut importe celle ci. Je l'ai retiré car il s'active tout le temps.
