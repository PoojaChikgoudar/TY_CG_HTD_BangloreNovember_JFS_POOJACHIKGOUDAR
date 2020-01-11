package com.capgemini.reatilersmaintenancesystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.reatilersmaintenancesystem.dto.Authentication;
//import com.capgemini.reatilersmaintenancesystem.exception.ProductException;

import com.capgemini.reatilersmaintenancesystem.dto.UserInfo;
import com.capgemini.retailersmaintenanace.exception.InvalidCredentailsException;
@Repository
public class UserInfoDaoImpl implements UserInfoDao {
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean addUser(UserInfo user) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public UserInfo getUsers(int id) {
		EntityManager manager = factory.createEntityManager();
		UserInfo user = manager.find(UserInfo.class, id);
		return user;
	}

	@Override
	public List<UserInfo> getAllUsers() {
		EntityManager manager = factory.createEntityManager();
		String getall = "from UserInfo";
		TypedQuery<UserInfo> query = manager.createQuery(getall, UserInfo.class);
		return query.getResultList();
	}

	@Override	
	public boolean deleteUser(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		UserInfo user = manager.find(UserInfo.class, id);
		if (user != null) {
			transaction.begin();
			manager.remove(user);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}
	@Override
	public boolean modifyPassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		UserInfo user = manager.find(UserInfo.class, id);
		EntityTransaction transaction = manager.getTransaction();
		if (user != null) {
			transaction.begin();
			user.setPassword(password);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}
	@Override
	public boolean register(Authentication account) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(account);
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new InvalidCredentailsException("Account with same email already exists");
		}
	}

	@Override
	public Authentication login(Authentication credentials) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Authentication where email=:email";
		TypedQuery<Authentication> query = manager.createQuery(jpql, Authentication.class);
		query.setParameter("email", credentials.getEmail());
		try {
			Authentication account = query.getSingleResult();
			if (account.getPassword().equals(credentials.getPassword())) {
				return account;
			} else {
				System.out.println("here above valid");
				return null;
			}
		} catch (Exception e) {
			throw new InvalidCredentailsException("Account does not exist");
		}
	}




	


	
}


	
