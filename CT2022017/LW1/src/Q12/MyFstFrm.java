package Q12;

import javax.swing.JFrame;

public class MyFstFrm {
    static void main() {
        JFrame frame = new JFrame();

        frame.setTitle("My First Frame");
        frame.setSize(300, 200);

        frame.setLocation(100, 50);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
