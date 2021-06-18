package com.capgemini.shrijit.onetoone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {

	@Id
	@SequenceGenerator(name = "addSeqGen", sequenceName="addSeq",initialValue=301,allocationSize=100)
	@GeneratedValue(generator = "addSeqGen")
	
	private Integer id;
	private String address;
	
	
	public Address() {
		super();
	}


	public Address(String address) {
		super();
		this.address = address;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	
	
	
}
