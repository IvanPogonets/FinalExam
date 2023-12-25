package com.SirmaAcademy.SharedProjectsFinder;

public class IDValidator implements Validator {


    @Override
    public boolean validateData(String id) {
        return id.trim().matches("\\d{3,6}");
    }
}
