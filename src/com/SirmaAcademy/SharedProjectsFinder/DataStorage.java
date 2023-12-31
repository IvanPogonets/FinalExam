package com.SirmaAcademy.SharedProjectsFinder;

import com.SirmaAcademy.SharedProjectsFinder.Data.Employee;
import com.SirmaAcademy.SharedProjectsFinder.Data.Pair;
import com.SirmaAcademy.SharedProjectsFinder.Data.WorkingTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class DataStorage {
    private static ArrayList<WorkingTime> workingTimes; //working times, need to be unique
    private static TreeSet<Employee> employees; // ID's of all employees
    private static HashMap<Double, Pair> pairs;

    public static ArrayList<WorkingTime> getWorkingTimes() {
        return workingTimes;
    }

    public static TreeSet<Employee> getEmployees() {
        return employees;
    }


    public static HashMap<Double, Pair> getPairs() {
        return pairs;
    }

    public static void addEmployeeIntoSet(Employee id) {
        employees.add(id);
    }

    public static void addPair(Pair pair) {
        pairs.put(pair.getPairID(), pair);
    }

    public static void updatePair(double pairId, double projectID, int workingTogetherTime) {
        Pair oldPair = pairs.get(pairId);
        oldPair.increaseWorkingTogetherTime(workingTogetherTime);
        if (oldPair.getWorkingTogetherProjects().containsKey(projectID)) {
            int oldTime = oldPair.getWorkingTogetherProjects().get(projectID);
            int newTime = oldTime + workingTogetherTime;
            oldPair.getWorkingTogetherProjects().put(projectID,newTime);
        }
        else
            oldPair.getWorkingTogetherProjects().put(projectID,workingTogetherTime);
    }

    public static void addWorkingTime(WorkingTime workingTime) {
        workingTimes.add(workingTime);
    }


}
