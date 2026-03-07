package javacore.chapter02.condition.exercise;

/*
 Le code comme je l'ai pensé compte toute la periode en jours pour determiner quand l'individu sera majeur.
 En ce qui concerne la verrifiaction d'âge elle se fait avec des conditions.

*/

public class AgeValidationTest {
    public static void main(String[] args) {

        int dayOfBirth = 28;
        int monthOfBirth = 4;
        int yearOfBirth = 2008;
        int reinitialisation;
        int daysInMonth;
        int monthDifference;
        int daysDifference = 0; // represente toute la periode en jours avant de devenir majeur.


        //Il faudra tester une date pour une personne majeur (au mois près, année près, et jour près) et une personne
        // mineur (au mois près, année près, et jour près).

        //Date de test
        int currentDay = 1;
        int currentMonth = 3;
        int currentYear = 2026;

        /**
         * Début d'un code que nous ne comprenons pas à ce stade de la formation...
         */

        // Récupération de la date courante de la machine exécutant ce programme
        java.time.LocalDate currentDate = java.time.LocalDate.now();

//        int currentDay   = currentDate.getDayOfMonth(); // Jour courant (entre 1 et 31)
//        int currentMonth = currentDate.getMonthValue(); // Mois courant (entre 1 et 12)
//        int currentYear  = currentDate.getYear();       // Année courante (202X)

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
            //Reinitiliser les jours du mois de naissance
            if ((monthOfBirth <= 7 && monthOfBirth % 2 != 0) || (monthOfBirth >= 8 && monthOfBirth % 2 == 0)){ //Verrification que le mois actuel soit a 31.
                daysInMonth = 31;
                if (currentMonth == 1 && monthOfBirth > 2){
                    monthDifference = (monthOfBirth - currentMonth) -2; //-2 on s'arrete a la fin du mois + fevrrier qui precede le mois de naissance. On aura juste à ajouter le sjours qui reste.
                    reinitialisation = daysInMonth - currentDay + 28; // 28 mois de fevrier.
                }
                else if (currentMonth > 3 && monthOfBirth > 8) {
                    reinitialisation = daysInMonth - currentDay + 62; //62 pour juillet et aout.
                    monthDifference = (monthOfBirth - currentMonth) - 3; //-3 on s'arrete a la fin du mois qui precede le mois de naissance + Juillet et aout.
                }
                else if (currentMonth == 2) {
                    daysInMonth = 28;
                    reinitialisation = daysInMonth - currentDay;
                    monthDifference = (monthOfBirth - currentMonth) - 1;
                }
                else {
                    reinitialisation = daysInMonth - currentDay;
                    monthDifference = (monthOfBirth - currentMonth) - 1;
                }
                if (monthDifference % 2 == 0){
                    daysDifference = reinitialisation + (30 * (monthDifference/2) + 31 * (monthDifference / 2)) + dayOfBirth;
                    System.out.println(monthDifference);
                }
                else if (monthDifference % 2 !=0) { //On commence toujours par 31 car apres fevrier c'est mars
                    daysDifference = reinitialisation + (31 * ((monthDifference + 1)/2) + 30 * (monthDifference / 2)) + dayOfBirth;
                }
                System.out.println(daysDifference);

            }
            else if (monthOfBirth == 2) { // si on a le mois de naissance en fevrier alors que le mois de naissance >= que le mois actuel
                daysDifference = dayOfBirth - currentDay;
                System.out.println(daysDifference);
            }
            else {
                daysInMonth = 30;
                if (currentMonth >= 4 && monthOfBirth > 8) {
                    reinitialisation = daysInMonth - currentDay + 62; //62 pour juillet et aout.
                    monthDifference = (monthOfBirth - currentMonth) - 3; //-3 on s'arrete a la fin du mois qui precede le mois de naissance + Juillet et aout.
                } else if (currentMonth == 2) {
                    daysInMonth = 28;
                    reinitialisation = daysInMonth - currentDay;
                    monthDifference = (monthOfBirth - currentMonth) - 1;
                }
                else {
                    reinitialisation = daysInMonth - currentDay;
                    monthDifference = (monthOfBirth - currentMonth) - 1;
                }
                if (monthDifference % 2 == 0){
                    daysDifference = reinitialisation + (30 * (monthDifference/2) + 31 * (monthDifference / 2)) + dayOfBirth;
                    System.out.println(monthDifference);
                }
                else if (monthDifference % 2 !=0) { //On commence toujours par 31 car apres fevrier c'est mars
                    daysDifference = reinitialisation + (31 * ((monthDifference + 1)/2) + 30 * (monthDifference / 2)) + dayOfBirth;
                }
                System.out.println(daysDifference);
            }

        }
        else if (currentYear - yearOfBirth <= 18 && monthOfBirth > currentMonth && dayOfBirth < currentDay) {
            System.out.println("Vous êtes mineur.");
            if (currentMonth <= 7 && (currentMonth % 2) == 1 || currentMonth >= 8 && (currentMonth % 2) == 0){
                daysInMonth = 31;
                reinitialisation = daysInMonth - currentDay;
                monthDifference = (monthOfBirth - currentMonth) -1; //-1 on s'arrete a la fin du mois qui precede le mois de naissance. On aura juste à ajouter le sjours qui reste.


            }
            //-------------------------------------Validé-------------------------------------------------------------
            else if (currentMonth == 2) {
                daysInMonth = 28;
                if (monthOfBirth > 8) {
                    reinitialisation = daysInMonth - currentDay + 62; //62 pour juillet et aout.
                    monthDifference = (monthOfBirth - currentMonth) - 3; //-3 on s'arrete a la fin du mois qui precede le mois de naissance + Juillet et aout.
                }
                else {
                    reinitialisation = daysInMonth - currentDay;
                    monthDifference = (monthOfBirth - currentMonth) - 1;
                }
                if (monthDifference % 2 == 0){
                    daysDifference = reinitialisation + (30 * (monthDifference/2) + 31 * (monthDifference / 2)) + dayOfBirth;
                    System.out.println(monthDifference);
                }
                else if (monthDifference % 2 !=0) { //On commence toujours par 31 car apres fevrier c'est mars
                    daysDifference = reinitialisation + (31 * ((monthDifference + 1)/2) + 30 * (monthDifference / 2)) + dayOfBirth;
                }
                System.out.println(daysDifference);
            }
            //------------------------------------------------------------------------------------//
            else {
                daysInMonth = 30;
                reinitialisation = daysInMonth - currentDay;
                monthDifference = (monthOfBirth - currentMonth) -1; //-1 on s'arrete a la fin du mois qui precede le mois de naissance. On aura juste à ajouter le sjours qui reste.
                //daysDifference = daysDifference + ;
            }

        }

        //Bonus N1
        //Je n'ai pas trouvé encore

        //Bonus N3


    }
}
