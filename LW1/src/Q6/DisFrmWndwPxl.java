package Q6;

import javax.swing.JFrame;
import java.util.Scanner;

public class DisFrmWndwPxl {
    static void main() {
        Scanner ipt = new Scanner(System.in);

        System.out.print("Enter window width (W):- ");
        int w = ipt.nextInt();

        System.out.print("Enter window height (H):- ");
        int h = ipt.nextInt();

        ipt.nextLine();
        System.out.print("Enter the frame ttl: ");
        String ttl = ipt.nextLine();

        JFrame frame = new JFrame();
        frame.setTitle(ttl);
        frame.setSize(w, h);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        ipt.close();
    }
}
