package com.SirmaAcademy.SharedProjectsFinder;

import com.SirmaAcademy.SharedProjectsFinder.Data.Employee;
import com.SirmaAcademy.SharedProjectsFinder.Data.Pair;
import com.SirmaAcademy.SharedProjectsFinder.Data.WorkingTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class PairService {



    public static void fillPairs(ArrayList<WorkingTime> workingTimes) {
        for (int i = 0; i < workingTimes.size() - 1; i++) {
            WorkingTime firstWorkingTime = workingTimes.get(i);
            for (int j = i + 1; j < workingTimes.size(); j++) {
                WorkingTime secondWorkingTime = workingTimes.get(j);
                if (firstWorkingTime.getProject().getProjectID() == secondWorkingTime.getProject().getProjectID()
                        && isPair(firstWorkingTime.getStartDate(), firstWorkingTime.getEndDate(),
                            secondWorkingTime.getStartDate(), secondWorkingTime.getEndDate())) {
                        LocalDate startPairDate = getDate(firstWorkingTime.getStartDate(),
                                secondWorkingTime.getStartDate());
                        LocalDate endPairDate = getDate(firstWorkingTime.getEndDate(),
                                secondWorkingTime.getEndDate());
                    double pairId = Pair.createPairID(firstWorkingTime.getEmployee(),secondWorkingTime.getEmployee());
                    int workingTogetherTime = workingTogetherTime(startPairDate,endPairDate);
                    if (DataStorage.getPairs().isEmpty() || !DataStorage.getPairs().containsKey(pairId)){
                            HashMap<Double,Integer> workingTogetherTimes = new HashMap<>();
                            Pair pair = new Pair(pairId,firstWorkingTime.getEmployee(),
                                    secondWorkingTime.getEmployee(),
                                    workingTogetherTime,
                                    workingTogetherTimes);
                            pair.addWorkingTogetherTime(firstWorkingTime.getProject().getProjectID(),
                                    workingTogetherTime);
                            DataStorage.addPair(pair);
                    }
                    else
                        DataStorage.updatePair(pairId, firstWorkingTime.getProject().getProjectID(),
                                workingTogetherTime);
                }

            }
        }
    }


    private static int workingTogetherTime(LocalDate startPairDate, LocalDate endPairDate) {
    return 5;
    }
    private static LocalDate getDate(LocalDate date, LocalDate date1) {
        if (date.isBefore(date1)) {
            return date1;
        } else return date;
    }

    private static boolean isPair(LocalDate startDate, LocalDate endDate, LocalDate startDate1, LocalDate endDate1) {
        return startDate.isBefore(endDate1) && startDate1.isBefore(endDate);
    }
}
