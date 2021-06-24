package com.capgemini.vendormanagementsystemusingjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.vendormanagementsystemusingjpa.entity.Vendor;
import com.capgemini.vendormanagementsystemusingjpa.exception.VendorNotFoundException;
import com.capgemini.vendormanagementsystemusingjpa.repository.VendorRepository;

@Service
public class VendorService implements IVendorService{

	@Autowired
	private VendorRepository vendorRepository;
	
	@Override
	public List<Vendor> getallVendors() {
		// TODO Auto-generated method stub
		return this.vendorRepository.findAll();
	}

	@Override
	public Vendor getVendorById(int id) {
		// TODO Auto-generated method stub
		return this.vendorRepository.findById(id)
				.orElseThrow(()->new VendorNotFoundException("Vendor Not Found With ID "+id));
	}

	@Override
	public Vendor addVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return this.vendorRepository.save(vendor);
	}

	@Override
	public Vendor updateVendorById(Vendor vendor, int id) {
		// TODO Auto-generated method stub
		Vendor existingVendor = this.vendorRepository.findById(id)
				.orElseThrow(()->new VendorNotFoundException("Vendor Not Found With ID "+id));
		existingVendor.setVenCategory(vendor.getVenCategory());
		existingVendor.setVenEmailId(vendor.getVenEmailId());
		existingVendor.setVenMobileNo(vendor.getVenMobileNo());
		existingVendor.setVenName(vendor.getVenName());
		existingVendor.setVenType(vendor.getVenType());
		return this.vendorRepository.save(existingVendor);
	}

	@Override
	public ResponseEntity<Vendor> deleteVendor(int id) {
		// TODO Auto-generated method stub
		Vendor existingVendor = this.vendorRepository.findById(id)
				.orElseThrow(()->new VendorNotFoundException("Vendor Not Found With ID "+id));
		this.vendorRepository.delete(existingVendor);
		return ResponseEntity.ok().build();
	}


	@Override
	public Vendor getVendorByMobileNumber(long num) {
		// TODO Auto-generated method stub
		return this.vendorRepository.getVendorByMobileNumber(num);
	}

	@Override
	public List<Vendor> getByVendorCategory(String category) {
		// TODO Auto-generated method stub
		return this.vendorRepository.getByVendorCategory(category);
	}

	@Override
	public List<Vendor> getByVendorName(char c) {
		// TODO Auto-generated method stub
		return this.vendorRepository.getByVendorName(c);
	}

	@Override
	public List<Vendor> getByVendorType(String type) {
		// TODO Auto-generated method stub
		return this.vendorRepository.getByVendorType(type);
	}

}

