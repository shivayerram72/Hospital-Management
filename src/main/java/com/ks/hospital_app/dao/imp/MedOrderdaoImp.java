package com.ks.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.MedOrderdao;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.MedOrder;

public class MedOrderdaoImp implements MedOrderdao {
	
	public MedOrder saveMedOrder(int eid, MedOrder medorder)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if(encounter!= null)
		{
			entityTransaction.begin();
			entityManager.persist(medorder);
			entityTransaction.commit();
			return medorder;
		}
		else
		{
			return null;
		}
	}

	public MedOrder getMedOrderId(int mid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		MedOrder medorder=entityManager.find(MedOrder.class, mid);
		return medorder;
	}

	public boolean deletMedOrderId(int mid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MedOrder medorder=entityManager.find(MedOrder.class, mid);
		if(medorder != null)
		{
			entityTransaction.begin();
			entityManager.remove(medorder);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}


	 public MedOrder updateMedOrder(int mid, MedOrder medorder) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MedOrder medorder1=entityManager.find(MedOrder.class, mid);
		if(medorder1 != null )
		{
			medorder1.setDname(medorder.getDname());
			medorder1.setOrderDate(medorder.getOrderDate());
			entityTransaction.begin();
			entityManager.merge(medorder1);
			entityTransaction.commit();
			return medorder1;
		}
		else
		{
			return null;
		}
	}

	 public List<MedOrder> getAllMedOrder() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query =entityManager.createQuery("select s from Medorder s");
		List<MedOrder> medorders=query.getResultList();
		return medorders;
	}

	 public List<MedOrder> getMedOrderByDoctorname(String name) {
		
		return null;
	}


	
//	public MedOrder updateMedOrder(int mid, MedOrder medoredr) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public List<MedOrder> getAllMedOrder() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public List<MedOrder> getMedOrderByDoctorname(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
