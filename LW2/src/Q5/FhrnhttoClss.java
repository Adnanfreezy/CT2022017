package Q5;

import java.util.Scanner;

public class FhrnhttoClss {
    static void main() {
        Scanner input = new Scanner(System.in);

        // Input in Fahrenheit
        System.out.print("Enter temperature in degrees Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Apply the fx
        // decimal usage
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        // Print the result
        System.out.printf("%.2f°F is equivalent to %.2f°C\n", fahrenheit, celsius);

        input.close();
    }
}
