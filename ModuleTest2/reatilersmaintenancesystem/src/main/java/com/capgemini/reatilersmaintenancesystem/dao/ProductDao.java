package com.capgemini.reatilersmaintenancesystem.dao;

import java.util.List;

import com.capgemini.reatilersmaintenancesystem.dto.ProductInfo;

public interface ProductDao {
public boolean addProduct(ProductInfo product);
	
	public ProductInfo getProduct(int id);
	
	public List<ProductInfo> getAllProducts();
	
	public boolean deleteProduct(int id);
	
	
	
}
