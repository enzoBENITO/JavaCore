package javacore.chapter03.loop.exercise;

public class BasicStopwatch {
    public static void main(String[] args) throws InterruptedException {

        int i = 0;
        int minute = 0;
        int heure = 0;
        int seconde = 0;

        /*
         * Une boucle while qui itèrera 100x grâce à l'incrémentation de la variable i (à la fin de la boucle)
         */
        while(i < 6000) {

            /*
             * Effectue une "pause" de 1000 millisecondes / 1 seconde
             */
            Thread.sleep(10);
            seconde++;
            if (seconde == 60){
                seconde = 0;
                minute++;
            }
            if (minute == 60){
                minute = 0;
                heure++;
            }
            System.out.println(heure + " : " + minute + " : " + seconde);
            /*
             * Incrémente "i = i + 1;" pour atteindre la condition de la boucle while
             */
            i++;
        }

    }
}
