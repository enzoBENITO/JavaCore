package javacore.chapter02.condition.exercise;

public class FlightReservationValidator {
    public static void main(String[] args){

        boolean isLoggedIn = true;
        int age = 15;
        int seatsAvailable = 40;
        boolean isPremiumMember = true;
        boolean isVipFlight = true;
        if (isLoggedIn && age >= 18 && seatsAvailable > 0 && (!isVipFlight || isPremiumMember)){
            System.out.println("Réservation effectué avec succès !");
            seatsAvailable--;
        }
        else if (age <= 18 && isLoggedIn && seatsAvailable > 0 && (!isVipFlight || isPremiumMember)) {
            System.out.println("Vous n'êtes pas majeur.");
        }
        else if (age >= 18 && !isLoggedIn && seatsAvailable > 0 && (!isVipFlight || isPremiumMember)) {
            System.out.println("Vous n'êtes pas connecté.");
        }
        else if (age >= 18 && isLoggedIn && seatsAvailable < 0 && (!isVipFlight || isPremiumMember)) {
            System.out.println("Il n'y a plus de place disponible.");
        }
        else if (age >= 18 && isLoggedIn && seatsAvailable > 0 && (isVipFlight || !isPremiumMember)) {
            System.out.println("Ce vol est VIP. Vous n'êtes pas membre premium.");
        }
        else if (age >= 18 && isLoggedIn && seatsAvailable > 0 && (!isVipFlight || isPremiumMember)) {
            System.out.println("Il n'y a plus de place disponible.");
        }
        else {
            System.out.println("Résevation Impossible, essayez plus tard.");
        }
    }
}
