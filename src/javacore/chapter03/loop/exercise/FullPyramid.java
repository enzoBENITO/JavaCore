package javacore.chapter03.loop.exercise;

public class FullPyramid {
    public static void main(String[] args) {

        int numberOfRows = 5;

        for (int i = 0; i < numberOfRows; i++) {

            for (int j = 0; j < numberOfRows - i; j++) {
                System.out.print(" ");
            }

            for (int u = 0; u < i; u++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

}

