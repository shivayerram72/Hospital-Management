package com.ty.hospital_app.service;

import com.ks.hospital_app.dao.imp.MedOrderdaoImp;
import com.ty.hospital_app.dto.MedOrder;

public class MedOrderService 
{
	public void saveMedOrder(int eid, MedOrder medorder) {
		MedOrderdaoImp medOrderdaoImp=new MedOrderdaoImp();
		MedOrder medOrder2=medOrderdaoImp.saveMedOrder(eid, medorder);
		if(medOrder2!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("data not saved");
		}
	}
	public MedOrder getMedOrderId(int mid) {
		MedOrderdaoImp medOrderdaoImp=new MedOrderdaoImp();
		MedOrder medOrder2=medOrderdaoImp.getMedOrderId(mid);
		if(medOrder2!=null) {
			return medOrder2;
		}
		else {
			return null;
		}
	}
	public void deletMedOrderId(int mid) {
		MedOrderdaoImp medOrderdaoImp=new MedOrderdaoImp();
		boolean flag=medOrderdaoImp.deletMedOrderId(mid);
		if(flag) {
			System.out.println("data deletaed");
		}
		else {
			System.out.println("not deleatd");
		}
	}
	public MedOrder updateMedOrder(int mid, MedOrder medorder) {
		MedOrderdaoImp medOrderdaoImp=new MedOrderdaoImp();
		MedOrder medOrder2=medOrderdaoImp.updateMedOrder(mid, medorder);
		if(medOrder2!=null) {
			return medOrder2;
		}
		else {
			return null;
		}

	}

}



