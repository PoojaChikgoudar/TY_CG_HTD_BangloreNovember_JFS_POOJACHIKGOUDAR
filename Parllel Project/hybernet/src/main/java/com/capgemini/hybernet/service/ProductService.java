package com.capgemini.hybernet.service;

import java.util.List;

import com.capgemini.hybernet.dto.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	public boolean add(Product product);
    public boolean modify(int productId,Product bean);
	public boolean delete(int productId);

}
