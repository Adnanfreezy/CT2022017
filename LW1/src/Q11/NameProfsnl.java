package Q11;

import java.util.Scanner;

public class NameProfsnl {
    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter full name (First Middle Last): ");
        String fst = input.next();
        String mid = input.next();
        String lst = input.next();

        char midInit = mid.charAt(0);

        System.out.println(lst + ", " + fst + " " + midInit + ".");

        input.close();
    }
}
