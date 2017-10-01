package com.raj.mvcApp.model.dao.register;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.raj.mvcApp.dto.register.RegisterDTO;

@Component
public class RegisterDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public RegisterDAO() {
		System.out.println("RegisterDAO created...");
	}

	public void save(RegisterDTO dto) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {

			session.save(dto);
			tx.commit();
		} catch (HibernateException he) {
			he.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}

	}

}