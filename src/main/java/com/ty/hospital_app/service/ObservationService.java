package com.ty.hospital_app.service;

import com.ks.hospital_app.dao.imp.Observationdaoimp;
import com.ty.hospital_app.dto.Observation;

public class ObservationService {

	public void saveObservation(int eid,Observation observation)
	{
		Observationdaoimp daoimp=new Observationdaoimp();
		Observation observation1=daoimp.saveObservation(eid,observation);
		if(observation1 !=null)
		{
			System.out.println("observation  saved");
		}
		else
		{
			System.out.println("unfortunatelty observation not saved");
		}
	}

	public Observation getObservationId(int oid)
	{
		Observationdaoimp observationdaoimp=new Observationdaoimp();
		Observation observation=observationdaoimp.getObservationId(oid);
		if(observation !=null)
		{
			return observation;
		}
		else
		{
			return null;
		}
	}
	public void deleteObservation(int oid)	{
		Observationdaoimp daoimp=new Observationdaoimp();
		boolean  flag=daoimp.deletObservationId(oid);
		if(flag)
		{
			System.out.println("Data deleted");
		}
		else
		{
			System.out.println("Data not deleted");
		}
	}
	public Observation updateObservation(int oid,Observation observation)
	{
		Observationdaoimp daoimp=new Observationdaoimp();
		Observation observation1=daoimp.updateObservationId(oid, observation);
		if(observation1 !=null)
		{
			return observation1;
		}
		else
		{
			return null;
		}
	}
}