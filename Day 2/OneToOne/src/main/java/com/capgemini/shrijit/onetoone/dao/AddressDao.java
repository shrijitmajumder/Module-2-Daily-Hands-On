package com.capgemini.shrijit.onetoone.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.shrijit.onetoone.entity.Address;
import com.capgemini.shrijit.onetoone.util.HibernateUtil;

public class AddressDao {

	public void SaveInstructor(Address address) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//save the instructor object
			session.save(address);
			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
