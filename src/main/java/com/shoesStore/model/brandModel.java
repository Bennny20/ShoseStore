package com.shoesStore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity(name = "Brands")
@Table(name = "Brand")
public class brandModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "brandID")
	private int brandID;
	
	@Column(name = "brandName")
	@NotEmpty(message = "Name is required")
	@Length(min = 1, max = 50, message = "Maximum code is 50")
	private String brandName;
	
	public brandModel() {
		super();
	}
	
	public brandModel(int brandID, String brandName) {
		super();
		this.brandID = brandID;
		this.brandName = brandName;
	}

	public int getBrandID() {
		return brandID;
	}

	public void setBrandID(int brandID) {
		this.brandID = brandID;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	

}
