package com.shanie.utils;

import com.shanie.models.Calculator;

/**
 * Created by shanie on 14/03/2017.
 */
public class Validator {

    public boolean isValid(Calculator calculator) {
        boolean result;
        if (calculator.getFirstNumber() == 0
                || calculator.getSecondNumber() == 0
                || calculator.getOperation() == ""
                || calculator.getOperation() == null) {
            result = false;
        } else {
            result = true;
        }

        return result;
    }
}
