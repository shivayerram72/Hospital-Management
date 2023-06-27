package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Observation;

public interface Observationdao {
	
	public Observation saveObservation(int eid,Observation observation);
	
	public  Observation getObservationId(int oid);
	
	public  boolean deletObservationId(int oid);
	
	public  Observation updateObservationId(int oid,Observation observation);
	
	public List<Observation> getAllObservation();
	
	public List<Observation> getObservationByDoctorName(String name);
	
	

}
