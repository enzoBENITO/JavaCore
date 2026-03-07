package javacore.chapter03.loop.exercise;

public class ForLoopExample {
    public static void main(String[] args){

        int counterIncreas = 10;
        int counterDecreas = 1;
        int counterPair = 20;

        //Afficher nombre croissant
        for (int i = 1; i <= counterIncreas; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        //Afficher nombre décroissant
        for (int i = 10; i >= counterDecreas; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        //Afficher les nombres pairs
        for (int i = 2; i <= counterPair; i +=2){
            System.out.print(i + " ");
        }
        System.out.println();

        //Afficher l'alphabet
        char lettreA = 'Z';

        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        //Calculer la factoriel de 4
        int result = 1;
        int factorielle = 4;
        for (int i = 1; i <= factorielle; i++){
            result *= i;
        }
        System.out.println("La factorielle de " + factorielle + " est " + result);
    }
}
