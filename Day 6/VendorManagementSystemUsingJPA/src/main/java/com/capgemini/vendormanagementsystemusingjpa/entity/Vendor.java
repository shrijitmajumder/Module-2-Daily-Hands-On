package com.capgemini.vendormanagementsystemusingjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="vendor")
public class Vendor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "vendor_Sequence")
    @SequenceGenerator(name = "vendor_Sequence", sequenceName = "VENDOR_SEQ", initialValue = 101)
	private int venId;
	
	@Column(name = "venName")
	private String venName;
	
	@Column(name = "venMobileNo")
	private long venMobileNo;
	
	@Column(name = "venType")
	private String venType;
	
	@Column(name = "venCategory")
	private String venCategory;
	
	@Column(name = "venEmailId")
	private String venEmailId;
	
	public Vendor() {
		super();
	}

	public Vendor(int venId, String venName, long venMobileNo, String venType, String venCategory, String venEmailId) {
		super();
		this.venId = venId;
		this.venName = venName;
		this.venMobileNo = venMobileNo;
		this.venType = venType;
		this.venCategory = venCategory;
		this.venEmailId = venEmailId;
	}

	public int getVenId() {
		return venId;
	}

	public void setVenId(int venId) {
		this.venId = venId;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public long getVenMobileNo() {
		return venMobileNo;
	}

	public void setVenMobileNo(long venMobileNo) {
		this.venMobileNo = venMobileNo;
	}

	public String getVenType() {
		return venType;
	}

	public void setVenType(String venType) {
		this.venType = venType;
	}

	public String getVenCategory() {
		return venCategory;
	}

	public void setVenCategory(String venCategory) {
		this.venCategory = venCategory;
	}

	public String getVenEmailId() {
		return venEmailId;
	}

	public void setVenEmailId(String venEmailId) {
		this.venEmailId = venEmailId;
	}

}
