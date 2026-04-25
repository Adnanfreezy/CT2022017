package Q3;

import java.util.Scanner;

public class NameTitleWithFormat {

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("This will set title according to 'John J. Rick'");

        System.out.print("First name:- ");
        String fir = input.next();

        System.out.print("Middle name:- ");
        String mid = input.next();

        System.out.print("Last name:- ");
        String lst = input.next();

        char midInit = mid.charAt(0);

        System.out.println(fir + " " + midInit + ". " + lst);

        input.close();
    }
}
