package com.capgemini.shrijit.manytomany.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Items_Orders {
	
	@Id
	@SequenceGenerator(name = "ioSeqGen", sequenceName="ioSeq",initialValue=1,allocationSize=100)
	@GeneratedValue(generator = "ioSeqGen")
	@Column(name="item_order_id")
	private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="order_id")
	private Orders orders;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="item_id")
	private Items items;
	
	public Items_Orders(Orders orders, Items items) {
		super();
		this.items = items;
		this.orders = orders;
	}

	public Items_Orders() {
		super();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
}
