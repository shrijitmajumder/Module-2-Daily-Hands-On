package com.capgemini.springbootpracticehandson.service;

import java.util.List;

import com.capgemini.springbootpracticehandson.model.Vendor;

public interface IVendorService {
	
	public List<Vendor> getallVendors();
	public Vendor getVendorById(int id);
	public Vendor addVendor(Vendor vendor);
	public Vendor updateVendorById(Vendor vendor,int id);
	public Vendor deleteVendor(int id);
	public Vendor deleteVendorByCategory(String category);
	public Vendor deletePermanentVendors();
	public Vendor getVendor(char c);
	public Vendor getVendorByMobileNumber(long num);

}
