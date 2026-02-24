package javacore.chapter02.condition.exercise;

public class ParityChecker {
    public static void main(String[] args){

        int number = 102580;
        long numberBonus= 3333777799999L;

        //L'operateur est % lorsqu'un nombre  est divisible par 2 il est pair.
        //% renvoie le reste d'une division.

        if (number % 2 == 0){
            System.out.println(number + " est pair.");
        }
        else {
            System.out.println(number + " est impair.");
        }

        //Bonus
        if (numberBonus % 2 == 0){
            System.out.println(numberBonus + " est pair.");
        }
        else {
            System.out.println(numberBonus + " est impair.");
        }
        //Le nombre bonus finit par 9 et 9 est impair car il n'est pas divisible par 2 : 9 = 2 * 4 + 1
        //Donc il est bien impair.
    }
}
