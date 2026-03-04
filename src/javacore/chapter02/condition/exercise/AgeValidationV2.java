package javacore.chapter02.condition.exercise;

public class AgeValidationV2 {
    public static void main(String[] args){

        int dayOfBirth = 20;
        int monthOfBirth = 2;
        int yearOfBirth = 2008;
        int reinitialisation = 0;
        int daysInMonth;
        int monthDifference = 0;
        int daysDifference = 0; // represente toute la periode en jours avant de devenir majeur.

        //Il faudra tester une date pour une personne majeur (au mois près, année près, et jour près) et une personne
        // mineur (au mois près, année près, et jour près).

        //Date de test
        int currentDay = 10;
        int currentMonth = 1;
        int currentYear = 2026;

        System.out.println("Nous sommes le " + currentDay + "/" + currentMonth + "/" + currentYear);

        if (currentYear - yearOfBirth >= 18 && monthOfBirth <= currentMonth && dayOfBirth <= currentDay){
            System.out.println("Vous êtes majeur.");
        }
        else if (currentYear - yearOfBirth >= 18 && monthOfBirth < currentMonth){
            System.out.println("Vous êtes majeur.");
        }
        else if (currentYear - yearOfBirth > 18) {
            System.out.println("Vous êtes majeur.");
        } //Bonus N3
        else if ((currentYear - yearOfBirth <= 18 && monthOfBirth >= currentMonth && dayOfBirth > currentDay) || (currentYear - yearOfBirth <= 18 && monthOfBirth > currentMonth && dayOfBirth < currentDay)) {
            System.out.println("Vous êtes mineur.");
            if ((currentMonth <= 7 && currentMonth % 2 != 0) || (currentMonth >= 8 && currentMonth % 2 == 0)) { //Verrification que le mois actuel soit a 31.
                daysInMonth = 31;
                if (currentMonth == 1 && monthOfBirth > 2) {
                    monthDifference = (monthOfBirth - currentMonth) - 2; //-2 on s'arrete a la fin du mois + fevrrier qui precede le mois de naissance. On aura juste à ajouter le sjours qui reste.
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
            }
            else if (monthOfBirth == currentMonth) {
                daysDifference = dayOfBirth - currentDay;
            }
            else {
                daysInMonth = 30;
                if (currentMonth >= 4 && monthOfBirth > 8) {
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
            }
            if (monthDifference % 2 == 0 && (currentMonth != monthOfBirth )){
                daysDifference = reinitialisation + (30 * (monthDifference/2) + 31 * (monthDifference / 2)) + dayOfBirth;
            }
            else if (monthDifference % 2 !=0 && (currentMonth != monthOfBirth )) { //On commence toujours par 31 car apres fevrier c'est mars
                daysDifference = reinitialisation + (31 * ((monthDifference + 1)/2) + 30 * (monthDifference / 2)) + dayOfBirth;
            }
        }
        System.out.println("Vous serez majeur dans " + daysDifference + " jours.");
    }
}
