package com.capgemini.reatilersmaintenancesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.reatilersmaintenancesystem.dao.ProductDao;
import com.capgemini.reatilersmaintenancesystem.dto.ProductInfo;

@Service
public class ProductServiceImpl implements ProductService {
 @Autowired
 ProductDao dao;
	
	@Override
	public boolean addProduct(ProductInfo product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

	@Override
	public ProductInfo getProduct(int id) {
		// TODO Auto-generated method stub
		return dao.getProduct(id);
	}

	@Override
	public List<ProductInfo> getAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAllProducts();
	}

	@Override
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(id);
	}

}
