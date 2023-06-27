package com.ty.hospital_app.dao;

import com.ty.hospital_app.dto.Hospital;

public interface Hospitaldao 
{
	public Hospital saveHospital(Hospital hospital);
	
	public Hospital getHospitalId(int hid);
	
	public boolean delethospitalId(int hid);
	
	public Hospital updateHospital(int hid,Hospital hospital);

}
