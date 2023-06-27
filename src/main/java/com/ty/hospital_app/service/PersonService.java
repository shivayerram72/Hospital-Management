package com.ty.hospital_app.service;

import com.ks.hospital_app.dao.imp.PersondaoImp;
import com.ty.hospital_app.dto.Person;

public class PersonService {
	
	public Person savePerson(int eid,Person person) {
		PersondaoImp persondaoImp=new PersondaoImp();
		Person person2=persondaoImp.savePerson(eid, person);
		if(person2!=null) {
			return person2;
		}
		else {
			return null;
		}
		
	}
	public Person getPesrsonId(int pid) {
		PersondaoImp persondaoImp=new PersondaoImp();
		Person person=persondaoImp.getPesrsonId(pid);
		if(person!=null) {
			return person;
		}
		else {
			return null;
		}
	}
	public void deletPersonId(int pid) {
		PersondaoImp persondaoImp=new PersondaoImp();
		boolean flag=persondaoImp.deletPersonId(pid);
		if(flag) {
			System.out.println("data deletaed");
		}
		else {
			System.out.println("not deleated");
		}
		
	}
	public Person updatePersonId(int pid,Person person) {
		PersondaoImp persondaoImp=new PersondaoImp();
		Person person2=persondaoImp.updatePersonId(pid, person);
		if(person2!=null) {
			return person2;
		}
		else {
			return null;
		}
	}

}
