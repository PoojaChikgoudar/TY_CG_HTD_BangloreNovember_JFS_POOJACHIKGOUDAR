package com.capgemini.hybernet.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.hybernet.dto.CustomerBean;

public class CustomerDaoImpl implements CustomerDao {
	
	

	public boolean add(CustomerBean user) {
		EntityManager entitymanager=null;
		EntityTransaction transaction=null;
		//boolean flag=false;
		try{
			EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("Test");
		
			entitymanager=entitymanagerfactory.createEntityManager();
			transaction=entitymanager.getTransaction();
			transaction.begin();
			
			entitymanager.persist(user);
			//System.out.println("record saved");
			transaction.commit();
			//return true;
			//flag=true;
		}catch(Exception e) {
			e.printStackTrace();
			//transaction.rollback();
		}
	   // transaction.commit();
		entitymanager.close();


	
		return true;
	}

	public boolean modify(int customerId, CustomerBean bean) {
		// TODO Auto-generated method stub
		return false;
	}
	public List<CustomerBean> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean deleteUser(int customerId) {
		boolean flag1=false;
		try {
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entitymanagerfactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		CustomerBean customer=entityManager.find(CustomerBean.class, customerId);
		entityManager.remove(customer);
		entityManager.getTransaction().commit();
		//transaction.commit();
		entityManager.close();
		flag1=true;
		}
		catch(Exception e) {
			System.out.println("customerid doesnot exist");
		}
		return false;
	}

}
