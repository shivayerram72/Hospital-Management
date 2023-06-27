package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class TestDeleateHospital {

	public static void main(String[] args) {
		HospitalService hospitalService=new HospitalService();
	    hospitalService.delethospitalId(2);
	    

	}

}
