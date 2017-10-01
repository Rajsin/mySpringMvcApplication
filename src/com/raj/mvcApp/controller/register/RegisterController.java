package com.raj.mvcApp.controller.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.raj.mvcApp.dto.register.RegisterDTO;
import com.raj.mvcApp.model.services.register.RegisterService;

@Component
@RequestMapping("/")
public class RegisterController {
	public RegisterController()
	{
		System.out.println(this.getClass().getSimpleName()+"Created....");
	}
	@Autowired
	private RegisterService registerService;
	@RequestMapping(value="/register.do", method=RequestMethod.POST)
	public ModelAndView something(RegisterDTO dto) {

		System.out.println("inside create controller");
		registerService.register(dto);
		System.out.println(dto);
		return new ModelAndView("/Success.jsp", "name",dto.getName());
	}
		
	

}
