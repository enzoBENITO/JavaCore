package javacore.chapter03.loop.exercise;

public class FactorialCalculator {
    public static void main(String[] args){

        long number = 0L;
        long result = 1L;
        long resultTransition= 1L;
        if (number < 0){
            System.err.println("Le nombre est inférieur à 0 !");
        } else if (number == 0) {
            result = 1;
            System.out.println("La factoriel de "+ number +" est " + result);
        }
        else {
            while (resultTransition <= number) {
                result *= resultTransition;
                resultTransition++;
            }
            System.out.println("La factoriel de "+ number +" est " + result);
        }

    }
    //Factoriel 7 = 5040
    //Factoriel 9 = 362880
    //Factoriel 11 = 39916800
    //Factoriel 20 = 2432902008176640000
    //Factoriel 21 = -4249290049419214848 la plage du type long n'ets pas assez grande.

    // Que remarquez-vous dans le résultat de la factorielle de 21 affichée par votre programme ?
    // Il y a un signe - devant.
    //Que pouvez-vous en déduire, par rapport au résultat de la factorielle de 20 ?
    // J'en deduit que 20 est la limite que peux calculer le type long pour une opération factoriel.

}
