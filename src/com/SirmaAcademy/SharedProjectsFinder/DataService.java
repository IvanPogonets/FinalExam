package com.SirmaAcademy.SharedProjectsFinder;

import com.SirmaAcademy.SharedProjectsFinder.ReadWrite.CSVReader;
import com.SirmaAcademy.SharedProjectsFinder.ReadWrite.Reader;

import java.util.Scanner;

public class DataService implements Service {
    @Override
    public void readFile() {
        Reader reader = new CSVReader();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write path and name of file");
        String path = scanner.nextLine();
        //TODO date patterns
//        System.out.println("Write date pattern like mm/dd/yyyy or another. " +
//                "If you don't have it - leave field empty");
//        String pattern = scanner.nextLine();
        reader.read(path);

    }

    @Override
    public void findPairs() {

    }


    @Override
    public void showGreatestPair() {

    }

    @Override
    public void addWorkingTime() {

    }
}
