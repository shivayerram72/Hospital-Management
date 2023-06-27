package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Address;

public interface Addressdao {
	
	public Address saveAddress(int bid,Address address);
	
	public Address getAddressId(int aid);
	
	public boolean deletadressId(int aid);
	
	public Address updateAdress(int aid,Address address);
	
	public List<Address> getAddressAll();

}
