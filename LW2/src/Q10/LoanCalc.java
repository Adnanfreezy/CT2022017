package Q10;

import java.util.Scanner;

public class LoanCalc {
    static void main() {
        Scanner input = new Scanner(System.in);

        // Constant for months in a year
        final int MNTprYR = 12;

        // 1. Input Loan Details
        System.out.print("Enter loan amount : ");
        double loanAmnt = input.nextDouble();

        System.out.print("Enter annual interest rate in percent : ");
        double annualIntRate = input.nextDouble();

        System.out.print("Enter loan period in years : ");
        int loanPeriod = input.nextInt();

        // Calculate Interest Rate/Month
        // Formula: annualIntRate / 100.0 / 12
        double monthlyIntRate = annualIntRate / 100.0 / MNTprYR;

        // Calculate No. of Payments
        int noOfPay = loanPeriod * MNTprYR;

        // Calculate Monthly Payment
        double monthlyPay = (loanAmnt * monthlyIntRate) /
                (1 - Math.pow(1 / (1 + monthlyIntRate), noOfPay));

        // Calculate Total Payment
        double totalPay = monthlyPay * noOfPay;

        // Output Results
        System.out.println("\n--- Loan Summary ---");
        System.out.printf("Loan Amount:        $%.2f\n", loanAmnt);
        System.out.printf("Annual Interest:    %.2f%%\n", annualIntRate);
        System.out.printf("Loan Period:        %d years\n", loanPeriod);
        System.out.println("-------------------------------");
        System.out.printf("Monthly Payment:    $%.2f\n", monthlyPay);
        System.out.printf("Total Payment:      $%.2f\n", totalPay);
        System.out.printf("Total Interest:     $%.2f\n", (totalPay - loanAmnt));

        input.close();
    }
}
