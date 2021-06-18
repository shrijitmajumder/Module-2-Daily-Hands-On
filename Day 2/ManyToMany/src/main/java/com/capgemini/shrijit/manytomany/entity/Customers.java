package com.capgemini.shrijit.manytomany.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class  Customers{
	
	@Id
	@SequenceGenerator(name = "custSeqGen", sequenceName="custSeq",initialValue=101,allocationSize=100)
	@GeneratedValue(generator = "custSeqGen")
	@Column(name="customer_id")
	private Integer id;
	private String customer_name;
	
	public Customers(String customer_name) {
		super();
		this.customer_name = customer_name;
	}

	public Customers() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	
}
