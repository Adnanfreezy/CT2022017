package Q12;

import java.util.Scanner;

public class WordRplcr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String Sntnc = input.nextLine();

        System.out.print("Enter a word to replace: ");
        String Trgt = input.next();

        System.out.print("Enter a word to replace with: ");
        String Rplcmnt = input.next();

        String mdfdSntnc = Sntnc.replace(Trgt, Rplcmnt);

        System.out.println("\n--- Modified Sentence ---");
        System.out.println(mdfdSntnc);

        input.close();
    }
}
