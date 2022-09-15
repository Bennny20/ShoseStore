package com.shoseStore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Brands")
public class Brand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "code", length = 10, nullable = false)
	private int brandCode;
	
	@Column(name="Name", length = 255, nullable = false)
	private String brandName;

	/**
	 * @return the brandCode
	 */
	public int getBrandCode() {
		return brandCode;
	}

	/**
	 * @param brandCode the brandCode to set
	 */
	public void setBrandCode(int brandCode) {
		this.brandCode = brandCode;
	}

	/**
	 * @return the brandName
	 */
	public String getBrandName() {
		return brandName;
	}

	/**
	 * @param brandName the brandName to set
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
}
