package Q5;

import java.io.IOException;
import java.util.Scanner;

public class Burgers {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("-+- Welcome Lo-Fat Burgers -+-");
        System.out.println("\nENTREES:");
        System.out.println("1. Tofu Burger ($3.49)    2. Cajun Chicken ($4.59)");
        System.out.println("3. Buffalo Wings ($3.99)  4. Rainbow Fillet ($2.99)");

        System.out.println("\nSIDE DISHES:");
        System.out.println("1. Rice Cracker ($0.79)   2. No-Salt Fries ($0.69)");
        System.out.println("3. Zucchini ($1.09)       4. Brown Rice ($0.59)");

        System.out.println("\nDRINKS:");
        System.out.println("1. Cafe Mocha ($1.99)     2. Cafe Latte ($1.90)");
        System.out.println("3. Espresso ($2.49)       4. Oolong Tea ($0.99)");

        System.out.println("\n----------------------------------------");

        double totalBill = 0;

        System.out.print("Select Entree (1-4): ");
        int entreeChoice = input.nextInt();
        switch (entreeChoice) {
            case 1:
                totalBill += 3.49;
                break;
            case 2:
                totalBill += 4.59;
                break;
            case 3:
                totalBill += 3.99;
                break;
            case 4:
                totalBill += 2.99;
                break;
            default:
                System.out.println("Invalid entree choice.");
        }

        System.out.print("Select Side Dish (1-4): ");
        int sideChoice = input.nextInt();
        switch (sideChoice) {
            case 1:
                totalBill += 0.79;
                break;
            case 2:
                totalBill += 0.69;
                break;
            case 3:
                totalBill += 1.09;
                break;
            case 4:
                totalBill += 0.59;
                break;
            default:
                System.out.println("Invalid side choice.");
        }

        System.out.print("Select Drink (1-4): ");
        int drinkChoice = input.nextInt();
        switch (drinkChoice) {
            case 1:
                totalBill += 1.99;
                break;
            case 2:
                totalBill += 1.90;
                break;
            case 3:
                totalBill += 2.49;
                break;
            case 4:
                totalBill += 0.99;
                break;
            default:
                System.out.println("Invalid drink choice.");
        }

        System.out.println("----------------------------------------");

        System.out.printf("Your total bill is: $%.2f\n", totalBill);
        input.close();
    }
}
