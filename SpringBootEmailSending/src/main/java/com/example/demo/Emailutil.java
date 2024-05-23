package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileUrlResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class Emailutil {
	@Autowired
	private JavaMailSender sender;
	public boolean send(
			String to,
			String cc[],
			String bcc[],
			String subject,
			String text,
			FileUrlResource file
			)  
	
	{
		boolean flag=false;
		try {
			MimeMessage message=sender.createMimeMessage();
			
			MimeMessageHelper helper=new MimeMessageHelper(message,file!=null?true:false);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(text);
			
			 if(cc!=null && cc.length>0) {
				 helper.setCc(cc);
			 }
			
			 if(cc!=null && bcc.length>0) {
				 helper.setBcc(bcc);
			 }
			
			if(file!=null) {
				helper.addAttachment(file.getFilename(), file);
			}
			
			sender.send(message);
			flag=true;
		}
		catch (Exception e) {
			flag=false;
			e.printStackTrace();
			
		}
		return flag;
		
		
}
}