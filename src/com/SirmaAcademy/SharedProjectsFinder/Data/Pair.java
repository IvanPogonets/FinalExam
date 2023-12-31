package com.SirmaAcademy.SharedProjectsFinder.Data;

import java.util.HashMap;

public class Pair {
    private final double pairID;

    public Employee getFirstEmployee() {
        return firstEmployee;
    }

    public Employee getSecondEmployee() {
        return secondEmployee;
    }

    public int getWorkingTogetherTime() {
        return workingTogetherTime;
    }

    public void setWorkingTogetherTime(int workingTogetherTime) {
        this.workingTogetherTime = workingTogetherTime;
    }

    public HashMap<Double, Integer> getWorkingTogetherProjects() {
        return workingTogetherProjects;
    }

    public void setWorkingTogetherProjects(HashMap<Double, Integer> workingTogetherProjects) {
        this.workingTogetherProjects = workingTogetherProjects;
    }

    private final Employee firstEmployee;
    private final Employee secondEmployee;
    private int workingTogetherTime;
    private HashMap<Double, Integer> workingTogetherProjects; //Key - id of project, v - time which worked together

    public Pair(double pairID, Employee firstEmployee, Employee secondEmployee) {
        this.pairID = pairID;
        this.firstEmployee = firstEmployee;
        this.secondEmployee = secondEmployee;
    }

    public Pair(double pairID, Employee firstEmployee,
                Employee secondEmployee, int workingTogetherTime,
                HashMap<Double, Integer> workingTogetherProjects) {
        this.pairID = pairID;
        this.firstEmployee = firstEmployee;
        this.secondEmployee = secondEmployee;
        this.workingTogetherTime = workingTogetherTime;
        this.workingTogetherProjects = workingTogetherProjects;
    }

    public static double createPairID(Employee employee, Employee employee2) {
        return employee.getEmpID() + employee2.getEmpID() + 100000;
    }

    public double getPairID() {
        return pairID;
    }

    public void addWorkingTogetherTime(double projectID, int workingTogetherTime) {
        if (workingTogetherProjects.containsKey(projectID)) {
            int newWorkingTogetherTime = workingTogetherProjects.get(projectID) + workingTogetherTime;
            workingTogetherProjects.replace(projectID, newWorkingTogetherTime);
        } else
            workingTogetherProjects.put(projectID, workingTogetherTime);
    }

    public void increaseWorkingTogetherTime(int NewWorkingTogetherTime) {
        this.workingTogetherTime = workingTogetherTime + NewWorkingTogetherTime;
    }
}


