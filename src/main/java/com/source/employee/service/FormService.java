package com.source.employee.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.employee.dao.FormDao;
import com.source.employee.entity.BCryptPasswordEncoder;
import com.source.employee.entity.Form;

@Service
@Transactional
public class FormService 
{

	 
}	  /*  @Autowired
	    private FormDao formDao;
	     
	 
	    public void updateResetPasswordToken(String token, String email) throws ClassNotFoundException {
	        Form form = formDao.findByEmail(email);
	        if (form != null) {
	            form.setResetPasswordToken(token);
	            formDao.save(form);
	        } else {
	            throw new ClassNotFoundException("Could not find any customer with the email " + email);
	        }
	    }
	     
	    public Form getByResetPasswordToken(String token) {
	        return formDao.findByResetPasswordToken(token);
	    }
	     
	    public void updatePassword(Form form, String newPassword) {
	        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	        String encodedPassword = passwordEncoder.encode(newPassword);
	        form.setPassword(encodedPassword);
	         
	        form.setResetPasswordToken(null);
	        formDao.save(form);
	    }
	}
*/
