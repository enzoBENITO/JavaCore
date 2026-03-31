package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV1 {
    public static void main(String[] args) {

        boolean isPrimeNumber = true;
        int potentialPrimeNumber = 0;

//         for (int primeNumber = 2; primeNumber <= 230; primeNumber++){
//             for (int divisor = 2; divisor < primeNumber; divisor++){
//                 if (primeNumber % divisor == 0){
//                     isPrimeNumber = false;
//                 }
//             }
//             if (isPrimeNumber == true){
//                 System.out.println(primeNumber);
//                 counter++;
//             }
//             isPrimeNumber = true;
//         }
//        System.out.println("Il y a " + counter + " nombre premiers.");

        //BONUS N°1
        int primeNumber = 2;
        int analyzeNumber = 0;

        while (potentialPrimeNumber < 50) {
            isPrimeNumber = true;
            for (int potentialdivisor = 2; potentialdivisor < primeNumber; potentialdivisor++) {
                if (primeNumber % potentialdivisor == 0) {
                    isPrimeNumber = false;
                }
            }
            if (isPrimeNumber == true) {
                System.out.println(primeNumber);
                potentialPrimeNumber++;
            }
            primeNumber++;
        }
        System.out.println("Il y a " + potentialPrimeNumber + " nombre premiers.");
        System.out.println("Il a fallu " + analyzeNumber + " analyses.");
    }
}
