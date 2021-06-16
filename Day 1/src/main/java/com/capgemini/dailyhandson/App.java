package com.capgemini.dailyhandson;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.dailyhandson.entity.Vegetable;
import com.capgemini.dailyhandson.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Vegetable veg1 = new Vegetable("tomato", 25.0f);
    	Vegetable veg2 = new Vegetable("potato", 32.5f);
        Transaction transaction = null;
        try {
        	Session session = HibernateUtil.getSessionFactory().openSession();
        	//start a transaction
        	transaction = session.beginTransaction();
        	//save the employee objects in to table
        	session.save(veg1);
        	session.save(veg2);
        	//commit transaction
        	transaction.commit();	
        }catch(Exception e) {
        	if(transaction != null) {
        		transaction.rollback();
        	}
        	e.printStackTrace();
        }//catch close
        
      //read data from table Vegetable using Hibernate  
        try {
        	Session session = HibernateUtil.getSessionFactory().openSession();
        	List<Vegetable> vegs = session.createQuery("from Vegetable",Vegetable.class).list();
        	vegs.forEach(vg -> System.out.println(vg.getVegetableName()));
        
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
