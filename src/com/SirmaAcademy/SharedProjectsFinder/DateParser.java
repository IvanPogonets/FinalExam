package com.SirmaAcademy.SharedProjectsFinder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.SirmaAcademy.SharedProjectsFinder.DateFormatter.formatMonthFromChar;
import static com.SirmaAcademy.SharedProjectsFinder.DateValidator.*;

public class DateParser {
    public String dateParser(String data) {
        String date = data.trim().toLowerCase();
        String regex = "\\b(\\d{1,2}|\\d{4})" +
                "\\b[ ./-]" +
                "\\b(\\d{1,2}|[а-яА-Яa-zA-Z]{3,8})" +
                "\\b[ ./-]" +
                "(\\d{4}|\\d{1,2})"; /* takes the same data
         as in the DateValidator, but does not capture the characters
         after the third group */
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        String firstGroup = matcher.group(1);
        String secondGroup = matcher.group(2);
        String thirdGroup = matcher.group(3);
        int year = -1;
        int month = -1;
        int day = -1;
        if (secondGroup.length() == 2 && validateMonthDigit(secondGroup)) {
            month = Integer.parseInt(secondGroup);
        } else if (secondGroup.length() >= 3) {
            month = formatMonthFromChar(secondGroup);
        }
        if (firstGroup.length() == 4 && validateYear(firstGroup) && validateDay(thirdGroup)) {
            year = Integer.parseInt(firstGroup);
            day = Integer.parseInt(thirdGroup);
        } else if (thirdGroup.length() == 4 && validateYear(thirdGroup) && validateDay(firstGroup)) {
            day = Integer.parseInt(firstGroup);
            year = Integer.parseInt(thirdGroup);
        }
        return day + "." + month + "." + year;
    }
}
