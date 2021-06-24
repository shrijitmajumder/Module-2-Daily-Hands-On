package com.capgemini.vendormanagementsystemusingjpa.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.vendormanagementsystemusingjpa.entity.Vendor;

@Service
public interface IVendorService {
	
	public List<Vendor> getallVendors();
	public Vendor getVendorById(int id);
	public Vendor addVendor(Vendor vendor);
	public Vendor updateVendorById(Vendor vendor,int id);
	public ResponseEntity<Vendor> deleteVendor(int id);
	public Vendor getVendorByMobileNumber(long num);
	public List<Vendor> getByVendorCategory(String category);
	public List<Vendor> getByVendorName(char c);
	public List<Vendor> getByVendorType(String type);
}
