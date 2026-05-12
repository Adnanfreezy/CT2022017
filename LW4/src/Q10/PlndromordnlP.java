package Q10;

import java.util.Scanner;

public class PlndromordnlP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String ORG =  sc.nextLine();

        String CHNGD = ORG.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;
        int left = 0;
        int right = CHNGD.length() - 1;

        while (left <= right) {
            if (CHNGD.charAt(left) != CHNGD.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println(ORG + " is a palindrome.");
        }  else {
            System.out.println(ORG + " is not a palindrome.");
        }
        sc.close();
    }
}
