package Q3;

import java.util.Scanner;

public class PwrofTen {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);

        System.out.print("Enter the power of 10 (e.g., 6, 9, 12): ");
        int power = ipt.nextInt();

        String name;

        switch (power) {
            case 6:
                name = "Million";
                break;
            case 9:
                name = "Billion";
                break;
            case 12:
                name = "Trillion";
                break;
            case 15:
                name = "Quadrillion";
                break;
            case 18:
                name = "Quintillion";
                break;
            case 21:
                name = "Sextillion";
                break;
            case 24:
                name = "Septillion";
                break;
            case 27:
                name = "Eighth";
                break;
            case 30:
                name = "Nonillion";
                break;
            case 100:
                name = "Googol";
                break;
            default:
                name = "Unknown";
                break;
        }
        System.out.print("A 10^" + power + " is called " + name);
        ipt.close();
    }
}
