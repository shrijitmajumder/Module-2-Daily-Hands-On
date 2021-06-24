package com.capgemini.vendormanagementsystemusingjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.vendormanagementsystemusingjpa.entity.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer>{

	@Query("select v from Vendor v where v.venCategory like %?1")
	public List<Vendor> getByVendorCategory(String category);
	
	@Query("select v from Vendor v where v.venName like %?1%")
	public List<Vendor> getByVendorName(char c);
	
	@Query("select v from Vendor v where v.venType like %?1")
	public List<Vendor> getByVendorType(String type);

	@Query("select v from Vendor v where v.venMobileNo = ?1")
	public Vendor getVendorByMobileNumber(long num);
}

