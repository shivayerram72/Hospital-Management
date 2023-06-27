package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Person;

public interface Persondao {
	public Person savePerson(int eid,Person person);
	
	public Person getPesrsonId(int pid);
	 
	public boolean deletPersonId(int pid);
	
	public Person updatePersonId(int pid,Person person);
	
	public List<Person> getAllperson();
	
	public List<Person> getPersonByGender(String name);
	
	public List<Person> getPersonByAge(int age);
	
	public List<Person> getPersonByphno(long phno);

}
