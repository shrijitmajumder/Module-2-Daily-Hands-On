package com.capgemini.shrijit.manytomany;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.capgemini.shrijit.manytomany.dao.Items_OrdersDao;
import com.capgemini.shrijit.manytomany.entity.Customers;
import com.capgemini.shrijit.manytomany.entity.Items;
import com.capgemini.shrijit.manytomany.entity.Items_Orders;
import com.capgemini.shrijit.manytomany.entity.Orders;

/**
 * 
 * @author Shrijit
 *
 */
public class App 
{
	public static void main( String[] args ) throws ParseException
	{
		//create some customers
		Customers cust1=new Customers("John Doe");
		Customers cust2=new Customers("Bruce Wayne");

		//create some orders
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yy");
		Orders ord1 = new Orders(cust1,sdf.parse("12/24/09"),156.78);
		Orders ord2 = new Orders(cust2,sdf.parse("12/25/09"),99.99);
		
		
		//create some items
		Items item1=new Items("Tickel Me Elmo","It wants to be tickled");
		Items item2=new Items("District 9 DVD","Awesome sci-fi movie");
		Items item3=new Items("Batarang","It is very sharp");
		
		//create some items_orders
		Items_Orders io1=new Items_Orders(ord1,item1);
		Items_Orders io2=new Items_Orders(ord1,item2);
		Items_Orders io3=new Items_Orders(ord2,item2);
		Items_Orders io4=new Items_Orders(ord2,item3);
		
		Items_OrdersDao ioDao = new Items_OrdersDao();
		
		ioDao.SaveItems_Orders(io1);
		ioDao.SaveItems_Orders(io2);
		ioDao.SaveItems_Orders(io3);
		ioDao.SaveItems_Orders(io4);
		
		
	}
}
