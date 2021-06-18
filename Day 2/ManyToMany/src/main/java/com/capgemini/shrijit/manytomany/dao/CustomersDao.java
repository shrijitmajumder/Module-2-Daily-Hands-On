package com.capgemini.shrijit.manytomany.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.shrijit.manytomany.entity.Customers;
import com.capgemini.shrijit.manytomany.util.HibernateUtil;

public class CustomersDao {
	public void saveCustomer(Customers customer) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//save the instructor object
			session.save(customer);
			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	
	
	public void updateCustomer(Customers customers) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//save the instructor object
			session.saveOrUpdate(customers);
			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	public void deleteCustomer(int id) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//get instructor using id
			Customers customer = session.get(Customers.class, id);
			//delete the instructor object
			session.delete(customer);
			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}
	public Customers getCustomer(int id) {
		Transaction transaction = null;
		Customers customer = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//get instructor using id
			customer =session.get(Customers.class, id);

			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return customer;
		
	}
	public List<Customers> getAllCustomers() {
		List<Customers> customer = null;
	    //read data from table instructor using Hibernate  
        try {
        	Session session = HibernateUtil.getSessionFactory().openSession();
        	customer = session.createQuery("from Customers",Customers.class).list();
        	customer.forEach(instr -> System.out.println(instr.getId()));
        
        }catch(Exception e) {
        	e.printStackTrace();
        }
		return customer;
	}
}

