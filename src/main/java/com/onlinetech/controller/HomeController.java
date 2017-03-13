package com.onlinetech.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onlinetech.model.ComputeModel;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response, ComputeModel calculateModel) throws IOException{
		ModelAndView model = null;
		model = new ModelAndView("home");
		model.addObject("calculateModel", calculateModel);
		return model;
	}
}
