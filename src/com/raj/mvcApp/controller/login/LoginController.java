package com.raj.mvcApp.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.raj.mvcApp.dto.login.LoginDTO;
import com.raj.mvcApp.dto.register.RegisterDTO;
import com.raj.mvcApp.model.services.login.LoginService;

@Controller
@RequestMapping("/")
public class LoginController 
    {
	@Autowired
	private LoginService service;

	public LoginController() 
	    {
		System.out.println(this.getClass().getSimpleName() + "created..");
	    }

	    @RequestMapping(value = "/Login.do", method = RequestMethod.POST)
	    public ModelAndView userLoginController(LoginDTO dto, HttpServletRequest req) {
		System.out.println("login controller started....");
		RegisterDTO dtoFromDB = service.userLoginService(dto);

		if (dtoFromDB != null) 
		{
			HttpSession session = req.getSession();
			session.setAttribute("dto", dtoFromDB);
			System.out.println("Login Sucess....");
			System.out.println("login controller ended");
			return new ModelAndView("Home.jsp", "nmg", dtoFromDB.getName());
		}
		
		else
			
		{
			System.out.println("Login controller ended");
			return new ModelAndView("Login.jsp", "msg", "Invalid usreId and Password");
		}
	}
}
