package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Sam on 06/03/2017.
 */

@Controller
public class TestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String displayHello() {
        return "Hello World";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public String displayDate(HttpServletRequest request) {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String nameAndAge = "Name is " + name + "; Age is " + age;

        return nameAndAge;
    }

    @RequestMapping(value = "/student", method = RequestMethod.PUT)
    @ResponseBody
    public String displayStudent(HttpServletRequest request) {
        String studentNumber = request.getParameter("studentNumber");

        return studentNumber;
    }

    @RequestMapping(value = "/compute", method = RequestMethod.POST)
    @ResponseBody
    public String compute(HttpServletRequest request) {
        double firstNumber = Double.parseDouble(request.getParameter("firstNumber"));
        double secondNumber = Double.parseDouble(request.getParameter("secondNumber"));
        String result = "";
        String operation = request.getParameter("operation").toLowerCase();

        switch (operation) {
            case "add":
                result = "The result is: " + (firstNumber + secondNumber);
                break;
            case "subtract":
                result = "The result is: " + (firstNumber - secondNumber);
                break;
            case "multiply":
                result = "The result is: " + (firstNumber * secondNumber);
                break;
            case "divide":
                if (firstNumber < secondNumber)
                    result = "Unable to divide. First number is less than the second number";
                else
                    result = "The result is: " + (firstNumber / secondNumber);
                break;
            default:
                break;
        }

        return result;
    }
}
