package com.capgemini.reatilersmaintenancesystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.reatilersmaintenancesystem.dto.ProductInfo;


@Repository
public class ProductInfoDaoImpl implements ProductDao {
	@PersistenceUnit
	EntityManagerFactory factory;


	public boolean addProduct(ProductInfo product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	
	public ProductInfo getProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		ProductInfo product = manager.find(ProductInfo.class, id);
		return product;
	}

	
	public List<ProductInfo> getAllProducts() {
		EntityManager manager = factory.createEntityManager();
		String getall = "from ProductInfo";
		TypedQuery<ProductInfo> query = manager.createQuery(getall, ProductInfo.class);
		return query.getResultList();
	}

	
	public boolean deleteProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ProductInfo product = manager.find(ProductInfo.class, id);
		if (product != null) {
			transaction.begin();
			manager.remove(product);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}


	

	


}
