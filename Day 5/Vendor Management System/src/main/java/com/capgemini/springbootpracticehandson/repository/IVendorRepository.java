package com.capgemini.springbootpracticehandson.repository;

import java.util.List;

import com.capgemini.springbootpracticehandson.model.Vendor;

public interface IVendorRepository {
	
	public List<Vendor> getallVendors();
	public Vendor getVendorById(int id);
	public Vendor addVendor(Vendor vendor);
	public Vendor updateVendorById(Vendor vendor,int id);
	public Vendor deleteVendor(int id);
	public List<Vendor> deleteVendorByCategory(String category);
	public List<Vendor> deletePermanentVendors();
	public List<Vendor> getVendor(char c);
	public Vendor getVendorByMobileNumber(long num);

}
