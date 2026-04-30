package Q4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocDate {
    static void main() {
        LocalDate today = LocalDate.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy");

        String frmtdDate = today.format(format);
        System.out.println(frmtdDate);
    }
}
