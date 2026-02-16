package javacore.chapter01.variable.exercise;

public class FahrenheitCelsiusConverter {
    public static void main(String[] args){

        double temperatureCelsius ;
        double temperatureFahrenheit = 132.45;

        temperatureCelsius = (temperatureFahrenheit - 32) / 1.8;
        System.out.println(temperatureFahrenheit + " °C vaut " + temperatureCelsius +" °F.");

    }
}
