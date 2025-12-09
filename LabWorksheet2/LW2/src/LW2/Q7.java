package LW2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q7 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");

        System.out.println(today.format(f));
    }
}
