package javacore.chapter03.loop.exercise;

public class PerfectNumberFinder {
    public static void main(String[] args) {

        int start = 1;
        int end = 10000;
        int divisorStockage = 0;

        while (start <= end) {
            for (int divisor = 1; divisor < start; divisor++) {
                if (start % divisor == 0) {
                    divisorStockage += divisor;
                }
            }
            if (divisorStockage == start) {
                System.out.println(start + " est un nombre parfait compris entre 0 et " + end);
            }
            divisorStockage =0;
            start++;
        }
    }
}
// Entre 0 et 100 il y a deux nombres parfaits : 6, 28
// Entre 0 et 1000 il y a trois nombres parfaits : 6, 28, 496
// Entre 0 et 10000 il y a quatres nombres parfaits : 6, 28, 496, 8128
// Entre 0 et 100000 il y a quatres nombres parfaits : 6, 28, 496, 8128





