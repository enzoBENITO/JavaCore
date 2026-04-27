package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {
    public void main(String[] args) {

        long fibonaciNumber = 0;
        long temporary = 1;
        long incrementation;
        int counter = 0;

        /*for (int i = 0; i < 50; i++) {
            System.out.println(fibonaciNumber);
            incrementation = fibonaciNumber + temporary;
            fibonaciNumber = temporary;
            temporary = incrementation;
        }*/
        //Bonus
        for (int i = 0; i < 1000; i++) {
            if (fibonaciNumber % 2 == 0 && fibonaciNumber != 0) {
                System.out.println("Nombre pair de la suite : " + fibonaciNumber);
                counter++;
            } else {
                System.out.println("Suite de fibonnaci : " + fibonaciNumber);
            }
            incrementation = fibonaciNumber + temporary;
            fibonaciNumber = temporary;
            temporary = incrementation;
        }
        System.out.println("Il y a " + counter + " nombres paires dans la suite fibonnaci.");
    }
}
