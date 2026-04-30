package Q5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    static void main() {
        LocalDate today = LocalDate.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");

        String frmtdDate = today.format(format);
        System.out.println(frmtdDate);
    }
}