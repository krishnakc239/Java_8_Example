package dateAndTimeAPI;

import java.time.LocalDate;
import java.time.Year;

public class YearExample {
    public static void main(String[] args) {
        Year currentYear = Year.now();
        Year twoThousand = Year.of(2000);
        boolean isLeap = currentYear.isLeap(); // false
        int length = currentYear.length(); // 365

        // sixtyFourth day of 2014 (2018-03-05)
        LocalDate date = Year.of(2018).atDay(64);

        System.out.println("year: currentYear: " + currentYear);
        System.out.println("year: twoThousand: " + twoThousand);
        System.out.println("year: isLeap: " + isLeap);
        System.out.println("year: length: " + length);
        System.out.println("year: date: " + date);
    }
}
