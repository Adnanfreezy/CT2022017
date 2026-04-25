package Q10;

import java.util.Scanner;

public class OddMidPrntr {
    static void main() {

        Scanner ipt = new Scanner(System.in);

        System.out.println("This will print the middle character of an odd-word");

        System.out.print("Enter an odd-lnth wrd: ");
        String wrd = ipt.next();

        int lnth = wrd.length();

        int midIdx = lnth / 2;

        char midChr = wrd.charAt(midIdx);
        System.out.println(midChr);

        ipt.close();
    }
}
