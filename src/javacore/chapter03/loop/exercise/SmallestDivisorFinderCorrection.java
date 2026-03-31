package javacore.chapter03.loop.exercise;

public class SmallestDivisorFinderCorrection {
    public static void main(String[] args) {

        //J'ai tester un nombre premier, un nombre pair et impair.
        int number = 27;
        int divisor = 2;
        int smallestDivisor = 0;

        while (number % divisor != 0) {
            divisor++;
            smallestDivisor = divisor;
        }
        if (smallestDivisor == number) {
            System.out.println("C'est un nombre premier.");
        }
        else {
            System.out.println("Le plus petit diviseur est : " + smallestDivisor);
        }
    }
}
