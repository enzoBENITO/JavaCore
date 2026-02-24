package javacore.chapter02.condition.exercise;

public class ScholarshipEligibility {
    public static void main(String[] args){

        //3.5, 3.0, 4.0
        double studentGpa = 4.0;
        //60 000, 45 000, 35 000, 65 000
        double householdIncome = 40000.0;
        // j'ai tester qu'avec false je ne comprend pas trop l'interêt sachant que si il est à faux
        //par exemple pour la dernier condition le faite que la variable soit à faux
        //la boucle ne pourra jamais etre tester donc pourquoi l'insérer dans la condition?
        boolean hasExtracurricular = false;

        if (studentGpa > 3.5 && householdIncome < 40000 && !hasExtracurricular){
            System.out.println("Vous êtes elligible a la bourse pleine.");
        }
        else if (studentGpa > 3.5 && householdIncome < 60000 && !hasExtracurricular) {
            System.out.println("Vous êtes elligible a la bourse partielle.");
        }
        else if (studentGpa <=3.5 && householdIncome >= 60000 || hasExtracurricular){
            System.out.println("Vous n'êtes pas elligible à la bourse.");
        }
    }
}
