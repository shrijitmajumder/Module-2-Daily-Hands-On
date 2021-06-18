package com.capgemini.shrijit.manytomany.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Orders {
	
	@Id
	@SequenceGenerator(name = "ordSeqGen",sequenceName = "ordSeq",initialValue = 555,allocationSize = 100)
	@GeneratedValue(generator = "ordSeqGen")
	@Column(name="order_id")
	private Integer id;
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customers cust;
	
	@Column(name="order_date")
	private Date orderdate;
	
	@Column(name="amount")
	private double amount;

	public Orders() {
		super();
	}

	public Orders(Customers cust, Date orderdate, double amount) {
		super();
		this.cust = cust;
		this.orderdate = orderdate;
		this.amount = amount;
	}
	
	public Orders(Date orderdate, double amount) {
		super();
		this.orderdate = orderdate;
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customers getCust() {
		return cust;
	}

	public void setCust(Customers cust) {
		this.cust = cust;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", cust=" + cust + ", orderdate=" + orderdate + ", amount=" + amount + "]";
	}

	
	
}
