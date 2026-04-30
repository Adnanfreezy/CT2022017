package Q8;

import java.util.Scanner;

public class SprVol {
    static void main() {
        Scanner input = new Scanner(System.in);

        // Input the radius
        System.out.print("Enter the radius of the sphere: ");
        double r = input.nextDouble();

        //  as said
        double pi = 3.14;

        // Apply the fx
        double vlme = (4.0 / 3.0) * (pi * Math.pow(r, 3));

        // Output the result
        System.out.printf("\nThe volume of a sphere with radius %.2f is: %.2f\n", r, vlme);

        input.close();
    }
}
