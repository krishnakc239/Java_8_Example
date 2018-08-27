package dateAndTimeAPI;

import java.time.*;

public class DateTimeInfo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, 2, 15); // 2018-02-15

        boolean isBefore = LocalDate.now().isBefore(date); // true

        // information about the month
        Month february = date.getMonth(); // FEBRUARY
        int februaryIntValue = february.getValue(); // 2
        int minLength = february.minLength(); // 28
        int maxLength = february.maxLength(); // 29
        Month firstMonthOfQuarter = february.firstMonthOfQuarter(); // JANUARY

        // information about the year
        int year = date.getYear(); // 2014
        int dayOfYear = date.getDayOfYear(); // 46
        int lengthOfYear = date.lengthOfYear(); // 365
        boolean isLeapYear = date.isLeapYear(); // false

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekIntValue = dayOfWeek.getValue(); // 6
        String dayOfWeekName = dayOfWeek.name(); // SATURDAY

        int dayOfMonth = date.getDayOfMonth(); // 15
        LocalDateTime startOfDay = date.atStartOfDay(); // 2018-02-15T00:00

        // time information
        LocalTime time = LocalTime.of(15, 30); // 15:30:00
        int hour = time.getHour(); // 15
        int second = time.getSecond(); // 0
        int minute = time.getMinute(); // 30
        int secondOfDay = time.toSecondOfDay(); // 55800

        System.out.println("dateTimeInformation: february: " + february);
        System.out.println("dateTimeInformation: februaryIntValue: " + februaryIntValue);
        System.out.println("dateTimeInformation: firstMonthOfQuarter: " + firstMonthOfQuarter);
        System.out.println("dateTimeInformation: minLength: " + minLength);
        System.out.println("dateTimeInformation: maxLength: " + maxLength);
        System.out.println("dateTimeInformation: year: " + year);
        System.out.println("dateTimeInformation: dayOfYear: " + dayOfYear);
        System.out.println("dateTimeInformation: lengthOfYear: " + lengthOfYear);
        System.out.println("dateTimeInformation: isLeapYear: " + isLeapYear);
        System.out.println("dateTimeInformation: dayOfWeekName: " + dayOfWeekName);
        System.out.println("dateTimeInformation: dayOfWeekIntValue: " + dayOfWeekIntValue);
        System.out.println("dateTimeInformation: dayOfMonth: " + dayOfMonth);
        System.out.println("dateTimeInformation: startOfDay: " + startOfDay);
        System.out.println("dateTimeInformation: hour: " + hour);
        System.out.println("dateTimeInformation: second: " + second);
        System.out.println("dateTimeInformation: minute: " + minute);
        System.out.println("dateTimeInformation: secondOfDay: " + secondOfDay);
        System.out.println("dateTimeInformation: isBefore: " + isBefore);
    }
}
