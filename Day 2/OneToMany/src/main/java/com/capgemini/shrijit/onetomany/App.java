package com.capgemini.shrijit.onetomany;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.capgemini.shrijit.onetomany.dao.OrdersDao;
import com.capgemini.shrijit.onetomany.entity.Customers;
import com.capgemini.shrijit.onetomany.entity.Orders;

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
        Orders ord3 = new Orders(cust1,sdf.parse("12/26/09"),75.00);
        OrdersDao od = new OrdersDao();
        od.SaveOrders(ord1);
        od.SaveOrders(ord2);
        od.SaveOrders(ord3);
    }
}
