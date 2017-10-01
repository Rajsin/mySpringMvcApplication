package com.raj.mvcApp.model.dao.login;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raj.mvcApp.dto.login.LoginDTO;
import com.raj.mvcApp.dto.register.RegisterDTO;

@Repository
public class LoginDAO {
	@Autowired
	private SessionFactory factory;

	public LoginDAO() {
		System.out.println("Login DAO started....");
	}

	public RegisterDTO fetch(LoginDTO dto) {
		System.out.println("Login DAO started");
		System.out.println("dto value in fetch "+dto);
		String hql = "From RegisterDTO R where R.emailId=:em and R.password=:pwd";
		Session session = factory.openSession();
		Query qry = session.createQuery(hql);
		qry.setParameter("em", dto.getEmailId());
		qry.setParameter("pwd", dto.getPassword());
		RegisterDTO dtoFromDB = (RegisterDTO) qry.uniqueResult();
		System.out.println("Login DAO ended....");
		return dtoFromDB;

	}

}
