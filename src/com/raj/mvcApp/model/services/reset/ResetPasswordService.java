package com.raj.mvcApp.model.services.reset;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.mvcApp.model.dao.reset.ResetPasswordDAO;

@Service
public class ResetPasswordService {
	
	public ResetPasswordService()
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	@Autowired
	private ResetPasswordDAO resetDao;
	
	public String validateEmailService(String email)
	{
		System.out.println("reset service stsrted");
		String name=resetDao.validateEmailDao(email);
		return name;
		
	}
	public String resetService(String email)
	{
		String d1="";
		String c=email;
		int a=c.length();
				Random r=new Random();
		char[] password=new char[a];
		for (int i = 0; i < a; i++) {
			
			password[i]=c.charAt(r.nextInt(c.length()));
		}
		for (char d : password) {
			d1=d1+d;
		}
		int i=resetDao.resetPassword(email, d1);
		if (i!=0) {
			return d1;
			
		}
		else {
			return null;
		}
	}

}
