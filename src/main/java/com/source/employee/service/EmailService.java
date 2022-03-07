package com.source.employee.service;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;




    @Service
public class EmailService {
@Autowired
JavaMailSender javaMailSender;

public String sendEmail() {
SimpleMailMessage message = new SimpleMailMessage();

	message.setFrom("cdineshchauhan636896@gmail.com");
    message.setTo("cdineshchauhan636896@gmail.com");
    message.setSubject("For Testing purpose");
    message.setText(" I send a link");

   javaMailSender.send(message);
    return "Mail sent successfully";
      }
public String sendEmailwithAttachment() {

	try {

	MimeMessage message = javaMailSender.createMimeMessage();
    MimeMessageHelper messageHelper = 
     new MimeMessageHelper(message, true);
   messageHelper.setFrom("cdineshchauhan636896@gmail.com");
   messageHelper.setTo("johny122436@gmail.com");
   messageHelper.setSubject("For testing purpose");
   messageHelper.setText("I attach a file");
File file = new File("/home/dinesh/Downloads/extrawork/dependency.odt");

   messageHelper.addAttachment(file.getName(), file);
   javaMailSender.send(message);
  return "Mail sent successfully";
}
	catch (Exception e) {
   return "Mail sent failed";
   }
 }
}

