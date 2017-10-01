package com.raj.mvcApp.controller.reset;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.raj.mvcApp.model.services.reset.ResetPasswordService;

@Controller
@RequestMapping("/")
public class ResetPasswordController {

	@Autowired
	private ResetPasswordService service;

	public ResetPasswordController() {
		System.out.println(this.getClass().getSimpleName() + "created...");
	}

	@RequestMapping(value = "/Forgot.do", method = RequestMethod.POST)
	public ModelAndView validateEmail(@RequestParam String email) {
		System.out.println("validate email controller is started");
		String name = service.validateEmailService(email);

		if (name != null) {
			return new ModelAndView("redirect:reset.do?email=" + email);

		} else {
			System.out.println("validate email controller is stopped");
			return new ModelAndView("Forget.jsp", "msg", "invalid");
		}
	}

	@RequestMapping(value = "/reset.do")
	public ModelAndView resetPassController(HttpServletRequest request) {
		System.out.println("model and view");
		//check email or emailId
		
		String email = request.getParameter("email");
		System.out.println("email id : "+email);
		String password = service.resetService(email);
		System.out.println("model and view ended...!");
		return new ModelAndView("Forgot.jsp", "db", password);

	}

}
