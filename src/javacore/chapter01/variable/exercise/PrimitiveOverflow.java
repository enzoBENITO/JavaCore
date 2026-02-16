package javacore.chapter01.variable.exercise;

public class PrimitiveOverflow {
    public  static void main(String[] args){

        short hourSeconds = 3600;
        int daySeconds = hourSeconds * 24;
        int weekSeconds = daySeconds * 7;
        int monthSecond = weekSeconds * 4;
        int monthSecond2 = daySeconds + 30;



        //display result
        System.out.println("Dans 1 heure il y a : " + hourSeconds + " secondes");
        System.out.println("Dans 1 jour il y a : " + daySeconds + " secondes");
        System.out.println("Dans 1 semaine il y a : " + weekSeconds + " secondes");
        System.out.println("Dans 1 mois il y a : " + monthSecond + " secondes");
        System.out.println("Dans 1 mois il y a : " + monthSecond2 + " secondes");

        /*
        Quels sont les facteurs à considérer pour le futur ?

        Certains mois ont 31 jours d'autre 30 jours et fevrier 29 jours et 28 jours en année bisextile.
        De plus 4 * 7 = 28.

        Quelle(s) précision(s) sur ces calculs pourraient vous être demandées, nécessitant une modification du programme ?

        Que les calculs soient plus représentatif de la réalité.

        Pourquoi serait-il judicieux d'utiliser daySeconds plutôt que weekSeconds ?

        Car comme dit en 1ere question tous les mois ne possedent pas 30 jours donc ici utilisé daySeconds serait plus judicieux
        car on changerait seulement le multiplicateur qui correspond au jours. D'autant plus que 4 * 7 = 28 Ce qui reviendrait à
        utilsé soit les deux variables pour calaculer précisémment les secondes que comporte un mois ou à realiser un calculs en plus.
        */

        int yearSeconds;

        /*
        Selon vous, ce type de variable sera-t-il suffisant pour contenir la valeur du nombre total de secondes dans une année ?
        Si vous le jugez nécessaire, modifiez le type de la variable yearSeconds par celui que vous jugerez le plus adapté.

        Oui le type int suffira pour représenter le nombre de seconde presentent dans une année.
        */

        //En considérent qu'une année est composé de 365 jours alors on a :
        yearSeconds = daySeconds * 365;
        System.out.println("Dans 1 année il y a : " + yearSeconds + " secondes");
    }
}
