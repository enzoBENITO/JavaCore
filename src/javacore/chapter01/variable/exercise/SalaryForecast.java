package javacore.chapter01.variable.exercise;

public class SalaryForecast {
    public static void main(String[] args){

        //Variable Declaration
        double grossHourlySalary = 25.0;
        double grossDailySalary;
        double grossWeeklySalary;
        double grossMonthlySalary;
        double grossAnnualSalary;
        double monthlyTaxableSalary;
        double annualyTaxableSalary;
        double monthlySalary;
        double annualySalary;


        //Calculation
        //On exclu le fait que l'employé prend des congées et on exclu les jours feriés et le 13 ème mois.
        grossDailySalary = grossHourlySalary * 7.7;
        grossWeeklySalary = grossHourlySalary * 38.5;
        grossMonthlySalary = grossWeeklySalary * 4;
        grossAnnualSalary = grossMonthlySalary * 12;
        monthlyTaxableSalary = grossMonthlySalary * 0.75;
        annualyTaxableSalary = grossAnnualSalary * 12;
        monthlySalary = monthlyTaxableSalary * 0.895;
        annualySalary = monthlyTaxableSalary * 12;





        //Display result
        System.out.println("Le salaire brut journalier est de : " + grossDailySalary + " €.");
        System.out.println("Le salaire brut hebdomadaire est de : " + grossWeeklySalary + " €.");
        System.out.println("Le salaire brut mensuel est de : " + grossMonthlySalary + " €.");
        System.out.println("Le salaire net imposable mensuel est de : " + monthlyTaxableSalary + " €.");
        System.out.println("Le salaire net imposable annuel est de : " + annualyTaxableSalary + " €.");
        System.out.println("Le salaire net mensuel, après impôt sur le revenu est de : " + monthlySalary + " €.");
        System.out.println("Le salaire net annuel après impôt sur le revenu est de : " + annualySalary + " €.");







    }
}
