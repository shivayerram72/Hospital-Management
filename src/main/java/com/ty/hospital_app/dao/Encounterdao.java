package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Encounter;

public interface Encounterdao {

	public Encounter saveEncounter(int bid,Encounter encounter);

	public Encounter getEncounterId(int eid);

	public boolean deletEncounterId(int eid);

	public Encounter updateEncounterId(int eid,Encounter encounter);
	
	public List<Encounter> getAllEncounter();


}
