package javacore.chapter02.condition.exercise;

public class SmartHomeSecurity {
    public static void main(String[] args){

        boolean isHouseEmpty = true;
        boolean isOwnerAsleep = true;
        boolean areAllDoorsAndWindowsClosed = false;
        boolean isAlarmActivated = false;
        boolean isSafeModeActivated; // quand il est a true la maison est safe


        if (isHouseEmpty || isOwnerAsleep || !isAlarmActivated || areAllDoorsAndWindowsClosed){
            isSafeModeActivated = true;
            System.out.println(isSafeModeActivated);
            System.out.println("Le mode sécurisé est activé.");
        }
        else {
            isSafeModeActivated = false;
            System.out.println(isSafeModeActivated);
            System.out.println("Le mode sécurisé n'est pas activé.");
        }


    }
}
