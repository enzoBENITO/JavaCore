package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {
    public static void main(String[] args) {

        int chessboardSize = 5;
        char symbol = '#';
        char symbol2 = '.';
        int counter = 0;

        for (int i = 0; i < chessboardSize; i++){
            while (counter <= 5) {
                System.out.print(symbol + " ");
                counter++;
                if (counter == 5) {
                    break;
                }
                System.out.print(symbol2 + " ");
                counter++;
            }
            counter = 0;
            System.out.println();
        }

    }
}

