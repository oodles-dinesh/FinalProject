package com.source.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.source.employee.entity.Employee;

@Controller
public class FormController {

	 @GetMapping("/register")
	 public String form(Model model)
	 {
		 Employee employee = new Employee();
		 model.addAttribute("employee", employee);
		 return "hello";
	 }
}
