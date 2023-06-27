package com.ty.hospital_app.service;

import com.ks.hospital_app.dao.imp.EncounterdaoImpl;
import com.ty.hospital_app.dto.Encounter;

public class EncounterService {
	public void saveEncounter(int bid, Encounter encounter) {
		EncounterdaoImpl encounterdaoImpl=new EncounterdaoImpl();
		Encounter encounter2=encounterdaoImpl.saveEncounter(bid, encounter);
		if(encounter2!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("unfortunetly data not saved");
		}
		
	}
	public Encounter getEncounterId(int eid) {
		EncounterdaoImpl encounterdaoImpl=new EncounterdaoImpl();
		Encounter encounter=encounterdaoImpl.getEncounterId(eid);
		return encounter;
	}
	public void deletEncounterId(int eid) {
		EncounterdaoImpl encounterdaoImpl=new EncounterdaoImpl();
		boolean flag= encounterdaoImpl.deletEncounterId(eid);
		if(flag) {
			System.out.println("data delated");
		}
		else {
			System.out.println("data not deleated");
		}
		
	}
	public Encounter updateEncounterId(int eid, Encounter encounter) {
		EncounterdaoImpl encounterdaoImpl=new EncounterdaoImpl();
		Encounter encounter2=encounterdaoImpl.updateEncounterId(eid, encounter);
		if(encounter2!=null) {
			return encounter2;
		}
		else {
			return null;
		}
	}

}
