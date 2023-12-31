package com.SirmaAcademy.SharedProjectsFinder.Data;

import java.time.LocalDate;

public class WorkingTime {
    private Employee employee;
    private Project project;
    private LocalDate startDate;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    private LocalDate endDate;

    public WorkingTime(Employee employee, Project project, LocalDate startDate, LocalDate endDate) {
        this.employee = employee;
        this.project = project;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
