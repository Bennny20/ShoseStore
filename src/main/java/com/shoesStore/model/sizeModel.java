package com.shoesStore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Sizes")
@Table(name = "Size")
public class sizeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sizeID")
	private int sizeID;
	
	@Column(name = "numSize")
	private int numSize;

	public sizeModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public sizeModel(int sizeID, int numSize) {
		super();
		this.sizeID = sizeID;
		this.numSize = numSize;
	}

	public int getSizeID() {
		return sizeID;
	}

	public void setSizeID(int sizeID) {
		this.sizeID = sizeID;
	}

	public int getNumSize() {
		return numSize;
	}

	public void setNumSize(int numSize) {
		this.numSize = numSize;
	}
	
	

}
