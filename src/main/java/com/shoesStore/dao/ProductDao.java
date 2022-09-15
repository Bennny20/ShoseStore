package com.shoesStore.dao;

import com.shoesStore.entity.Product;
import com.shoesStore.model.productModel;

public interface ProductDao {
	
	public Product getProductByCode(String ProductCode);
	
	public boolean addProduct(productModel product);
	
	public boolean updateProduct(productModel product);
	
	public boolean deleteProduct(String ProductID);

}
