package com.shanie.controller;

import com.shanie.models.Calculator;
import com.shanie.models.Message;
import com.shanie.utils.Validator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by shanie on 13/03/2017.
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(value = "/api/calculate", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Object> performCalculation(@RequestBody Calculator calculator) {
        Validator validator = new Validator();
        Message message = new Message();
        if (validator.isValid(calculator)) {
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

            return new ResponseEntity<>(calculator, HttpStatus.OK);
        } else {
            message.setMessage("Invalid Inputs");
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        }
    }
}
