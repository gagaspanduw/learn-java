package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double planFee = getPlanFee();
        int overageMinutes = getOverageMinutes();
        double totalTax = calculateTax(planFee);
        double totalOverageMinutes = calculateOverageMinutes(overageMinutes);
        double totalFee = calculateTotalFee(planFee, totalTax, totalOverageMinutes);
        scanner.close();

        //Calulate tax
        calculateTax(planFee);

        //Calculate overage minutes
        calculateOverageMinutes(overageMinutes);

        //Total
        calculateTotalFee(planFee, totalTax, totalOverageMinutes);

        //Notify all bill
        notifyAllBill(planFee, totalOverageMinutes, totalTax, totalFee);
    }

    public static double getPlanFee(){
        System.out.println("Enter the plan fee:");
        double planFee = scanner.nextDouble();
        return planFee;
    }

    public static int getOverageMinutes(){
        System.out.println("Enter the overage minutes");
        int overageMinutes = scanner.nextInt();
        return overageMinutes;
    }

    public static double calculateTax(double planFee){
        double totalTax = planFee * 0.15;
        return totalTax;
    }

    public static double calculateOverageMinutes(int overageMinutes){
        double totalOverageMinutes = overageMinutes * 0.25;
        return totalOverageMinutes;
    }

    public static double calculateTotalFee(double planFee, double totalTax, double totalOverageMinutes){
        double totalFee = planFee + totalTax + totalOverageMinutes;
        return totalFee;
    }

    public static void notifyAllBill(double planFee, double totalOverageMinutes, double totalTax, double totalFee){
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + planFee);
        System.out.println("Overage : $" + totalOverageMinutes);
        System.out.println("Tax : $" + totalTax);
        System.out.println("Total: $" + totalFee);
    }
}
