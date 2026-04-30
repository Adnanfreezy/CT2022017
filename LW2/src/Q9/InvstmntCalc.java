package Q9;

import java.util.Scanner;

public class InvstmntCalc {
    static void main() {
        Scanner input = new Scanner(System.in);

        // Input Principal amount (P)
        System.out.print("Enter the initial investment amount: ");
        double P = input.nextDouble();

        // Input the Interest Rate (R)
        System.out.print("Enter the annual interest rate in percent: ");
        double R = input.nextDouble();

        // Input the Number of Years (N)
        System.out.print("Enter the number of years: ");
        int N = input.nextInt();

        double amount = P * Math.pow((1 + (R / 100.0)), N);

        // Output the results
        System.out.println("\n--- Investment Growth Report ---");
        System.out.printf("Principal: $%.2f\n", P);
        System.out.printf("Rate: %.2f%%\n", R);
        System.out.printf("Years: %d\n", N);
        System.out.printf("Total Investment Value: $%.2f\n", amount);

        // Calculate the actual pft earned
        double pft = amount - P;
        System.out.printf("Total Interest Earned: $%.2f\n", pft);

        input.close();
    }
}
