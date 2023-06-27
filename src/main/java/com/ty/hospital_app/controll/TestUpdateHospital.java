package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class TestUpdateHospital {

	public static void main(String[] args) {
		HospitalService hospitalService=new HospitalService();
		Hospital hospital=hospitalService.getHospitalId(1);
		hospital.setName("Shiva");
		hospital.setWebsite("www.shiva.com");
		hospitalService.updateHospital(1, hospital);
	

	}

}
