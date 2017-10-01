package com.raj.mvcApp.model.dao.update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raj.mvcApp.dto.register.RegisterDTO;

@Repository
public class UpdateDAO {
	@Autowired
	private SessionFactory factory;

	public UpdateDAO() {
		System.out.println(this.getClass().getSimpleName() + "created....");
	}

	public RegisterDTO update(RegisterDTO dto) {
		System.out.println("Update DAO stared....");
		System.out.println("Upadte dao called");

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("session is working");
		System.out.println(dto);

		RegisterDTO dtoFromDB = (RegisterDTO) session.merge(dto);

		tx.commit();
		session.close();

		return dtoFromDB;

		/*
		 * try { session.saveOrUpdate(dto); tx.commit();
		 * System.out.println("Update dao inside try called"); }
		 * catch(HibernateException he) { he.printStackTrace(); tx.rollback(); }
		 * finally { session.close(); }
		 * 
		 * System.out.println("Update DAO ended...."); return dto;
		 */
	}
}
