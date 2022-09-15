package com.shoesStore.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Quantities")
@Table(name = "Quantity")
public class quantityModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "quantityID")
	private int quantityID;
	
	@Column(name = "numQuantity")
	private int numQuantity;
	
	@Column(name = "sizeID")
	private int sizeID;
	
	@ManyToOne
	private List <productModel> ProductModel;

	public quantityModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public quantityModel(int quantityID, int numQuantity, int sizeID, List<productModel> productModel) {
		super();
		this.quantityID = quantityID;
		this.numQuantity = numQuantity;
		this.sizeID = sizeID;
		ProductModel = productModel;
	}

	public int getQuantityID() {
		return quantityID;
	}

	public void setQuantityID(int quantityID) {
		this.quantityID = quantityID;
	}

	public int getNumQuantity() {
		return numQuantity;
	}

	public void setNumQuantity(int numQuantity) {
		this.numQuantity = numQuantity;
	}

	public int getSizeID() {
		return sizeID;
	}

	public void setSizeID(int sizeID) {
		this.sizeID = sizeID;
	}

	public List<productModel> getProductModel() {
		return ProductModel;
	}

	public void setProductModel(List<productModel> productModel) {
		ProductModel = productModel;
	}
	

}
