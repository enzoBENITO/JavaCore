package javacore.chapter02.condition.exercise;

public class MaxOfThree {
    public static void main(String[] args){

        int a = 6;
        int b = 60;
        int c = 600;

        if (a == b && a == c){
            System.err.println("Toutes les valeurs sont égales, il n'y a en pas une plus grande que les autres.");
        }
        else if (a == b) {
            System.err.println("Les valeurs de a et b sont égales.");
        }
        else if (c == b) {
            System.err.println("Les valeurs de c et b sont égales.");
        }
        else if (a == c) {
            System.err.println("Les valeurs de a et c sont égales.");
        }
        else if (a > b && a > c){
            System.out.println("La plus grande valeur est : " + a);
        }
        else if (b > a && b > c){
            System.out.println("La plus grande valeur est : " + b);
        }
        else if (c > a && c > b){
            System.out.println("La plus grande valeur est : " + c);
        }
    }
}
