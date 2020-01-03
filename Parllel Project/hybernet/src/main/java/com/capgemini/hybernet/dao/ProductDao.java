package com.capgemini.hybernet.dao;

import java.util.List;

import com.capgemini.hybernet.dto.Product;


public interface ProductDao {
	public List<Product> getAllProducts();
	public boolean add(Product product);
    public boolean modify(int productId,Product bean);
	public boolean delete(int productId);

}
