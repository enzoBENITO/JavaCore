package javacore.chapter03.loop.exercise;

public class SmallestDivisorFinder {
    public static void main (String[] args){

        //J'ai tester un nombre premier, un nombre pair et impair.
        int number = 12;
        int divisor =2;
        boolean infinite= true;
        while (infinite){
            if (number % divisor == 0){
                if (divisor == number){
                    System.out.println("C'est un nombre premier.");
                }
                System.out.println(divisor);
                infinite = false;
            }
            divisor++;
        }
    }
}
