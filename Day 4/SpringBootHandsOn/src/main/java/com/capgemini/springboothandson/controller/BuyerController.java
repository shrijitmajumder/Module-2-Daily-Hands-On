package com.capgemini.springboothandson.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springboothandson.model.Buyer;

@RestController
@RequestMapping("/buyer")
public class BuyerController {
	
List<Buyer> buyerList = new ArrayList<Buyer>();
	
	@RequestMapping("/showbuyer")
	public List<Buyer> showBuyer(){
		Buyer b1=new Buyer(1001,"Mohan","Ranchi","Jharkhand");
		Buyer b2=new Buyer(1002,"Viru","Kolkata","West Bengal");
		Buyer b3=new Buyer(1003,"Anil","Shimla","Himachal Pradesh");
	
		buyerList.add(b1);
		buyerList.add(b2);
		buyerList.add(b3);
		
		return buyerList;
	}

	@RequestMapping("/showbuyerbyid/{id}")
	public Buyer showBuyerById(@PathVariable("id") int id) {
		
		Buyer b = new Buyer();
		System.out.println("searching buyer by id "+id);
		for(int i=0;i<buyerList.size();i++) {
			System.out.println("in buyer by id for loop");
			if(buyerList.get(i).getBid()==id) {
				
				b=buyerList.get(i);
				System.out.println(b.getBid());
			}
		}
		return b;
	}

}
