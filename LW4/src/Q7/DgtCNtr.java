package Q7;

import java.util.Scanner;

public class DgtCNtr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("--- Digit Counter (Enter a negative number to stop) ---");

        while (true) {
            System.out.print("Enter an integer: ");
            n = sc.nextInt();

            if (n < 0) {
                System.out.println("Negative number detected. Goodbye!");
                break;
            }

            int count = countDigits(n);
            System.out.println("The number " + n + " has " + count + " digits.");
        }
        sc.close();
    }

    public static int countDigits(int num) {
        if (num == 0) return 1;

        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}