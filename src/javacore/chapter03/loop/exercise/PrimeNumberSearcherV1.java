package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV1 {
    public static void main(String[] args) {

        boolean isPrimeNumber = true;
        int counter = 0;

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

        while (counter < 50) {
            for (int divisor = 2; divisor < primeNumber; divisor++) {
                if (primeNumber % divisor == 0) {
                    isPrimeNumber = false;
                }
            }
            if (isPrimeNumber == true) {
                System.out.println(primeNumber);
                counter++;
            }
            isPrimeNumber = true;
            primeNumber++;

            if (counter == 50) {
                analyzeNumber = primeNumber;
            }
        }
        System.out.println("Il y a " + counter + " nombre premiers.");
        System.out.println("Il a fallu " + analyzeNumber + " analyses.");
    }
}
