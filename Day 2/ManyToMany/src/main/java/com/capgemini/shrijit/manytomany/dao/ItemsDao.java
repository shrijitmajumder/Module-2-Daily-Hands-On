package com.capgemini.shrijit.manytomany.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.shrijit.manytomany.entity.Items;
import com.capgemini.shrijit.manytomany.util.HibernateUtil;

public class ItemsDao {
	public void SaveItems(Items items) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//save the instructor object
			session.save(items);
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
