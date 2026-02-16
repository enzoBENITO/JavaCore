package javacore.chapter01.variable.exercise;

public class CelsiusFahrenheitConverter {
    public static void main(String[] args){

        double temperatureCelsius = 26.5;
        double temperatureFahrenheit;

        temperatureFahrenheit = (temperatureCelsius * 1.8) + 32;
        System.out.println(temperatureCelsius + " °C vaut " + temperatureFahrenheit +" °F.");

    }
}
