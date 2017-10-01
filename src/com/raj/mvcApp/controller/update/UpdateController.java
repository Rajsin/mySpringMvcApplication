package com.raj.mvcApp.controller.update;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.raj.mvcApp.dto.register.RegisterDTO;
import com.raj.mvcApp.model.services.update.UpdateService;

@Controller
@RequestMapping("/")
public class UpdateController 
{
	@Autowired
	private UpdateService service;
	public UpdateController()
	{
		System.out.println(this.getClass().getSimpleName()+" created...");
	}
	@RequestMapping(value="/Update.do",method=RequestMethod.POST)
	public ModelAndView updateUserController(RegisterDTO dto,HttpServletRequest request)
	{
		System.out.println("Update controller started....");
		System.out.println(dto);
		
		HttpSession session=request.getSession(false);
		RegisterDTO dtoFromSession=(RegisterDTO) session.getAttribute("dto");
		
		int pk=dtoFromSession.getId();
		dto.setId(pk);
		RegisterDTO registerDTO = service.userUpdateService(dto);
		session.setAttribute("dto", registerDTO);
		System.out.println("Update controller ended...");
		
		return new ModelAndView("Usuccess.jsp", "nmg",dtoFromSession.getName());
		
	}

}
