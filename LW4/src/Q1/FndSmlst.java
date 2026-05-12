package Q1;

import java.util.Scanner;

public class FndSmlst {
    public static void main(String[] args) {

        Scanner nmbr = new Scanner(System.in);

        System.out.println("--- Finding Smallest Number between Three Numbers ---");
        System.out.print("Enter First Number: ");
        int a = nmbr.nextInt();
        System.out.print("Enter Second Number: ");
        int b = nmbr.nextInt();
        System.out.print("Enter Third Number: ");
        int c = nmbr.nextInt();

        int Smllst;

        if (a <= b && a <= c) {
            Smllst = a;
        } else if (b <= a && b <= c) {
            Smllst = b;
        } else {
            Smllst = c;
        }
        System.out.println("Smallest Number: " + Smllst);
    }
}
