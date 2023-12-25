package com.SirmaAcademy.SharedProjectsFinder.Validators;

import com.SirmaAcademy.SharedProjectsFinder.Validators.Validator;

public class IDValidator implements Validator {


    @Override
    public boolean validateData(String id) {
        return id.trim().matches("\\d{3,6}");
    }
}
