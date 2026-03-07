package javacore.chapter02.condition.exercise;

public class AgeValidation {
    public static void main(String[] args) {

        int dayOfBirth = 1;
        int monthOfBirth = 4;
        int yearOfBirth = 2008;
        int yearsDifference;
        int monthsDifference;
        int daysDifference;
        int daysInMonth;


        //Il faudra tester une date pour une personne majeur (au mois près, année près, et jour près) et une personne
        // mineur (au mois près, année près, et jour près).

        /**
         * Début d'un code que nous ne comprenons pas à ce stade de la formation...
         */

        // Récupération de la date courante de la machine exécutant ce programme
        java.time.LocalDate currentDate = java.time.LocalDate.now();

        int currentDay   = currentDate.getDayOfMonth(); // Jour courant (entre 1 et 31)
        int currentMonth = currentDate.getMonthValue(); // Mois courant (entre 1 et 12)
        int currentYear  = currentDate.getYear();       // Année courante (202X)

        System.out.println("Nous somme le " + currentDay + "/" + currentMonth + "/" + currentYear);

        /**
         * Fin d'un code que nous ne comprenons pas, mais dont nous pouvons utiliser les variables !
         */

        if (currentYear - yearOfBirth >= 18 && monthOfBirth <= currentMonth && dayOfBirth <= currentDay){
            System.out.println("Vous êtes majeur.");
        }
        else if (currentYear - yearOfBirth >= 18 && monthOfBirth < currentMonth){
            System.out.println("Vous êtes majeur.");
        }
        else if (currentYear - yearOfBirth > 18) {
            System.out.println("Vous êtes majeur.");
        } //Bonus N3
        else if (currentYear - yearOfBirth <= 18 && monthOfBirth >= currentMonth && dayOfBirth > currentDay){
            System.out.println("Vous êtes mineur.");
            yearsDifference = 18 - (currentYear - yearOfBirth);
            monthsDifference = monthOfBirth - currentMonth;
            daysDifference = currentDay - dayOfBirth;
            System.out.println("Vous serez majeur dans :" + yearsDifference + " ans " + monthsDifference + " mois et " + daysDifference + " jours.");
        }
        else if (currentYear - yearOfBirth <= 18 && monthOfBirth > currentMonth && dayOfBirth < currentDay) {
            System.out.println("Vous êtes mineur.");
            if (monthOfBirth <= 7 && (monthOfBirth % 2) == 1 || monthOfBirth >= 10 && (monthOfBirth % 2) == 0){
                daysInMonth = 31;
                daysDifference = daysInMonth - currentDay;
                daysDifference += dayOfBirth;
                monthsDifference = monthOfBirth - currentMonth;
                yearsDifference = 18 - (currentYear - yearOfBirth);
                System.out.println("Vous serez majeur dans :" + yearsDifference + " ans " + monthsDifference + " mois et " + daysDifference + " jours.");
            }
            else if (monthOfBirth == 2) {
                daysInMonth = 28;
                daysDifference = daysInMonth - currentDay;
                daysDifference += dayOfBirth;
                monthsDifference = monthOfBirth - currentMonth;
                yearsDifference = 18 - (currentYear - yearOfBirth);
                System.out.println("Vous serez majeur dans :" + yearsDifference + " ans " + monthsDifference + " mois et " + daysDifference + " jours.");
            }
            else {
                daysInMonth = 30;
                daysDifference = daysInMonth - currentDay;
                daysDifference += dayOfBirth;
                monthsDifference = monthOfBirth - currentMonth;
                yearsDifference = 18 - (currentYear - yearOfBirth);
                System.out.println("Vous serez majeur dans :" + yearsDifference + " ans " + monthsDifference + " mois et " + daysDifference + " jours.");
            }

        }

        //Bonus N1
        //Je n'ai pas trouvé encore

        //Bonus N3


    }
}
