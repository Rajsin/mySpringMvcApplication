package com.raj.mvcApp.model.services.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.mvcApp.dto.login.LoginDTO;
import com.raj.mvcApp.dto.register.RegisterDTO;
import com.raj.mvcApp.model.dao.login.LoginDAO;

@Service
public class LoginService {
	@Autowired
	private LoginDAO dao;

	public LoginService() {
		System.out.println(this.getClass().getSimpleName() + "created....");
	}

	public RegisterDTO userLoginService(LoginDTO dto) {
		System.out.println("Login service stared....");
		RegisterDTO dtoFromDB = dao.fetch(dto);
		System.out.println("Login service ended....");
		return dtoFromDB;
	}
}
