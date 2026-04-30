package Q4;

import java.util.Scanner;

public class CalriCalc {
    static void main() {
        Scanner input = new Scanner(System.in);

        // Input weight (let's do it in Pounds)
        System.out.print("Enter your weight in pounds (lbs): ");
        double bodyWeight = input.nextDouble();

        // Apply the fx
        // This is based on the requirement of 19 calories/pound
        double caloriesNeeded = bodyWeight * 19;

        // Print
        System.out.println("\n--- Daily Calorie Requirement ---");
        System.out.printf("For a weight of %.2f lbs, Approximately %.0f calories needed per day.\n",
                bodyWeight, caloriesNeeded);

        input.close();
    }
}
