package Q11;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int TrgtNbr = (int)(Math.random()*100) + 1;

        int usrgss = 0;
        int attmpts = 0;

        System.out.println("---- Welcome to Guess ----");
        System.out.println("I'm Thinking of a number between 1 and 100.");

        while (usrgss != TrgtNbr) {
            System.out.print("Enter your guess: ");

            if (!input.hasNextInt()){
                System.out.println("That's not a number!. Try again!!");
                input.next();
                continue;
            }
            usrgss = input.nextInt();
            attmpts++;

            if (usrgss > TrgtNbr) {
                System.out.println("Higher!. Try again!!");
            } else if (usrgss < TrgtNbr) {
                System.out.println("Lower!. Try again!!");
            }  else {
                System.out.println("Correct!. You got it!!");
                System.out.println("It took " + attmpts + " attempts to guess!!");
            }
        }
        input.close();
    }
}
