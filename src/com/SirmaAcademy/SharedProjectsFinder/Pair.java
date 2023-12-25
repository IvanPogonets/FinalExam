package com.SirmaAcademy.SharedProjectsFinder;

import java.util.ArrayList;
import java.util.HashMap;

public class Pair {
    private String pairID;
    private Employee firstEmployee;
    private Employee secondEmployee;
    private int workingTogetherTime;
    private HashMap<Integer, Integer> workingTogetherProjects; //Key - id of project, v - time which worked together
}
