package javacore.chapter01.variable.exercise;

public class FirstInstructions {
    public static void main(String[] args){

        int age = 25;
        System.out.println(age);
        System.out.println("J'ai " + age + " ans.");

        String displayAge = "J'ai "+ age + " ans.";
        System.out.println(displayAge);

        String firstName = "Enzo";
        System.out.println(firstName);

        String displayFirstName = "Je m'appelle " + firstName +".";
        System.out.println(displayFirstName + " " + displayAge);

        //Bonus
        System.out.println("Je m'appelle " + firstName + ". " + "J'ai " + age + " ans.");






    }
}
