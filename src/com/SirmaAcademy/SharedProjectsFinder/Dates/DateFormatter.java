package com.SirmaAcademy.SharedProjectsFinder.Dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

    public static int formatMonthFromChar(String data) {
        return switch (data) {
            case "январь", "янв", "january", "jan" -> 1;
            case "февраль", "фев", "february", "feb" -> 2;
            case "март", "мар", "march", "mar" -> 3;
            case "апрель", "апр", "april", "apr" -> 4;
            case "май", "may" -> 5;
            case "июнь", "июн", "june", "jun" -> 6;
            case "июль", "июл", "july", "jul" -> 7;
            case "август", "авг", "august", "aug" -> 8;
            case "сентябрь", "сен", "september", "sep" -> 9;
            case "октябрь", "окт", "october", "oct" -> 10;
            case "ноябрь", "ноя", "november", "nov" -> 11;
            case "декабрь", "дек", "december", "dec" -> 12;
            default -> -1;
        };
    }

    public LocalDate localDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(date, formatter);
    }

}


