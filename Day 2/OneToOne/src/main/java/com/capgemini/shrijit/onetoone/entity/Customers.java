package com.capgemini.shrijit.onetoone.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class  Customers{
	
	
	@Id
	@SequenceGenerator(name = "custSeqGen", sequenceName="custSeq",initialValue=101,allocationSize=100)
	@GeneratedValue(generator = "custSeqGen")
	@Column(name="customer_id")
	private Integer id;
	private String customer_name;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;
	
	public Customers() {
		super();
	}
	
	public Customers(String customer_name, Address address) {
		super();
		this.customer_name = customer_name;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
}