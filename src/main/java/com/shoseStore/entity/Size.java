package com.shoseStore.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Size {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "code", length = 20, nullable = false)
	private String sizeCode;
	
	@Column(name = "numSize" , nullable = false)
	private int numSize;

	/**
	 * @return the sizeCode
	 */
	public String getSizeCode() {
		return sizeCode;
	}

	/**
	 * @param sizeCode the sizeCode to set
	 */
	public void setSizeCode(String sizeCode) {
		this.sizeCode = sizeCode;
	}

	/**
	 * @return the numSize
	 */
	public int getNumSize() {
		return numSize;
	}

	/**
	 * @param numSize the numSize to set
	 */
	public void setNumSize(int numSize) {
		this.numSize = numSize;
	}
	
	
}
