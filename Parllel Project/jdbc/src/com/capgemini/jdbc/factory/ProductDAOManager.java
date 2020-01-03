package com.capgemini.jdbc.factory;


import com.capgemini.jdbc.dao.ProductDAO;
import com.capgemini.jdbc.dao.ProductDAOImpl;

import com.mysql.jdbc.services.ProductService;
import com.mysql.jdbc.services.ProductServiceImpl;

public class ProductDAOManager {
	public static ProductDAO instanceOfProductDAOImpl() {
		ProductDAO dao= new ProductDAOImpl();
		return dao;
		
	}
	public static ProductService instanceOfProductService() {
		 ProductService service=new ProductServiceImpl();
		 return service;
		 
		
	}

}
