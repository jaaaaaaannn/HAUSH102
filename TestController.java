package com.example.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController{

        @RequestMapping(value = "/", method = RequestMethod.POST)
        @ResponseBody
        public String index(HttpServletRequest request){
                String name = request.getParameter("name");
                String age = request.getParameter("age");
                return "Your name is "+name+ " and your age is "+age+".";
        }

        @RequestMapping(value = "/home", method = RequestMethod.GET)
        @ResponseBody
        public String getIndex(HttpServletRequest request){

                return "Hello World!";
        }

        @RequestMapping(value = "/student", method = RequestMethod.PUT)
        @ResponseBody
        public String studentPut(HttpServletRequest request, @RequestParam String studentnumber){
                return "Your student number is "+studentnumber+ ".";
        }

        @RequestMapping(value = "/compute", method = RequestMethod.POST)
        @ResponseBody
        public String compute(HttpServletRequest request){
                String firstnum = request.getParameter("firstnum");
                int fnum = Integer.parseInt(firstnum);
                String secondnum = request.getParameter("secondnum");
                int snum = Integer.parseInt(secondnum);
                String operation = request.getParameter("operation");
                int finalans = 0;
                if(operation.equals("add")){
                        finalans = fnum + snum;
                }
                else if(operation.equals("subtract")){
                        finalans = fnum - snum;
                }
                else if(operation.equals("divide")){
                        finalans = fnum / snum;
                }
                return "Answer is "+ Integer.toString(finalans);
        }

}