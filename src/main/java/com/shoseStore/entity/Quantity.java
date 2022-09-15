package com.shoseStore.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Quantity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "code", length = 20, nullable = false)
	private String quatintyCode;
	
	@Column(name = "numQuantity")
	private int numQuantity;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinColumn(name = "PRO_NAME_ID", foreignKey = @ForeignKey(name = "NAME_SHOES_QUANTITY_FK"))
	private Product productName;

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinColumn(name = "SHOES_SIZE_ID", foreignKey = @ForeignKey(name = "SIZE_SHOES_QUANTITY_FK"))
	private Size shoesSize;

	/**
	 * @return the quatintyCode
	 */
	public String getQuatintyCode() {
		return quatintyCode;
	}

	/**
	 * @param quatintyCode the quatintyCode to set
	 */
	public void setQuatintyCode(String quatintyCode) {
		this.quatintyCode = quatintyCode;
	}

	/**
	 * @return the numQuantity
	 */
	public int getNumQuantity() {
		return numQuantity;
	}

	/**
	 * @param numQuantity the numQuantity to set
	 */
	public void setNumQuantity(int numQuantity) {
		this.numQuantity = numQuantity;
	}

	/**
	 * @return the productName
	 */
	public Product getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(Product productName) {
		this.productName = productName;
	}

	/**
	 * @return the shoesSize
	 */
	public Size getShoesSize() {
		return shoesSize;
	}

	/**
	 * @param shoesSize the shoesSize to set
	 */
	public void setShoesSize(Size shoesSize) {
		this.shoesSize = shoesSize;
	}
}
