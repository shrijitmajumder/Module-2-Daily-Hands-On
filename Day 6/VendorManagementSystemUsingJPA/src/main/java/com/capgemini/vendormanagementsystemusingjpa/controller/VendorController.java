package com.capgemini.vendormanagementsystemusingjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.vendormanagementsystemusingjpa.entity.Vendor;
import com.capgemini.vendormanagementsystemusingjpa.service.IVendorService;


@RestController
@RequestMapping("/vendor")
public class VendorController {

	@Autowired
	public IVendorService vs;
	
	@GetMapping("/getallvendors")
	public List<Vendor> getallVendors() {
		// TODO Auto-generated method stub
		return vs.getallVendors();
	}

	@GetMapping("/getvendorbyid/{id}")
	public Vendor getVendorById(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return vs.getVendorById(id);
	}

	@PostMapping("/addvendor")
	public Vendor addVendor(@RequestBody Vendor vendor) {
		// TODO Auto-generated method stub
		return vs.addVendor(vendor);
	}

	@PutMapping("/updatevendorbyid/{id}")
	public Vendor updateVendor(@RequestBody Vendor vendor,@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return vs.updateVendorById(vendor,id);
	}

	@DeleteMapping("/deletevendor/{id}")
	public ResponseEntity<Vendor> deleteVendor(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return vs.deleteVendor(id);
	}

	@GetMapping("/getvendorsbycategory/{category}")
	public List<Vendor> getByVendorCategory(@PathVariable("category") String category) {
		// TODO Auto-generated method stub
		return this.vs.getByVendorCategory(category);
	}

	@GetMapping("/getvendorbyfirstcharacter/{character}")
	public List<Vendor> getByVendorName(@PathVariable("character") char c) {
		// TODO Auto-generated method stub
		return this.vs.getByVendorName(c);
	}
	
	@GetMapping("/getvendorsbytype/{type}")
	public List<Vendor> getByVendorType(@PathVariable("type") String type) {
		// TODO Auto-generated method stub
		return this.vs.getByVendorType(type);
	}
	
	@GetMapping("/getvendorbymobileno/{mobno}")
	public Vendor getVendorByMobileNumber(@PathVariable("mobno") long num) {
		// TODO Auto-generated method stub
		return vs.getVendorByMobileNumber(num);
	}
}
