package com.capgemini.forestmanagement.dao;

import java.util.List;


import com.capgemini.forestrymanagement.bean.ProductBean;

public interface ProductDAO {
	public List<ProductBean> getAllProduct();
	public ProductBean getProduct(int productId);
	public boolean deleteProduct(int productId);
	public boolean addProduct(ProductBean bean);
	public boolean modify(int productId);
	
	

}
