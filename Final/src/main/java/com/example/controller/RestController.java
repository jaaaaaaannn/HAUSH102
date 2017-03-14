package com.example.controller;

import com.example.model.Calculator;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Sam on 13/03/2017.
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(value = "/api/calculate", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Calculator performCalculation(@RequestBody Calculator calculator) {
        double firstNumber = calculator.getFirstNumber();
        double secondNumber = calculator.getSecondNumber();
        double resultNumber;
        String stringResult;
        String operation = calculator.getOperation().toLowerCase();

        switch (operation) {
            case "add":
                resultNumber = firstNumber + secondNumber;
                stringResult = firstNumber + " plus " + secondNumber + " is " + resultNumber;
                calculator.setResult(stringResult);
                break;
            case "subtract":
                resultNumber = firstNumber - secondNumber;
                stringResult = firstNumber + " minus " + secondNumber + " is " + resultNumber;
                calculator.setResult(stringResult);
                break;
            case "multiply":
                resultNumber = firstNumber * secondNumber;
                stringResult = firstNumber + " times " + secondNumber + " is " + resultNumber;
                calculator.setResult(stringResult);
                break;
            case "divide":
                resultNumber = firstNumber / secondNumber;
                stringResult = firstNumber + " divided by " + secondNumber + " is " + resultNumber;
                calculator.setResult(stringResult);
                break;
        }

        return calculator;
    }
}
