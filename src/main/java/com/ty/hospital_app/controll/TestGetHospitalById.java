package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class TestGetHospitalById {
	public static void main(String[] args) {
		HospitalService hospitalService=new HospitalService();
		Hospital hospital=hospitalService.getHospitalId(1);
		System.out.println(hospital.getName());
		System.out.println(hospital.getWebsite());
		
	}

}
