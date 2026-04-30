package Q8;

import java.util.Scanner;

public class StrSpltr {
    static void main() {
        Scanner ipt = new Scanner(System.in);

        System.out.println("This will Split Sentence When '!' detected");

        System.out.println("Enter a sentence with a single '!':- ");
        String txt = ipt.nextLine();

        int exmrk = txt.indexOf("!");

        String bfr = txt.substring(0, exmrk);
        String aft = txt.substring(exmrk + 1);

        System.out.println(bfr.trim());
        System.out.println(aft.trim());

        ipt.close();
    }
}
