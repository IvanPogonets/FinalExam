package com.SirmaAcademy.SharedProjectsFinder;

import java.util.Scanner;


public class SharedProjectsFinderAPP {
    public static void main(String[] args) {
WorkingTimes workingInterval = new WorkingTimes();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write path and name of file");
    String path = scanner.nextLine();
    Reader reader = new CSVReader();
    reader.read(path);
    }
}
