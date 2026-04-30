package Q3;

import java.util.Scanner;

public class ClsstoFhrnht {
    static void main() {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter temperature in degrees Celsius: ");
        double celsius = input.nextDouble();

        // Applying fx
        double fahrnht = (1.8 * celsius) + 32;

        // Print output
        System.out.println(celsius + "°C is equivalent to " + fahrnht + "°F");

        input.close();
    }
}
