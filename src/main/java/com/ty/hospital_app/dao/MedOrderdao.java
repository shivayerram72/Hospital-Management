package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.MedOrder;

public interface MedOrderdao {
	
	public MedOrder saveMedOrder(int eid,MedOrder medorder);
	
	public MedOrder getMedOrderId(int mid);
	
	public boolean deletMedOrderId(int mid);
	
	public MedOrder updateMedOrder(int mid,MedOrder medorder);
	
	public List<MedOrder> getAllMedOrder();
	
	public List<MedOrder> getMedOrderByDoctorname(String name);

}
