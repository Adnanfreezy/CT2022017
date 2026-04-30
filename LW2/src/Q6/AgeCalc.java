package Q6;

import java.util.Scanner;
import java.time.Year;

public class AgeCalc {
    static void main() {
        Scanner input = new Scanner(System.in);

        // Getting current year
        int crntYear = Year.now().getValue();

        // Input the year of birth
        System.out.print("Enter the year you were born: ");
        int birthYear = input.nextInt();

        // 3. Calculation
        int age = crntYear - birthYear;

        // 4. Output in the format
        System.out.println("\nYou were born in " + birthYear + " and will be (are) " + age + " this year.");

        input.close();
    }
}
