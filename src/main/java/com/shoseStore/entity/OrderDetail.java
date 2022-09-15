package com.shoseStore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OrderDetails")
public class OrderDetail {
	
	@Id
	@Column(name = "orderDetailID", length = 30, nullable = false)
	private String orderDetailID;
	
	@Column(name = "productID", length = 30, nullable = false)
	private String productID;
	
	@Column(name = "sizeID", length = 30, nullable = false)
	private int sizeID;
	
	@Column(name = "quantity", length = 30, nullable = false)
	private int quantity;
	
	@Column(name = "price", length = 30, nullable = false)
	private int price;
	
	@Column(name = "amount", length = 30, nullable = false)
	private String amount;
	
	@Column(name = "orderID", length = 30, nullable = false)
	private String orderID;

	public String getOrderDetailID() {
		return orderDetailID;
	}

	public void setOrderDetailID(String orderDetailID) {
		this.orderDetailID = orderDetailID;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public int getSizeID() {
		return sizeID;
	}

	public void setSizeID(int sizeID) {
		this.sizeID = sizeID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	
	
	
}
