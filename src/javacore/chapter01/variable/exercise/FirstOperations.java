package javacore.chapter01.variable.exercise;

public class FirstOperations {
    public static void main(String[] args){

        //N°1
        System.out.println("N°1 ---------");
        int a = 20;
        int b = 10;
        int sum = a + b;
        int subtarction = a - b;
        int multiplication = a * b;
        int division = a / b;

        //display result
        System.out.println(sum);
        System.out.println(subtarction);
        System.out.println(multiplication);
        System.out.println(division);

        //display upgrade
        System.out.println("La somme de a + b = " + sum);
        System.out.println("La soustraction de a - b = " + subtarction);
        System.out.println("La multiplication de a * b = " + multiplication);
        System.out.println("La division de a / b = " + division);


        //N°2
        System.out.println("N°2 ---------");
        int c = 4;
        int d = 5;

        c += d; // c = c +d
        System.out.println(c);

        d -= 5; // d = d -5
        System.out.println(d);

        c *= 3; // c = c * 3
        System.out.println(c);

        d /= 3; // d = d / 3
        System.out.println(d);


        //N°3
        System.out.println("N°3 ---------");
        int e = 1 * 5 + 2;
        System.out.println(e);

        int f = 1 * (5 + 2);
        System.out.println(f);

        int g = ((2 * 5) - 2 / (4 - 2)) - 1;
        System.out.println(g);







    }
}
