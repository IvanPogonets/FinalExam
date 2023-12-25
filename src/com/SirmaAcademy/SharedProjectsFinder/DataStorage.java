package com.SirmaAcademy.SharedProjectsFinder;

import com.SirmaAcademy.SharedProjectsFinder.Data.Pair;
import com.SirmaAcademy.SharedProjectsFinder.Data.WorkingTimes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class DataStorage {
    private static ArrayList<WorkingTimes> workingTimes;
    private static TreeSet<Integer> employees; // ID's of all employees
    private static HashMap<Double, Pair> pairs;

    public static ArrayList<WorkingTimes> getWorkingTimes() {
        return workingTimes;
    }

    public static void setWorkingTimes(ArrayList<WorkingTimes> workingTimes) {
        DataStorage.workingTimes = workingTimes;
    }

    public static TreeSet<Integer> getEmployees() {
        return employees;
    }

    public static void setEmployees(TreeSet<Integer> employees) {
        DataStorage.employees = employees;
    }

    public static HashMap<Double, Pair> getPairs() {
        return pairs;
    }

    public static void setPairs(HashMap<Double, Pair> pairs) {
        DataStorage.pairs = pairs;
    }

    public DataStorage() {
        employees = new TreeSet<>();
        pairs = new HashMap<>();
        workingTimes = new ArrayList<>();
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
