package com.capgemini.springboothandson.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springboothandson.model.Seller;

@RestController
@RequestMapping("/seller")
public class SellerController {
	
	List<Seller> sellerList = new ArrayList<Seller>();
	
	@RequestMapping("/showseller")
	public List<Seller> showSeller(){
		Seller s1=new Seller(101,"Akhil","Patna","Bihar");
		Seller s2=new Seller(102,"Raj","Mumbai","Maharashtra");
		Seller s3=new Seller(103,"Manoj","Kolkata","West Bengal");
	
		sellerList.add(s1);
		sellerList.add(s2);
		sellerList.add(s3);
		
		return sellerList;
	}

	@RequestMapping("/showsellerbyid/{id}")
	public Seller showSellerById(@PathVariable("id") int id) {
		
		Seller s = new Seller();
		System.out.println("searching seller by id "+id);
		for(int i=0;i<sellerList.size();i++) {
			System.out.println("in seller by id for loop");
			if(sellerList.get(i).getSid()==id) {
				
				s=sellerList.get(i);
				System.out.println(s.getSid());
			}
		}
		return s;
	}
}
