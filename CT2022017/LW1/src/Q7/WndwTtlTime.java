package Q7;

import javax.swing.JFrame;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class WndwTtlTime {
     static void main() {

        LocalTime now = LocalTime.now();

        DateTimeFormatter frmt = DateTimeFormatter.ofPattern("hh:mm:ss a", Locale.US);
        String frmtdTime = now.format(frmt);

        JFrame frame = new JFrame();
        frame.setTitle(frmtdTime);
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}