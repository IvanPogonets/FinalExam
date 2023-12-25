package com.SirmaAcademy.SharedProjectsFinder.Data;

import java.util.HashMap;

public class Pair {
    private double pairID;
    private Employee firstEmployee;
    private Employee secondEmployee;
    private int workingTogetherTime;
    private HashMap<Integer, Integer> workingTogetherProjects; //Key - id of project, v - time which worked together

    public static double createPairID (double firstId, double secondId){
        return firstId+secondId+100000;
    }

    public double getPairID() {
        return pairID;
    }
}


