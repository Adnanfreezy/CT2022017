package Q2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner clr = new Scanner(System.in);
        System.out.println("0.Magenta");
        System.out.println("1.Cyan");
        System.out.println("2.Yellow");
        System.out.println("3.Blue");
        System.out.println("4.Green");
        System.out.print("Select one color from the above list:");
        int a = clr.nextInt();

        switch (a) {
            case 0:
                System.out.println("You selected Magenta");
                break;
            case 1:
                System.out.println("You selected Cyan");
                break;
            case 2:
                System.out.println("You selected Yellow");
                break;
            case 3:
                System.out.println("You selected Blue");
                break;
            case 4:
                System.out.println("You selected Green");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
