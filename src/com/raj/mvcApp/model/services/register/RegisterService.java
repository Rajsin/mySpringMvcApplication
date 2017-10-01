package com.raj.mvcApp.model.services.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.raj.mvcApp.dto.register.RegisterDTO;
import com.raj.mvcApp.model.dao.register.RegisterDAO;



@Component
public class RegisterService{
	
	@Autowired
	private RegisterDAO registerDAO;
	
	public RegisterService()
	{
		System.out.println("Register Service created");
	}

public  void register(RegisterDTO dto)
{
	System.out.println("inside RegisterService register method");
	 registerDAO.save(dto);
	
}
	
	}
