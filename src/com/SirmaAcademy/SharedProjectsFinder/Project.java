package com.SirmaAcademy.SharedProjectsFinder;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Project {
    private long projectID;
    private TreeSet<Long> employees; //Set contains ID of all employees in this project
    private ArrayList<WorkingInterval> workingIntervals;
}
