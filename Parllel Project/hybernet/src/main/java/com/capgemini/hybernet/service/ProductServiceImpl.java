package com.capgemini.hybernet.service;

import java.util.List;

import com.capgemini.hybernet.dao.ProductDao;
import com.capgemini.hybernet.dto.Product;
import com.capgemini.hybernet.factory.ProductManager;


public class ProductServiceImpl implements ProductService {
	ProductDao dao=ProductManager.instanceOfProductDaoImpl();

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAllProducts();
	}

	public boolean add(Product product) {
		// TODO Auto-generated method stub
		return dao.add(product);
	}

	public boolean modify(int productId, Product bean) {
		// TODO Auto-generated method stub
		return dao.modify(productId, bean);
	}

	

	public boolean delete(int productId) {
		// TODO Auto-generated method stub
		return dao.delete(productId);
	}

}
