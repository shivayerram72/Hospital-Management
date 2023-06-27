package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class TestSaveHospital {

	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		HospitalService service = new HospitalService();
		hospital.setName("appolo");
		hospital.setWebsite("www.appolo.com");
		service.saveHospital(hospital);

	}

}
