package javacore.chapter03.loop.exercise;

public class WhileExo2 {
    public static void main(String[] args){

//        int counter = 1;
//
//        //Affichez les nombres de 1 à 10
//        while (counter <= 10){
//            System.out.println(counter);
//            counter++;
//        }
//
//        int counter2 = 10;
//        //Affichez les nombres de 1 à 10
//        while (counter2 >= 1){
//            System.out.println(counter2);
//            counter2--;
//        }

        //BONUS
        int counter3 = 1;
        int pairNumber =1;
        //pairOperation = counter3 % 2;
        //Afficher pair entre 1 et 20
        while (counter3 <= 11){
            while (pairNumber % 2== 0){
                System.out.println(pairNumber);
                pairNumber++;
            }
            counter3++;
            pairNumber++;
        }
        //Je mes suis dit c'est trop bizarre j'ai demandé a chat gpt comment il aurait fait et enfaite je
        //me suis rendu compte que je me suis compliqué la tâche mdr 1h dessus.
    }
}
