package com.capgemini.shrijit.manytomany.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class  Items{
	
	
	@Id
	@SequenceGenerator(name = "itemSeqGen", sequenceName="itemSeq",initialValue=201,allocationSize=100)
	@GeneratedValue(generator = "itemSeqGen")
	@Column(name="item_id")
	private Integer id;
	private String item_name;
	private String item_description;
	
	public Items(String item_name,String item_description) {
		super();
		this.item_name = item_name;
		this.item_description = item_description;
	}

	public Items() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getItem_description() {
		return item_description;
	}

	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}	
	
}
