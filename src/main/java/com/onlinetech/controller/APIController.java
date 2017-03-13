package com.onlinetech.controller;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlinetech.model.ComputeModel;

@RestController
public class APIController {
	private static DecimalFormat df2 = new DecimalFormat(".##");

	@RequestMapping(value="/calculate", method = RequestMethod.POST, produces = "application/json")
	public ComputeModel test(HttpServletResponse response, HttpServletRequest request, @RequestBody ComputeModel computeModel) throws IOException{
		double firstinput = computeModel.getFirstinput();
		double secondinput = computeModel.getSecondinput();
		double result = 0.00;
		String type = computeModel.getType();
		ComputeModel cmpModel = new ComputeModel();
		cmpModel.setFirstinput(firstinput);
		cmpModel.setSecondinput(secondinput);
		if(type.equals("Addition") && firstinput!=0 && secondinput!=0){
			result = firstinput + secondinput;
			cmpModel.setResult(df2.format(result));
			cmpModel.setType("add");
			cmpModel.setStatus(true);
		}
		else if(type.equals("Subtraction") && firstinput!=0 && secondinput!=0){
			result = firstinput - secondinput;
			cmpModel.setResult(df2.format(result));
			cmpModel.setType("minus");
			cmpModel.setStatus(true);
		}
		
		else if(type.equals("Multiply") && firstinput!=0 && secondinput!=0){
			result = firstinput * secondinput;
			cmpModel.setResult(df2.format(result));
			cmpModel.setType("multiply");
			cmpModel.setStatus(true);
		}
		
		else if(type.equals("Divide") && firstinput!=0 && secondinput!=0){
		
			result = firstinput / secondinput;
			cmpModel.setResult(df2.format(result));
			cmpModel.setType("divide");
			cmpModel.setStatus(true);
			
		}
		else if(firstinput == 0 && secondinput == 0){
			cmpModel.setStatus(false);
			cmpModel.setMessage("Please enter a number.");
		}
		
		else if(secondinput == 0){
			cmpModel.setStatus(false);
			cmpModel.setMessage("Cannot divide by zero.");
		}
		
		
		return cmpModel;
	}
}
