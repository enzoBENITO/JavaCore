package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {
    public static void main(String[] args){

        // je test : 11294,28797,82341,177106,177107
        double netAnnualSalary = 240000.0;
        double taxableAnnualSalary;
        double netSalary = 0.0;
        double taxIncome = 0.0;
        double pourcentageTaxIncome;
        double taxableAnnualySalaryDeduction;

        //J'estime qu'un cadre touche 40 000€ annuel brute.
        if (netAnnualSalary >= 40000){
            taxableAnnualSalary = netAnnualSalary * 0.75;
        }
        else {
            taxableAnnualSalary = netAnnualSalary * 0.77;
        }
        System.out.println("Après cotisation votre salaire est de : " + taxableAnnualSalary + "€");

        /*Bonus N1
        taxableAnnualySalaryDeduction = taxableAnnualSalary * 0.9;
        //Pour appliquer l'abbatement il faut remplacer taxableAnnualSalary par taxableAnnualySalaryDeduction dans le programme.
        System.out.println(taxableAnnualySalaryDeduction);
        */

        /*Bonus N2
        if (taxableAnnualSalary >= 100000){
            taxableAnnualySalaryDeduction = taxableAnnualSalary - 10000;
        }
        */

        //Intervalle des impôts sur le revenu
        double interval1 = (11294 - 0) * 0.0;
        double interval2 = (28797 - 11295) * 0.11;
        double interval3 = (82341 - 28798) * 0.30;
        double interval4 = (177106 - 82342) * 0.41;
        double interval5 = (taxableAnnualSalary - 177106) * 0.45;


        if (taxableAnnualSalary >= 11294){
            taxIncome +=  interval1;
            netSalary = taxableAnnualSalary - taxIncome;
        }

        if (taxableAnnualSalary <= 28797 && taxableAnnualSalary >= 11295){
            taxIncome += (taxableAnnualSalary - 11295) * 0.11;
            netSalary = taxableAnnualSalary - taxIncome;
        }

        if (taxableAnnualSalary > 28797) {
            taxIncome += interval2;
            netSalary = taxableAnnualSalary - taxIncome;
        }

        if (taxableAnnualSalary <= 82341 && taxableAnnualSalary >= 28798) {
            taxIncome += (taxableAnnualSalary - 28798) * 0.30;
            netSalary = taxableAnnualSalary - taxIncome;
        }

        if (taxableAnnualSalary > 82341) {
            taxIncome += interval3;
            netSalary = taxableAnnualSalary - taxIncome;
        }

        if (taxableAnnualSalary <= 177106 && taxableAnnualSalary >= 82342) {
            taxIncome += (taxableAnnualSalary - 82342) * 0.41;
            netSalary = taxableAnnualSalary - taxIncome;
        }

        if (taxableAnnualSalary >= 177106){
            taxIncome += interval4;
            netSalary = taxableAnnualSalary - taxIncome;
        }

        if (taxableAnnualSalary > 177106){
            taxIncome += interval5;
            netSalary = taxableAnnualSalary - taxIncome;
        }
        System.out.println("Votre salaire annuel net d'impôt est : " + netSalary + "€");
        System.out.println("Le total d'impôts sur le revenue est de : " + taxIncome);

        pourcentageTaxIncome = (taxIncome *100) / taxableAnnualSalary;
        System.out.println("Au total le montant total d'impôts sur le revenu représente : " + pourcentageTaxIncome + " %.");
    }
}
