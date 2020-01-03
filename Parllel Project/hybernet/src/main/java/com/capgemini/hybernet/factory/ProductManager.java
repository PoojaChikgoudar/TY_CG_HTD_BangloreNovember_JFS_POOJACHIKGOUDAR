package com.capgemini.hybernet.factory;


import com.capgemini.hybernet.dao.ProductDao;
import com.capgemini.hybernet.dao.ProductDaoImpl;

import com.capgemini.hybernet.service.ProductService;
import com.capgemini.hybernet.service.ProductServiceImpl;

public class ProductManager {
	public static ProductDao instanceOfProductDaoImpl() {
		ProductDao dao= new ProductDaoImpl();
		return dao;
		
	}
	public static ProductService instanceOfProductService() {
		ProductService service=new ProductServiceImpl();
		 return service;
		 
		
	}

}
