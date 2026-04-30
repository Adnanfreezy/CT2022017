package Q2;

import java.util.Scanner;

public class CnvrtCMtoFtInch {
    static void main() {
        Scanner input = new Scanner(System.in);

        // Get input in centimeters
        System.out.print("Enter distance in centimeters: ");
        double cm = input.nextDouble();

        // Convert total centimeters to total inches
        double ttlInches = cm / 2.54;

        // Calculate ft using integer division
        int ft = (int) (ttlInches / 12);

        // Calculate remaining inches using the modulo (remainder) operator
        double remainInches = ttlInches % 12;

        // Print the result
        System.out.printf("%.2f cm is approximately %d ft and %.2f inches.\n",
                cm, ft, remainInches);

        input.close();
    }
}
