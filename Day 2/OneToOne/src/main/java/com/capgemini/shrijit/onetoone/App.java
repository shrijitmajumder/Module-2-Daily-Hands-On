package com.capgemini.shrijit.onetoone;

import java.io.IOException;

import com.capgemini.shrijit.onetoone.dao.CustomersDao;
import com.capgemini.shrijit.onetoone.entity.Address;
import com.capgemini.shrijit.onetoone.entity.Customers;

/**
 * 
 * @author Shrijit Majumder
 *
 */
public class App 
{
	public static void main( String[] args ) throws IOException
	{
		Address address1 = new Address("12 Main St., Houston TX 77001"); 
		Address address2 = new Address("1007 Mountain Dr., Gotham NY 10286"); 
		Customers cust1= new Customers("John Doe",address1); 
		Customers cust2 = new Customers("Bruce Wayne",address2); 
		CustomersDao customersDao = new CustomersDao(); cust1.setAddress(address1); cust2.setAddress(address2);
		customersDao.saveCustomer(cust1); customersDao.saveCustomer(cust2);
	}
}
