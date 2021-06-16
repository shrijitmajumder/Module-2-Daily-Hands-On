package com.capgemini.dailyhandson.entity;

import java.io.Serializable;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
 
public class Vegetable implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Vegetable(String vegetableName, float vegetablePrice) {
		super();
		this.vegetableName=vegetableName;
		this.vegetablePrice=vegetablePrice;
	}
 
	public Vegetable() {
		super();
	}
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="VEGETABLE_ID",unique = true,nullable = false)
	private Integer vegetableId;
	
	@Column(name = "VEGETABLE_NAME",unique = true,nullable = false,length = 100)
	private String vegetableName;
	
	@Column(name = "VEGETABLE_PRICE",unique = true,nullable = false,length = 100)
	private float vegetablePrice;


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public Integer getVegetableId() {
		return vegetableId;
	}

	public void setVegetableId(Integer vegetableId) {
		this.vegetableId = vegetableId;
	}

	public String getVegetableName() {
		return vegetableName;
	}

	public void setVegetableName(String vegetableName) {
		this.vegetableName = vegetableName;
	}

	public float getVegetablePrice() {
		return vegetablePrice;
	}

	public void setVegetablePrice(float vegetablePrice) {
		this.vegetablePrice = vegetablePrice;
	}
 
	
	
}
 