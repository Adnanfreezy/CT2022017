
package Q9;

import java.util.Scanner;

public class CharCount {
    static void main() {

        Scanner ipt = new Scanner(System.in);

        System.out.println("This will count(including spaces) and give you first and last letters");

        System.out.print("Enter a string: ");
        String text = ipt.nextLine();

        int lnth = text.length();

        char fst = text.charAt(0);

        char lst = text.charAt(lnth - 1);

        System.out.println(lnth);
        System.out.println(fst);
        System.out.println(lst);

        ipt.close();
    }
}