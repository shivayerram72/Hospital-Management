package com.ks.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.Itemdao;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.dto.Item;

public class ItemdaoImp implements Itemdao{

	public Item saveItem(int mid, Item item) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item items=entityManager.find(Item.class, mid);
		if(items != null)
		{
			entityTransaction.begin();
			entityManager.persist(items);
			entityTransaction.commit();
			return items;
		}
		else
		{
			return null;
		}
	
			}

	public Item getItemId(int iid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Item item =entityManager.find(Item.class, iid);
		return item;
	}

	public boolean deletItemId(int iid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item item=entityManager.find(Item.class, iid);
		if(item != null)
		{
			entityTransaction.begin();
			entityManager.remove(item);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}

	}

	public Item updateItemId(int iid, Item item) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item items=entityManager.find(Item.class, iid);
		if(items!= null )
		{
			items.setName(item.getName());
			items.setQuantity(item.getQuantity());
			entityTransaction.begin();
			entityManager.merge(items);
			entityTransaction.commit();
			return item;

		}
		else
		{
			return null;
		}
	}


	public List<Item> getAllItems() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query =entityManager.createQuery("select s from Encounter s");
		List<Item> items=query.getResultList();
		return items;
	}

}
