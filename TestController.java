package com.example.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class TestController
{
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	@ResponseBody
	public String Hello(HttpServletRequest request)
	{
		return "Hello World";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseBody
	public String User(HttpServletRequest request)
	{
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		return "Your name is " + name + "and Your age is " + age + " years old.";
		
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.PUT)
	@ResponseBody
	public String Student(HttpServletRequest request)
	{
		String studNumber = request.getParameter("StudentNumber");
		return "Your student number is " + studNumber + ".";
		
	}
	
	@RequestMapping(value = "/compute", method = RequestMethod.POST)
	@ResponseBody
	public String Compute(HttpServletRequest request)
	{
		int firstNum = Integer.parseInt(request.getParameter("FirstNumber"));
		int secNum = Integer.parseInt(request.getParameter("SecondNumber"));
		String operator = request.getParameter("Operation");
		int result = 0;
		if (operator.equals("add"))
		{
			result = firstNum + secNum;
		}
		else if (operator.equals("minus"))
		{
			result = firstNum - secNum;
		}
		else if (operator.equals("multiply"))
		{
			result = firstNum * secNum;
		}
		return "The answer is " + result;
		
	}
}
