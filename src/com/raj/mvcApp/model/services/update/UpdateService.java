package com.raj.mvcApp.model.services.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.mvcApp.dto.register.RegisterDTO;
import com.raj.mvcApp.model.dao.update.UpdateDAO;

@Service
public class UpdateService
{
	@Autowired
	private UpdateDAO dao;
	
	public  UpdateService() 
	{
		System.out.println(this.getClass().getTypeName()+"created....");
	}
	public RegisterDTO userUpdateService(RegisterDTO dto)
	{
		System.out.println("Update service stated...");
		RegisterDTO dtoFromSession=dao.update(dto);
		System.out.println("Update service ended...");
		
		return dtoFromSession;
		
	}
	
}
