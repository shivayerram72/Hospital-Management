package com.ks.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.Userdao;
import com.ty.hospital_app.dto.User;

public class Userdaoimp implements Userdao{

	public User saveuser(User user){
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		User user1=entityManager.find(User.class,user);
		if(user1 != null)
		{
			entityTransaction.begin();
			entityManager.persist(user);
			entityTransaction.commit();
			return user;
		}
		else
		{
			return null;
		}

	}

	public User getUserId(int uid){
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		User user=entityManager.find(User.class, uid);
		return user;
	}

	public boolean deletUserId(int uid) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		User user=entityManager.find(User.class, uid);
		if(user != null)
		{
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}

	}

	public User updateUserId(int uid, User user) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		User user1=entityManager.find(User.class, uid);
		if(user1 != null )
		{
			user1.setName(user.getName());
			user1.setEmail(user.getEmail());
			entityTransaction.begin();
			entityManager.merge(user1);
			entityTransaction.commit();
			return user1;

		}
		else
		{
			return null;
		}

	}

	public List<User> getAlluser() {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query =entityManager.createQuery("select s from User s");
		List<User> users=query.getResultList();
		return users;
	}

	public List<User> getUserByRole(String role) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query =entityManager.createQuery("select s from User s");
		List<User> users=query.getResultList();
		return users;

	}

}