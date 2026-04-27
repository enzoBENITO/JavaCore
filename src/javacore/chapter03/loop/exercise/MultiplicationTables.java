package javacore.chapter03.loop.exercise;

public class MultiplicationTables {
    public static void main (String[] args){
        int result;

//        for (int table = 1; table < 10; table++){
//            System.out.println();
//            System.out.println("Table de : " + table);
//            for (int nombre = 1; nombre < 10; nombre++){
//                result = nombre * table;
//                System.out.println(nombre + " x " + table + " = "  + result);
//            }
//        }

        //Amelioration de la mise en forme :
        for (int table = 1; table < 10; table++){
            System.out.println();
            System.out.print("Table de : " + table + " : ");
            for (int nombre = 1; nombre < 10; nombre++){
                result = nombre * table;
                System.out.print(" " + result);
            }
        }
    }
}
