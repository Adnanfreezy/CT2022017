package Q8;

import java.util.Scanner;

public class MltplTbl {
    public static void main(String[] args) {
        Scanner it = new Scanner(System.in);

        System.out.println("Enter the number N for the multiplication table: ");
        int n = it.nextInt();

        System.out.println("\nMultiplication Table for " + n + ":");
        System.out.println("----------------------------");

        for (int i = 1; i <= 10; i++) {
            int rslt = n * i;

            System.out.println("\nMultiplication for " + n + " : " + rslt);
        }
    }
}
