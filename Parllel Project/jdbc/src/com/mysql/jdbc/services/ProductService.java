package com.mysql.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.ProductBean;

public interface ProductService {
	public List<ProductBean> getAllProducts();
	public boolean add(ProductBean user);
    public boolean modify(int productId,ProductBean bean);
	boolean delete(int productId);
}
