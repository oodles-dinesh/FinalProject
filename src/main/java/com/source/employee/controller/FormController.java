package com.source.employee.controller;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.source.employee.entity.Employee;
import com.source.employee.entity.Form;
import com.source.employee.service.EmailService;
import com.source.employee.service.FormService;

import net.bytebuddy.utility.RandomString;


@Controller
public class FormController {
	@Autowired EmailService emailService;
	@Autowired FormService formService;

	 @GetMapping("/register")
	 public String form(Model model)
	 {
		 Employee employee = new Employee();
		 model.addAttribute("employee", employee);
		 return "hello";
	 }
	 @GetMapping("/forgot_password")
	 public String showForgotPasswordForm(Model model) {
	 	 Form form = new Form();
	 	 model.addAttribute("form", form);
	 	 
	     return "forgot";
	 }
	 @PostMapping("/forgot_password")
	 public String processForgotPassword(HttpServletRequest request, Model model) {
	     String email = request.getParameter("email");
	     String token = RandomString.make(30);
	      
	 try {
	         emailService.updateResetPasswordToken(token, email);
	        String resetPasswordLink = com.source.employee.entity.Utility.getSiteURL(request) + "/reset_password?token=" + token;
	        emailService.sendEmail(email, resetPasswordLink);
	         model.addAttribute("message", "We have sent a reset password link to your email. Please check.");
	          
	    
	     } catch (UnsupportedEncodingException | MessagingException e) {
	         model.addAttribute("error", "Error while sending email");
	     }
	          
	     return "forgot";
	 }
}
