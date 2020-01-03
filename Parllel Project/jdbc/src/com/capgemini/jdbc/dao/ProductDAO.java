package com.capgemini.jdbc.dao;


import java.util.List;


import com.capgemini.jdbc.bean.ProductBean;
public interface ProductDAO {
	public List<ProductBean> getAllProducts();
	public boolean add(ProductBean user);
    public boolean modify(int productId,ProductBean bean);
	public boolean delete(int productId);
	


}
