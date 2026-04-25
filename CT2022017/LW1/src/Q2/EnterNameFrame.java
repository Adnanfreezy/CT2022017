package Q2;

import javax.swing.JFrame;
import java.util.Scanner;

public class EnterNameFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This will set the name you give as title");

        System.out.print("first_name: ");
        String firstName = scanner.next();

        System.out.print("last_name: ");
        String lastName = scanner.next();

        String fullName = firstName + " " + lastName;


        JFrame frame = new JFrame();

        frame.setTitle(fullName);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        scanner.close();
    }
}
