package com.coforge.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("home")
	public ModelAndView loadHomePage () {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHomePage");
		
		
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "employee", params = "Insert")
	public ModelAndView createEmployee(@ModelAttribute Employee employee) { //ModelAttribute - automation
		ModelAndView mv = new ModelAndView();                               
		mv.setViewName("EmployeeHomePage");
		
		String result = "";
		boolean status = service.createEmployee(employee);
		
		if(status) {
			result = "SUCCESS : Employee Object Sved";
		}
		else {
			result = "FAILED : Employee Object NOT Sved";

		}
		
		mv.addObject("result" , result);
		
		return mv;
	}

	@RequestMapping(method = RequestMethod.POST , value = "employee", params = "Update")
	public ModelAndView upadateEmployee(@ModelAttribute Employee employee) { //ModelAttribute - automation
		ModelAndView mv = new ModelAndView();                               
		mv.setViewName("EmployeeHomePage");
		
		String result = "";
		boolean status = service.createEmployee(employee);
		
		if(status) {
			result = "SUCCESS : Employee Object updated";
		}
		else {
			result = "FAILED : Employee Object NOT updated";

		}
		
		mv.addObject("result" , result);
		
		return mv;
	}
}
