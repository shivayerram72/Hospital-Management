package com.ty.hospital_app.service;

import com.ks.hospital_app.dao.imp.HospitaldaoImp;
import com.ty.hospital_app.dto.Hospital;

public class HospitalService {

	public void saveHospital(Hospital hospital) {

		HospitaldaoImp daoImp=new HospitaldaoImp();
		Hospital hospital1= daoImp.saveHospital(hospital);

		if(hospital1!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("unfortunetly data not saved");
		}

	}
	public Hospital getHospitalId(int hid) {
		HospitaldaoImp daoImp=new HospitaldaoImp();
		Hospital hospital1= daoImp.getHospitalId(hid);

		if(hospital1!=null) {
			return hospital1;
		}
		else {
			return null;
		}

	}
	public void delethospitalId(int hid) {
		HospitaldaoImp daoImp = new HospitaldaoImp();
		boolean flag=daoImp.delethospitalId(hid);
		if(flag) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("not deleated");
		}
	}
	public Hospital updateHospital(int hid, Hospital hospital)
	{
		HospitaldaoImp daoImp = new HospitaldaoImp();
		Hospital hospital1=daoImp.updateHospital(hid, hospital);
		if(hospital1 !=null) {
			return hospital1;
		}
		else {
			return null;
		}

	}






}
