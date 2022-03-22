package com.source.employee.service;

import java.io.File;
import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;




    @Service
public class EmailService {
@Autowired
JavaMailSender javaMailSender;
private static final	Logger LOGGER =LoggerFactory.getLogger(EmailService.class);

public String sendEmail() {
	

SimpleMailMessage message = new SimpleMailMessage();
     LOGGER.info("Mail sending to client successfully without attachement");
	message.setFrom("cdineshchauhan636896@gmail.com");
    message.setTo("cdineshchauhan636896@gmail.com");
    message.setSubject("For Testing purpose");
    message.setText(" I send a link");

   javaMailSender.send(message);
    return "Mail sent successfully";
      }
public String sendEmailwithAttachment() {

	try {
	     LOGGER.info("Mail sending to client successfully with attachement");

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
public void sendEmail(String recipientEmail, String link)
        throws MessagingException, UnsupportedEncodingException {
    MimeMessage message = javaMailSender.createMimeMessage();              
    MimeMessageHelper helper = new MimeMessageHelper(message);
     
    helper.setFrom("cdineshchauhan636896@gmail.com");
    helper.setTo("cdineshchauhan636896@gmail.com");
     
    String subject = "Here's the link to reset your password";
     
    String content = "<p>Hello,</p>"
            + "<p>You have requested to reset your password.</p>"
            + "<p>Click the link below to change your password:</p>"
            + "<p><a href=\"" + link + "\">Change my password</a></p>"
            + "<br>"
            + "<p>Ignore this email if you do remember your password, "
            + "or you have not made the request.</p>";
     
    helper.setSubject(subject);
     
    helper.setText(content, true);
     
    javaMailSender.send(message);
}
public void updateResetPasswordToken(String token, String email) {
	
	
}
}

