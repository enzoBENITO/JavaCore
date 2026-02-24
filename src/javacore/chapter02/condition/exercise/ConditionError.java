package javacore.chapter02.condition.exercise;

public class ConditionError {
    public static void main(String[] args) {

        int age = 80;

        if(age <= 16) {
            System.out.println("Vous êtes mineur.");
        }
        else if(age == 17) {
            System.out.println("Vous êtes bientôt majeur !");
        }
        else if(age == 18) {
            System.out.println("Vous êtes majeur.");
        }
        else if(age > 18 && age < 60) {
            System.out.println("Vous êtes un adulte.");
        }
        else if(age > 60 && age < 100) {
            System.out.println("Vous n'êtes plus tout jeune.");
        }
        else {
            System.out.println("Vous êtes une exception dans ce monde !");
        }

    }
    /* Le problème ici est que les deux conditions sont vraies, donc dès lors qu'une condition est validée,
    le programme sort des boucles if après avoir affiché le message.
    Pour pouvoir rentrer dans l'autre boucle, il faudrait ajouter une limite à la précédente.
    Ici, dès lors que l'âge dépasse 60, on rentre dans la boucle suivante
    */
}
