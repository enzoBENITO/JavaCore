package javacore.chapter02.condition.exercise;

public class test {
    public static void main(String[] args){

        // je test : 11294,28797,82341,177106,177107
        double netAnnualSalary = 40000.0;
        double taxableAnnualSalary;
        double growthAnnualSalary = 0.0;
        double taxIncome = 0.0;
        double pourcentageTaxIncome;
        double taxableAnnualySalaryDeduction;
        double contributionSocialSalary;

        //J'estime qu'un cadre touche 40 000€ annuel brute.
        if (netAnnualSalary >= 40000){
            contributionSocialSalary = 0.75;
        }
        else {
            contributionSocialSalary = 0.77;
        }
        taxableAnnualSalary = netAnnualSalary * contributionSocialSalary;
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

        if (taxableAnnualSalary > 177106){
            taxIncome += (taxableAnnualSalary - 177106) * 0.45;
            taxIncome += (177106 - 82342) * 0.41;
            growthAnnualSalary = taxableAnnualSalary - taxIncome;
        }

        if (82342 <= taxableAnnualSalary && taxableAnnualSalary <= 177106) {
            taxIncome += (taxableAnnualSalary - 82342) * 0.41;
            growthAnnualSalary = taxableAnnualSalary - taxIncome;
        }

        if (taxableAnnualSalary > 82341) {
            taxIncome += (82341 - 28798) * 0.30;
            growthAnnualSalary = taxableAnnualSalary - taxIncome;
        }

        if (28798 <= taxableAnnualSalary && taxableAnnualSalary <= 82341) {
            taxIncome += (taxableAnnualSalary - 28798) * 0.30;
            growthAnnualSalary = taxableAnnualSalary - taxIncome;
        }

        if (taxableAnnualSalary > 28797) {
            taxIncome += (28797 - 11295) * 0.11;
            growthAnnualSalary = taxableAnnualSalary - taxIncome;
        }

        if (11295 <= taxableAnnualSalary && taxableAnnualSalary <= 28797){
            taxIncome += (taxableAnnualSalary - 11295) * 0.11;
            growthAnnualSalary = taxableAnnualSalary - taxIncome;
        }

        if (taxableAnnualSalary >= 11294){
            taxIncome +=  (11294 - 0) * 0.0;
            growthAnnualSalary = taxableAnnualSalary - taxIncome;
        }

        System.out.println("Votre salaire annuel net d'impôt est : " + growthAnnualSalary + "€");
        System.out.println("Le total d'impôts sur le revenue est de : " + taxIncome);

        pourcentageTaxIncome = (taxIncome *100) / taxableAnnualSalary;
        System.out.println("Au total le montant total d'impôts sur le revenu représente : " + pourcentageTaxIncome + " %.");
    }
}
