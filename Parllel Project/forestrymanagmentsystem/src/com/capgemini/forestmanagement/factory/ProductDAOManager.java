package com.capgemini.forestmanagement.factory;


import com.capgemini.forestmanagement.dao.ProductDAO;
import com.capgemini.forestmanagement.dao.ProductDAOImpl;

public class ProductDAOManager {

	public static ProductDAO getForestDAO() {
		return new ProductDAOImpl();
		
	}

}
