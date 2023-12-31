package com.SirmaAcademy.SharedProjectsFinder.ReadWrite;

import com.SirmaAcademy.SharedProjectsFinder.Data.Employee;
import com.SirmaAcademy.SharedProjectsFinder.Data.Project;
import com.SirmaAcademy.SharedProjectsFinder.Data.WorkingTime;
import com.SirmaAcademy.SharedProjectsFinder.DataStorage;
import com.SirmaAcademy.SharedProjectsFinder.Dates.DateFormatter;
import com.SirmaAcademy.SharedProjectsFinder.Dates.DateParser;
import com.SirmaAcademy.SharedProjectsFinder.Validators.DateValidator;
import com.SirmaAcademy.SharedProjectsFinder.Validators.IDValidator;
import com.SirmaAcademy.SharedProjectsFinder.Validators.Validator;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

public class CSVReader implements Reader {


    public void read(String path) {
        try (
                Scanner scanner = new Scanner(new File(path))) {

            int count = 1;
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(",");
                if (line.length != 4) {
                    System.out.printf("Error in line %d. " +
                            "The line was not read", count);
                    continue;
                }
                double idOfEmployee;
                double idOfProject;
                LocalDate startDate = null;
                LocalDate endDate = null;
                Validator validator = new IDValidator();
                Validator dateValidator = new DateValidator();
                if (validator.validateData(line[0]) && validator.validateData(line[1])) {
                    idOfEmployee = Double.parseDouble(line[0]);
                    idOfProject = Double.parseDouble(line[1]);
                } else {
                    System.out.printf("Error in line %d. " +
                            "The line was not read", count);
                    break;
                }
                if (dateValidator.validateData(line[2])) {
                    String startDateSTR = DateParser.dateParser(line[2]);
                    if (startDateSTR.equals("wrong data")) {
                        System.out.printf("Error in line %d. Wrong date." +
                                "The line was not read", count);
                        break;
                    } else {
                        startDate = DateFormatter.localDate(startDateSTR);
                    }
                    if (line[3].trim().equalsIgnoreCase("NULL")) {
                        endDate = LocalDate.now();
                    } else if (dateValidator.validateData(line[3])) {
                        String endDateSTR = DateParser.dateParser(line[3]);
                        if (endDateSTR.equals("wrong data")) {
                            System.out.printf("Error in line %d. Wrong date." +
                                    "The line was not read", count);
                            break;
                        } else {
                            endDate = DateFormatter.localDate(endDateSTR);
                        }
                    }
                }
                Employee employee = new Employee(idOfEmployee);
                DataStorage.addEmployeeIntoSet(employee);
                Project project = new Project(idOfProject);
                DataStorage.addWorkingTime(new WorkingTime(employee, project, startDate, endDate));
                count += 1;
            }
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
