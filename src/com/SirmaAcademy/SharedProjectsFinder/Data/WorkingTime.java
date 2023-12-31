package com.SirmaAcademy.SharedProjectsFinder.Data;

import java.time.LocalDate;

public class WorkingTimes {
    private Employee employee;
    private Project project;
    private LocalDate startDate;
    private LocalDate endDate;

    public WorkingTimes(Employee employee, Project project, LocalDate startDate, LocalDate endDate) {
        this.employee = employee;
        this.project = project;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
