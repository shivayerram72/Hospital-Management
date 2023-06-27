package com.ks.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.Addressdao;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;


public class AddressdaoImp implements Addressdao
{

	public Address saveAddress(int bid, Address adress) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch=entityManager.find(Branch.class, bid);
		if(branch != null)
		{
			entityTransaction.begin();
			entityManager.persist(adress);
			entityTransaction.commit();
			return adress;
		}
		else
		{
			return null;
		}
	
	}

	public Address getAddressId(int aid) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Address address=entityManager.find(Address.class, aid);
		return address;
	
	}

	public boolean deletadressId(int aid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Address adress=entityManager.find(Address.class, aid);
		if(adress != null)
		{
			entityTransaction.begin();
			entityManager.remove(adress);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}

	
	}

	public Address updateAdress(int aid, Address adress) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Address adress1=entityManager.find(Address.class, aid);
		if(adress1 != null )
		{
			adress1.setStreet(adress.getStreet());
			adress1.setState(adress.getState());
			entityTransaction.begin();
			entityManager.merge(adress1);
			entityTransaction.commit();
			return adress1;

		}
		else
		{
			return null;
		}
	}

	public List<Address> getAddressAll() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query =entityManager.createQuery("select s from Adress s");
		List<Address> adresses=query.getResultList();
		return adresses;
	}

	

	
}