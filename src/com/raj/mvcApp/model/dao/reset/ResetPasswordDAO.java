package com.raj.mvcApp.model.dao.reset;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ResetPasswordDAO {
	public ResetPasswordDAO() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	@Autowired
	private SessionFactory factory;
	
	public String validateEmailDao(String email)
	
	{
		System.out.println("hql started");
		String hql="select R.name from RegisterDTO R where R.emailId='"+email+"'";
		System.out.println("hql ended");
		 Session session=factory.openSession();
		 Query query=session.createQuery(hql);
		 String name=(String) query.uniqueResult();
		 System.out.println("validate email stopped");
		 return name;
	}
	public int resetPassword(String email, String password)
	{
		System.out.println("hql 2 started");
		String hql="update RegisterDTO set password=:ps, confirmPwd=:cp where emailId=:email";
		System.out.println("hql 2 ended");
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		System.out.println("started...!");
		Query query=session.createQuery(hql);
		query.setParameter("ps", password);
		query.setParameter("cp", password);
		query.setParameter("email",email);
		System.out.println("doooooo");
		int i=query.executeUpdate();
		transaction.commit();
		System.out.println("reset password");
		return i;
	}
}