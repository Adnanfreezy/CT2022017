package Q1;

import java.util.Scanner;

public class MathExpressions {
    static void main() {
        Scanner input = new Scanner(System.in);

        // Options (I just added some user-friendly things)
        System.out.println("Select an operation to Compute:");
        System.out.println("1. Square root of (B^2 + 4AC)");
        System.out.println("2. Square root of (X + 4Y^3)");
        System.out.println("3. Cube root of (X * Y)");
        System.out.println("4. Area of a circle");
        System.out.print("\nEnter your Choice (1-4): ");

        int Choice = input.nextInt();
        double result;

        // Asking for specific values according to the Process selection
        switch (Choice) {
            case 1:
                System.out.print("Enter value for A: ");
                double A = input.nextDouble();
                System.out.print("Enter value for B: ");
                double B = input.nextDouble();
                System.out.print("Enter value for C: ");
                double C = input.nextDouble();

                // Computation for sqrt(B^2 + 4AC)
                result = Math.sqrt(Math.pow(B, 2) + (4 * A * C));
                System.out.println("\nResult of sqrt(" + B + "^2 + 4*" + A + "*" + C + ") = " + result);
                break;

            case 2:
                System.out.print("Enter value for X: ");
                double X = input.nextDouble();
                System.out.print("Enter value for Y: ");
                double Y = input.nextDouble();

                // Computation for sqrt(X + 4Y^3)
                result = Math.sqrt(X + (4 * Math.pow(Y, 3)));
                System.out.println("\nResult of sqrt(" + X + " + 4*" + Y + "^3) = " + result);
                break;

            case 3:
                System.out.print("Enter value for X: ");
                double X1 = input.nextDouble();
                System.out.print("Enter value for Y: ");
                double Y1 = input.nextDouble();

                // Computation for cbrt(X * Y)
                result = Math.cbrt(X1 * Y1);
                System.out.println("\nResult of cube root of (" + X1 + " * " + Y1 + ") = " + result);
                break;

            case 4:
                System.out.print("Enter the radius of the circle: ");
                double radius = input.nextDouble();

                // Computation for Area = PI * r^2
                result = Math.PI * Math.pow(radius, 2);
                System.out.println("\nArea of the circle with radius " + radius + " = " + result);
                break;

            default:
                System.out.println("Invalid selection! Please restart and choose 1-4.");
                break;
        }

        input.close();
    }
}
