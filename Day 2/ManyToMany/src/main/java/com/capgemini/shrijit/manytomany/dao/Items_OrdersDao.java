package com.capgemini.shrijit.manytomany.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.shrijit.manytomany.entity.Items_Orders;
import com.capgemini.shrijit.manytomany.util.HibernateUtil;

public class Items_OrdersDao {
	public void SaveItems_Orders(Items_Orders io) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//save the instructor object
			session.save(io);
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
