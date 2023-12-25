package com.SirmaAcademy.SharedProjectsFinder;

import com.SirmaAcademy.SharedProjectsFinder.Data.Pair;
import com.SirmaAcademy.SharedProjectsFinder.Data.WorkingTimes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class DataStorage {
    private static HashSet<WorkingTimes> workingTimes;
    private static TreeSet<Integer> employees; // ID's of all employees
    private static HashMap<Double, Pair> pairs;

    public static HashSet<WorkingTimes> getWorkingTimes() {
        return workingTimes;
    }

    public static TreeSet<Integer> getEmployees() {
        return employees;
    }


    public static HashMap<Double, Pair> getPairs() {
        return pairs;
    }

    public static void addEmployee(int id) {
        employees.add(id);
    }

    public static void addPair(Pair pair) {
        pairs.put(pair.getPairID(),pair);
    }

    public static void addWorkingTime(WorkingTimes workingTime) {
        workingTimes.add(workingTime);
    }


}
