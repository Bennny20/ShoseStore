package com.shoesStore.dao.impl;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.shoesStore.dao.ProductDao;
import com.shoesStore.entity.Product;
import com.shoesStore.model.productModel;

public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Product getProductByCode(String ProductCode) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "SELECT PRODUCT FROM Products WHERE PRODUCT.ProductCode = :CODE";
		Query<Product> query = session.createQuery(hql);
		query.setParameter("CODE", ProductCode);
		Product product_ = (Product) query.uniqueResult();
		return product_;
	}

	@Override
	public boolean addProduct(productModel product) {
		boolean isInserted = false;
		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(product);
			isInserted = true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public boolean updateProduct(productModel product) {
		boolean isUpdated = false;
		try {
			Session session = sessionFactory.getCurrentSession();
			productModel product_ = session.get(productModel.class, product.getProductID());
			product_.setBrand_Model(product.getBrand_Model());
			product_.setBrandName(product.getBrandName());
			product_.setImage(product.getImage());
			product_.setPrice(product.getPrice());
			session.update(product);
			isUpdated = true;		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return isUpdated;
	}

	@Override
	public boolean deleteProduct(String ProductID) {
		boolean isDeleted = false;
		try {
			Session session = sessionFactory.getCurrentSession();
			productModel product_ = session.get(productModel.class, ProductID);
			session.delete(product_);
			isDeleted = true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

}
