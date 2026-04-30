package Q7;

import java.util.Scanner;

public class BMICalc {
    static void main() {
        Scanner input = new Scanner(System.in);

        // Accept weight and height as int
        System.out.print("Enter weight in kilograms : ");
        int w = input.nextInt();

        System.out.print("Enter height in centimeters : ");
        int h = input.nextInt();

        // Calculate BMI using the fx
        double heightInMeters = h / 100.0;
        double bmi = w / (heightInMeters * heightInMeters);

        // Output the result
        System.out.printf("\nYour computed BMI is: %.2f\n", bmi);

        // Check the range (20 to 25)
        if (bmi >= 20 && bmi <= 25) {
            System.out.println("Status: Your BMI is in the Normal range.");
        } else if (bmi < 20) {
            System.out.println("Status: Your BMI is below the Normal range.");
        } else {
            System.out.println("Status: Your BMI is above the Normal range.");
        }

        input.close();
    }
}
