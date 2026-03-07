package javacore.chapter03.loop.exercise;

public class AlphabetPrinter {
    public static void main(String[] args){

        char letter = 'A';

//        while (letter <= 90){
//            System.out.print(letter);
//            letter++;
//        }

        //Bonus
        char letterMin = 'a';
        int result = letterMin - letter; // pour trouver le numéro correspondant au a
        System.out.println(result);
        System.out.println(65+32); // nombre correspondant a la lettre a
        while (letterMin <= (97+25)){
            System.out.print(letterMin);
            letterMin++;
        }

    }
}
