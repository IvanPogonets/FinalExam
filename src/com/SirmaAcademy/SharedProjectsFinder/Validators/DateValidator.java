package com.SirmaAcademy.SharedProjectsFinder.Validators;

import com.SirmaAcademy.SharedProjectsFinder.Validators.Validator;

import java.util.Calendar;

public class DateValidator implements Validator {
    @Override
    public boolean validateData(String data) {
        String date = data.trim().toLowerCase();
        return date.trim().matches("\\b(?:\\d{1,2}|\\d{4})\\b[ ./-]\\b(?:\\d{1,2}|[а-яa-z]{3,8})\\b[ ./-](?:\\d{1,2}\\D?|\\d{4}\\D?)\\b.*");
/*
First group: 1-2 digits (day/month) or 4 digits (year).
Then a character, which can be a period, a space, a slash, or a hyphen.
Second group: 1-2 numbers or from 3 to 8 letters of the Cyrillic or English alphabet (day or month).
Then again a character, which can be a period, a space, a slash or a hyphen.
Third group: 1-2 digits with a possible non-numeric symbol or 4 digits with a possible non-numeric symbol (day/year). Non-numeric character to account for the word "r." or similar ones without a space.
Then any characters until the end of the line.
*/
    }

    public static boolean validateYear(String data) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int year = Integer.parseInt(data.trim());
        return 1995 <= year && year <= currentYear;
    }

    public static boolean validateDay(String data) {
        int day = Integer.parseInt(data.trim());
        return 1 <= day && day <= 31;
    }


    public static boolean validateMonthDigit(String data) {
        int month = Integer.parseInt(data.trim());
        return 1 <= month && month <= 12;
    }

    public static boolean validateDate(int day, int month, int year) {
        switch (month) {
            case 2:
                if (year % 4 == 0 && 1 <= day && day <= 29) {
                    return true;
                } else if (year % 4 != 0 && 1 <= day && day <= 28) {
                    return true;
                }
                break;
            case 4, 6, 9, 11:
                return (1 <= day && day <= 30);
            case 1, 3, 5, 7, 8, 10, 12:
                return (1 <= day && day <= 31);
        }
        return false;
    }
}

