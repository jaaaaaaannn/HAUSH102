package com.example.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Joshua Rom on 3/6/2017.
 */
@Controller
public class TestController {
    @RequestMapping(value="/", method= RequestMethod.POST)
    @ResponseBody
    public String joshua(HttpServletRequest request){
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String output = "Name is "+name+" and age is "+age;
        return output;
    }

    @RequestMapping(value="/student", method= RequestMethod.PUT)
    @ResponseBody
    public String joshuaRom(HttpServletRequest studNum){
        String sn = studNum.getParameter("studNum");
        return sn;
    }

    @RequestMapping(value="/home", method= RequestMethod.GET)
    @ResponseBody
    public String joshuaRom1(){
        return "Hello World";
    }

    @RequestMapping(value="/compute", method= RequestMethod.POST)
    @ResponseBody
    public String compute(HttpServletRequest request){
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operation = request.getParameter("operation").toLowerCase();
        String result = "";
        double holder = 0;
        switch (operation) {
            case "add":
                holder = num1 + num2;
                result = Double.toString(holder);
                break;
            case "subtract":
                holder = num1 - num2;
                result = Double.toString(holder);
                break;
            case "divide":
                holder = num1 / num2;
                result = Double.toString(holder);
                break;
            default:
                result = "No operation done.";
                break;
        }
        return result;
    }
}
