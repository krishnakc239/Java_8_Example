package dateAndTimeAPI;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateParseFormatExample {
    public static void main(String[] args) {
        //Format examples
        LocalDate date = LocalDate.now();
        //default format
        System.out.println("Default format of LocalDate="+date);
        //specific format
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        System.out.println("basic iso date== "+date.format(DateTimeFormatter.BASIC_ISO_DATE));


        LocalDateTime dateTime = LocalDateTime.now();
        //default format
        System.out.println("Default format of LocalDateTime="+dateTime);
        //specific format
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
        System.out.println("basic iso date format =="+ dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));

        Instant timestamp = Instant.now();
        //default format
        System.out.println("Default format of Instant="+timestamp);

        //Parse examples
        LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
        DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
        System.out.println("Default format after parsing = "+dt);

        // 2014-04-01 10:45
        LocalDateTime date_time = LocalDateTime.of(2018, Month.APRIL, 1, 10, 45);

        // format as basic ISO date format (20180220)
        String asBasicIsoDate = dateTime.format(DateTimeFormatter.BASIC_ISO_DATE);

        // format as ISO week date (2018-W08-4)
        String asIsoWeekDate = dateTime.format(DateTimeFormatter.ISO_WEEK_DATE);

        // format ISO date time (2018-02-20T20:04:05.867)
        String asIsoDateTime = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);

        // using a custom pattern (01/04/2018)
        String asCustomPattern = dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // french date formatting (1. avril 2014)
        String frenchDate = dateTime.format(DateTimeFormatter.ofPattern("d. MMMM yyyy", new Locale("fr")));

        // using short german date/time formatting (01.04.18 10:45)
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("de"));
        String germanDateTime = dateTime.format(formatter);

        // parsing date strings
        LocalDate fromIsoDate = LocalDate.parse("2014-01-20");
        LocalDate fromIsoWeekDate = LocalDate.parse("2014-W14-2", DateTimeFormatter.ISO_WEEK_DATE);
        LocalDate fromCustomPattern = LocalDate.parse("20.01.2014", DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        System.out.println("parsingFormatting: asBasicIsoDate: " + asBasicIsoDate);
        System.out.println("parsingFormatting: asIsoWeekDate: " + asIsoWeekDate);
        System.out.println("parsingFormatting: asIsoDateTime: " + asIsoDateTime);
        System.out.println("parsingFormatting: asCustomPattern: " + asCustomPattern);
        System.out.println("parsingFormatting: fromIsoDate: " + fromIsoDate);
        System.out.println("parsingFormatting: fromIsoWeekDate: " + fromIsoWeekDate);
        System.out.println("parsingFormatting: fromCustomPattern: " + fromCustomPattern);
        System.out.println("parsingFormatting: frenchDate: " + frenchDate);
        System.out.println("parsingFormatting: germanDateTime: " + germanDateTime);


    }
}
