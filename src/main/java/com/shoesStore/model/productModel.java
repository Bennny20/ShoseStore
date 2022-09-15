package com.shoesStore.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity(name = "Products")
@Table(name = "Product")
public class productModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productID")
	private String productID;
	
	@Column(name = "productName")
	@NotEmpty(message = "Name is required")
	@Length(min = 1, max = 50, message = "Maximum name is 50")
	private String brandName;
	
	@Column(name = "price")
	@NotEmpty(message = "Price is required")
	@Length(min = 1, max = 50, message = "Maximum price is 50")
	private int price;
	
	@Column(name = "Image")
	private String image;
	
	@ManyToOne
	private List <brandModel> Brand_Model;

	public productModel(String productID, String brandName, int price, String image, List<brandModel> brand_Model) {
		super();
		this.productID = productID;
		this.brandName = brandName;
		this.price = price;
		this.image = image;
		Brand_Model = brand_Model;
	}

	public productModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<brandModel> getBrand_Model() {
		return Brand_Model;
	}

	public void setBrand_Model(List<brandModel> brand_Model) {
		Brand_Model = brand_Model;
	}
	
	

}
